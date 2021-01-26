package com.teste.wk.service.impl;

import com.teste.wk.Models.Users;
import com.teste.wk.Models.requests.OrderByStateRequest;
import com.teste.wk.repository.UserRepository;
import com.teste.wk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<OrderByStateRequest> findAllGroupByEstadoId() {
        return this.userRepository.findAllGroupByEstado();
    }

    @Override
    public List<Users> createUsers(List<Users> users) {
        return Optional.of(this.userRepository.saveAll(users))
                .orElseThrow(() -> new IllegalArgumentException("Não foi possível cadastrar candidato"));
    }
}
