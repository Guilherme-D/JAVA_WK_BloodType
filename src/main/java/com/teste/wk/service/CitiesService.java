package com.teste.wk.service;

import com.teste.wk.Models.Cities;

public interface CitiesService {
    Cities findByCity(String city);
    Cities createCity(Cities city);
}
