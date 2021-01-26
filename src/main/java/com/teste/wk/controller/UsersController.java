package com.teste.wk.controller;

import com.teste.wk.Models.Users;
import com.teste.wk.Models.requests.OrderByStateRequest;
import com.teste.wk.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/candidates")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/count")
    @ApiOperation(value = "Candidatos por estado")
    public ResponseEntity<List<OrderByStateRequest>> loadFile(){

        return ResponseEntity.ok().body(this.userService.findAllGroupByEstadoId());
    }
}
