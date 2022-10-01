package com.intranet.intranet.services;

import java.util.List;

import com.intranet.intranet.models.Area;

public interface IAreaService {

    public List<Area> listarTodos();
	public void guardar(Area area);
	public Area buscarPorId(Long  id);
	public void eliminar(Long id);
	public List<Area> findAllByQuery(String palabraClave);
    
}
