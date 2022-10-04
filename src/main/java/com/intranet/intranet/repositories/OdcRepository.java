package com.intranet.intranet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.intranet.intranet.models.Odc;

@Repository
public interface OdcRepository extends JpaRepository<Odc,Long> {

    @Query(

        value = "SELECT * FROM odc where odc.requisicion_id=:filtro", nativeQuery = true
        
        )

    List<Odc> searchFiltroRepository(Long  filtro);
    
}
