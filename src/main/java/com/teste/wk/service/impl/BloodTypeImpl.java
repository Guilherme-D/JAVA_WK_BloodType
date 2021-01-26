package com.teste.wk.service.impl;

import com.teste.wk.Models.BloodType;
import com.teste.wk.repository.BloodTypeRepository;
import com.teste.wk.service.BloodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloodTypeImpl implements BloodTypeService {

    @Autowired
    private BloodTypeRepository bloodTypeRepository;
    @Override
    public BloodType findByBloobType(String type) {
        return this.bloodTypeRepository.findByTipo(type);
    }
}
