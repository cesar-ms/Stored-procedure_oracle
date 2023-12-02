package com.juliocesar.crudprocedure.controller;

import com.juliocesar.crudprocedure.entity.Coche;
import com.juliocesar.crudprocedure.service.CocheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coche")
public class CocheController {

    @Autowired
    CocheService cocheService;

    @GetMapping("/lista")
    public ResponseEntity<List<Coche>> lista(){
        List<Coche> lista = cocheService.lista();
        return new ResponseEntity(lista, HttpStatus.OK);
    }

    @GetMapping("/verid/{id}")
    public ResponseEntity<Coche> verId(@PathVariable("id") int id){
        Optional<Coche> coche = cocheService.getById(id);
        return new ResponseEntity(coche,HttpStatus.OK);
    }

}
