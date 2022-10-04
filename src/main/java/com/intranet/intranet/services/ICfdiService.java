package com.intranet.intranet.services;

import java.util.List;

import com.intranet.intranet.models.Cfdi;

public interface ICfdiService {

    public List<Cfdi> listarTodos();
	public void guardar(Cfdi cfdi);
	public Cfdi buscarPorId(Long  id);
	public void eliminar(Long id);
	public List<Cfdi> findAllByQuery(String palabraClave);
    
}
