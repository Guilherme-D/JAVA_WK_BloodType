package com.teste.wk.controller;

import com.teste.wk.Models.responses.*;
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

    @GetMapping(path = "/states")
    @ApiOperation(value = "Candidatos por estado")
    public ResponseEntity<List<OrderByStateResponse>> porEstado(){

        return ResponseEntity.ok().body(this.userService.findAllGroupByEstadoId());
    }

    @GetMapping(path = "/faixa")
    @ApiOperation(value = "IMC médio por faixa de idade")
    public ResponseEntity<List<FaixaResponse>> faixa(){

        return ResponseEntity.ok().body(this.userService.findByFaixa());
    }

    @GetMapping(path = "/obese")
    @ApiOperation(value = "Percentual de obesos por sexo")
    public ResponseEntity<List<ObeseResponse>> obesos(){

        return ResponseEntity.ok().body(this.userService.findObeseBySex());
    }

    @GetMapping(path = "/receivers-list")
    @ApiOperation(value = "Lista de receptores por tipo sanguineo")
    public ResponseEntity<List<ReceiversList>> receivers(){

        return ResponseEntity.ok().body(this.userService.receiversList());
    }

    @GetMapping(path = "/avg-by-blood")
    @ApiOperation(value = "Média de idade por tipo sanguineo")
    public ResponseEntity<List<AgeByBloodResponse>> mediaPorTipo(){

        return ResponseEntity.ok().body(this.userService.findAvgAgeByBlood());
    }
}
