package com.intranet.intranet.services.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Directivo;
import com.intranet.intranet.services.IDirectivoService;

@Service
public class DirectivoServiceImpl implements IDirectivoService {

    @Override
    public List<Directivo> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void guardar(Directivo directivo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Directivo buscarPorId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Directivo> findAllByQuery(String palabraClave) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
