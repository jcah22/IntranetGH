package com.intranet.intranet.services.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Usuario;
import com.intranet.intranet.services.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Override
    public List<Usuario> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void guardar(Usuario usuario) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Usuario buscarPorId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Usuario> findAllByQuery(String palabraClave) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
