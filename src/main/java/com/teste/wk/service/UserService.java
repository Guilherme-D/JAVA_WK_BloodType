package com.teste.wk.service;

import com.teste.wk.Models.Users;
import com.teste.wk.Models.responses.*;

import java.util.List;

public interface UserService {
    List<Users> createUsers(List<Users> users);
    List<OrderByStateResponse> findAllGroupByEstadoId();
    List<FaixaResponse> findByFaixa();
    List<ObeseResponse> findObeseBySex();
    List<AgeByBloodResponse> findAvgAgeByBlood();
    List<ReceiversList> receiversList();
}
