package com.intranet.intranet.services;

import java.util.List;

import com.intranet.intranet.models.Requisiciones;

public interface IRequisicionesService {

    public List<Requisiciones> listarTodos();
	public void guardar(Requisiciones requisiciones);
	public Requisiciones buscarPorId(Long  id);
	public void eliminar(Long id);
	public List<Requisiciones> findAllByQuery(String palabraClave);
    
}
