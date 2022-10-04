package com.intranet.intranet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intranet.intranet.models.Cfdi;
@Repository
public interface CfdiRepository extends JpaRepository<Cfdi , Long> {
    
}
