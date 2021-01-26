package com.teste.wk.service.impl;

import com.teste.wk.Models.Cities;
import com.teste.wk.Models.States;
import com.teste.wk.repository.CitiesRepository;
import com.teste.wk.repository.StatesRepository;
import com.teste.wk.service.CitiesService;
import com.teste.wk.service.StatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitiesServiceImpl implements CitiesService {

    @Autowired
    CitiesRepository citiesRepository;
    @Override
    public Cities findByCity(String city) {
        return this.citiesRepository.findByCidade(city);
    }

    @Override
    public Cities createCity(Cities city) {
        return this.citiesRepository.save(city);
    }
}
