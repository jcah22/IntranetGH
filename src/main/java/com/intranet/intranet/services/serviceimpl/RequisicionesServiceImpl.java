package com.intranet.intranet.services.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Requisiciones;
import com.intranet.intranet.repositories.RequisicionRepository;
import com.intranet.intranet.services.IRequisicionesService;

@Service
public class RequisicionesServiceImpl implements IRequisicionesService{

    @Autowired
    private RequisicionRepository reqRepository;

    @Override
    public List<Requisiciones> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void guardar(Requisiciones requisiciones) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Requisiciones buscarPorId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Requisiciones> findAllByQuery(String palabraClave) {
        // TODO Auto-generated method stub
        return reqRepository.searchFiltroRepository(palabraClave);
    }
    
}
