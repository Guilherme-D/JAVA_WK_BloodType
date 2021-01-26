package com.teste.wk.mapper;

import com.teste.wk.Models.*;
import com.teste.wk.service.AddressService;
import com.teste.wk.service.BloodTypeService;
import com.teste.wk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

public class DataJsonMapper {

    public static Users toUser(DataJson dataJson, BloodType bloodType, Cities city, States state){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse(dataJson.getData_nasc(), formatter);

        //List<Address> address = Collections.singletonList(
        Address address = new Address(
                dataJson.getEndereco(),
                Integer.parseInt(dataJson.getNumero()),
                dataJson.getBairro(),
                city,
                state
        );

        char sex = 'm';
        if(dataJson.getSexo().equalsIgnoreCase("Feminino")){
            sex = 'f';
        }


        return new Users(
                dataJson.getNome(),
                dataJson.getCpf(),
                dataJson.getRg(),
                date,
                sex,
                dataJson.getMae(),
                dataJson.getPai(),
                dataJson.getEmail(),
                dataJson.getCep(),
                dataJson.getTelefone_fixo(),
                dataJson.getCelular(),
                dataJson.getAltura(),
                dataJson.getPeso(),
                bloodType,
                address
                );

    }
}
