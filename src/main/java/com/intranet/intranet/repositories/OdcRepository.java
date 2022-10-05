package com.intranet.intranet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intranet.intranet.models.Odc;

@Repository
public interface OdcRepository extends JpaRepository<Odc,Long> {
    
}
