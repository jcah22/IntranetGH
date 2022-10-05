package com.intranet.intranet.services;

import java.util.List;

import com.intranet.intranet.models.Odc;

public interface IOdcService {

    public List<Odc> listarTodos();
	public void guardar(Odc odc);
	public Odc buscarPorId(Long  id);
	public void eliminar(Long id);
	public List<Odc> findAllByQuery(String palabraClave);
    
}
