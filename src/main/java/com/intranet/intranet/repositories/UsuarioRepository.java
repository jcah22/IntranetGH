package com.intranet.intranet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intranet.intranet.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    
}
