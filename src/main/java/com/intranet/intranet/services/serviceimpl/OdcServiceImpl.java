package com.intranet.intranet.services.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Odc;
import com.intranet.intranet.repositories.OdcRepository;
import com.intranet.intranet.services.IOdcService;

@Service
public class OdcServiceImpl implements IOdcService{

    @Autowired
    private OdcRepository repository;

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
    public List<Odc> findAllByQuery(Long palabraClave) {
        // TODO Auto-generated method stub
        return repository.getOdcByRequisicionById(palabraClave);
    }

  
    
}
