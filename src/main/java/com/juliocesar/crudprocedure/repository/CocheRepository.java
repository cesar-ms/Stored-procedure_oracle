package com.juliocesar.crudprocedure.repository;

import com.juliocesar.crudprocedure.entity.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public  interface  CocheRepository  extends JpaRepository<Coche, Integer>{

    @Query(value = "{call lista_coches()}", nativeQuery = true)
    List<Coche> listaProcedure();


    @Query(value = "{call id_coche(:idIn)}", nativeQuery = true)
    Optional<Coche> idCoche(@Param(":idIn") int idIn);
}
