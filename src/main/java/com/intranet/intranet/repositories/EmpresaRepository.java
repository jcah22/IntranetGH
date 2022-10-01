package com.intranet.intranet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intranet.intranet.models.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Long>{
    
}
