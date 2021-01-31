package com.teste.wk.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teste.wk.Models.*;
import com.teste.wk.mapper.DataJsonMapper;
import com.teste.wk.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.RollbackException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DataJsonServiceImpl implements DataJsonService {

    @Autowired
    private UserService userService;
    @Autowired
    private BloodTypeService bloodTypeService;
    @Autowired
    private StatesService statesService;
    @Autowired
    private CitiesService citiesService;

    @Override
    public List<Users> loadFile(String file) {

        final File data = new File(file);
        final ObjectMapper mapper = new ObjectMapper();
        final TypeReference<List<DataJson>> typeReference = new TypeReference<List<DataJson>>(){};
        try {
            List<DataJson> users = mapper.readValue(data,typeReference);


            List<Users> usersList = users.stream().
                    map(dataJson -> {
                        BloodType bloodType = this.bloodTypeService.findByBloobType(dataJson.getTipo_sanguineo());
                        States states = this.statesService.findByUf(dataJson.getEstado());
                        Cities city = Optional.ofNullable(this.citiesService.findByCity(dataJson.getCidade()))
                                .orElseGet(() -> this.citiesService.createCity(new Cities(dataJson.getCidade())));

                        return DataJsonMapper.toUser(dataJson, bloodType, city, states);
                    }).
                    collect(Collectors.toList());

            return Optional.of(this.userService.createUsers(usersList))
                    .orElseThrow(() -> new RollbackException("Não foi possível salvar lista de dados"));
        } catch (IOException e){
            System.out.println("Unable to save users: " + e.getMessage());
        }

        return null;
    }

}
