package com.juliocesar.crudprocedure.service;


import com.juliocesar.crudprocedure.entity.Coche;
import com.juliocesar.crudprocedure.repository.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CocheService {

    @Autowired
    CocheRepository cocheRepository;

    public List<Coche> lista(){
        return cocheRepository.findAll();
    }

    public Optional<Coche> getById(int id) {
        return cocheRepository.idCoche(id);
    }
}
