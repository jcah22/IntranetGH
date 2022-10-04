package com.intranet.intranet.services;

import java.util.List;

import com.intranet.intranet.models.Status;

public interface IStatusService {

    public List<Status> listarTodos();
	public void guardar(Status status);
	public Status buscarPorId(Long  id);
	public void eliminar(Long id);
	public List<Status> findAllByQuery(String palabraClave);
    
}
