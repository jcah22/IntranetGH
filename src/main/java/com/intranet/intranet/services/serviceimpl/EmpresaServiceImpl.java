package com.intranet.intranet.services.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Empresa;
import com.intranet.intranet.services.IEmpresaService;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Override
    public List<Empresa> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void guardar(Empresa empresa) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Empresa buscarPorId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Empresa> findAllByQuery(String palabraClave) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
