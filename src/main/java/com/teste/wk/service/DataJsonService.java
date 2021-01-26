package com.teste.wk.service;

import com.teste.wk.Models.Users;

import java.util.List;

public interface DataJsonService {
    List<Users> loadFile(String file);
}
