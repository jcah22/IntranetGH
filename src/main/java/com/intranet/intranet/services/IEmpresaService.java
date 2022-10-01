package com.intranet.intranet.services;

import java.util.List;

import com.intranet.intranet.models.Empresa;

public interface IEmpresaService {

    public List<Empresa> listarTodos();
	public void guardar(Empresa empresa);
	public Empresa buscarPorId(Long  id);
	public void eliminar(Long id);
	public List<Empresa> findAllByQuery(String palabraClave);
    
}
