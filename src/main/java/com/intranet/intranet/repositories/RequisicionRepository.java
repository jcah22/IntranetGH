package com.intranet.intranet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.intranet.intranet.models.Requisiciones;


@Repository
public interface RequisicionRepository  extends JpaRepository<Requisiciones,Long>{

    @Query(

        value = "select * from requisiciones WHERE requisiciones.codigo LIKE :filtro%", nativeQuery = true)
        
        List<Requisiciones> searchFiltroRepository(String filtro);
    
}
