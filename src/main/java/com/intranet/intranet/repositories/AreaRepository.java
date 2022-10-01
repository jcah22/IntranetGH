package com.intranet.intranet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intranet.intranet.models.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area,Long>{
    
}
