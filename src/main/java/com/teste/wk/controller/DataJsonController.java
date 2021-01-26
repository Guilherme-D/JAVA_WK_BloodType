package com.teste.wk.controller;

import com.teste.wk.Models.Users;
import com.teste.wk.service.DataJsonService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/data")
public class DataJsonController {

    @Autowired
    DataJsonService dataJsonService;

    @PostMapping(path = "/load")
    @ApiOperation(value = "Carregar arquivo json")
    public ResponseEntity<List<Users>> loadFile(
            @ApiParam(value = "Caminho do arquivo a ser carregado")
            @Valid @RequestBody String file){

        return ResponseEntity.ok().body(this.dataJsonService.loadFile(file));
    }
}
