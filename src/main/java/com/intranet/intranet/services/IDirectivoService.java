package com.intranet.intranet.services;

import java.util.List;

import com.intranet.intranet.models.Directivo;

public interface IDirectivoService {

    public List<Directivo> listarTodos();
	public void guardar(Directivo directivo);
	public Directivo buscarPorId(Long  id);
	public void eliminar(Long id);
	public List<Directivo> findAllByQuery(String palabraClave);
    
}
