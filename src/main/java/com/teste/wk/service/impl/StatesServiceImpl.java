package com.teste.wk.service.impl;

import com.teste.wk.Models.States;
import com.teste.wk.repository.StatesRepository;
import com.teste.wk.service.StatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatesServiceImpl implements StatesService {

    @Autowired
    StatesRepository statesRepository;
    @Override
    public States findByUf(String state) {
        return this.statesRepository.findByUf(state);
    }
}
