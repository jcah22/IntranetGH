package com.intranet.intranet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intranet.intranet.models.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status,Long>{
    
}
