package com.intranet.intranet.services;

import java.util.List;

import com.intranet.intranet.models.Usuario;

public interface IUsuarioService {

    public List<Usuario> listarTodos();
	public void guardar(Usuario usuario);
	public Usuario buscarPorId(Long  id);
	public void eliminar(Long id);
	public List<Usuario> findAllByQuery(String palabraClave);
    
    
}
