package com.teste.wk.service.impl;

import com.teste.wk.Models.Users;
import com.teste.wk.Models.responses.*;
import com.teste.wk.repository.UserRepository;
import com.teste.wk.service.BloodTypeService;
import com.teste.wk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BloodTypeService bloodTypeService;

    @Override
    public List<OrderByStateResponse> findAllGroupByEstadoId() {
        return this.userRepository.findAllGroupByEstado();
    }

    @Override
    public List<FaixaResponse> findByFaixa() {
        return this.userRepository.findAllByFaixa()
                .stream()
                .map(obj ->
                        new FaixaResponse(obj[0].toString(), Double.valueOf(obj[1].toString()))
                )
                .collect(Collectors.toList());
    }

    @Override
    public List<ObeseResponse> findObeseBySex() {
        return this.userRepository.findAllObeseBySex()
                .stream()
                .map(obj -> {
                            if(null == obj[1]){
                                return new ObeseResponse(obj[0].toString().charAt(0), Double.valueOf(obj[2].toString()));
                            }else{
                                return new ObeseResponse(obj[0].toString().charAt(0), Double.valueOf(obj[1].toString()));
                            }
                        }
                )
                .collect(Collectors.toList());
    }

    @Override
    public List<AgeByBloodResponse> findAvgAgeByBlood() {
        return this.userRepository.avgAgeByBlood()
                .stream()
                .map(obj ->  new AgeByBloodResponse(obj[0].toString(), Double.valueOf(obj[1].toString()))
                )
                .collect(Collectors.toList());
    }

    @Override
    public List<ReceiversList> receiversList() {

        List<Receivers> receivers = this.userRepository.receiversList();

        List<ReceiversList> receiversListList = new ArrayList<>();


        receivers.forEach( r -> {
            final Long[] total = {0L};
            List<Receivers> newList = new ArrayList<>();

            String tipo = r.getTipo();

            ArrayList<String> recebeDe = new ArrayList<>(
                    Arrays.asList(this.bloodTypeService.findByBloobType(r.getTipo())
                    .getRecebeDe().split(", ")));

            recebeDe.forEach(rde->{
                receivers.forEach(x -> {
                    if(rde.equalsIgnoreCase(x.getTipo())){
                        Long quantidade = x.getQuantidade();
                        if(rde.equalsIgnoreCase(tipo)){
                            quantidade--;
                        }
                        total[0] += quantidade;
                        newList.add(new Receivers(rde,quantidade));
                    }
                });
            });

            receiversListList.add(new ReceiversList(tipo, total[0], newList));

        });
        return receiversListList;
    }

    @Override
    public List<Users> createUsers(List<Users> users) {
        return Optional.of(this.userRepository.saveAll(users))
                .orElseThrow(() -> new IllegalArgumentException("Não foi possível cadastrar candidato"));
    }


}
