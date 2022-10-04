package com.intranet.intranet.services.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intranet.intranet.models.Status;
import com.intranet.intranet.services.IStatusService;

@Service
public class StatusServiceImpl implements IStatusService {

    @Override
    public List<Status> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void guardar(Status status) {
        // TODO Auto-generated method stub

    }

    @Override
    public Status buscarPorId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Status> findAllByQuery(String palabraClave) {
        // TODO Auto-generated method stub
        return null;
    }

}
