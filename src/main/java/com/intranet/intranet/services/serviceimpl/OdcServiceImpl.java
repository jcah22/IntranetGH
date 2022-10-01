package com.intranet.intranet.services.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Odc;
import com.intranet.intranet.services.IOdcService;

@Service
public class OdcServiceImpl implements IOdcService{

    @Override
    public List<Odc> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void guardar(Odc odc) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Odc buscarPorId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Odc> findAllByQuery(String palabraClave) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
