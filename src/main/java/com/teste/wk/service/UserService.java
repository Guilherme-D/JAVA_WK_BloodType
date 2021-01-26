package com.teste.wk.service;

import com.teste.wk.Models.Users;
import com.teste.wk.Models.requests.OrderByStateRequest;

import java.util.List;

public interface UserService {
    List<OrderByStateRequest> findAllGroupByEstadoId();
    List<Users> createUsers(List<Users> users);
}
