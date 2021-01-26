package com.teste.wk.service;

import com.teste.wk.Models.Users;

import java.util.List;

public interface UserService {
    Users findByCpf(String cpf);
    List<Users> createUsers(List<Users> users);
}
