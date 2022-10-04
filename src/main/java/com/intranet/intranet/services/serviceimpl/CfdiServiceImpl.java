package com.intranet.intranet.services.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Cfdi;
import com.intranet.intranet.services.ICfdiService;

@Service
public class CfdiServiceImpl implements ICfdiService{

    @Override
    public List<Cfdi> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void guardar(Cfdi cfdi) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Cfdi buscarPorId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Cfdi> findAllByQuery(String palabraClave) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
