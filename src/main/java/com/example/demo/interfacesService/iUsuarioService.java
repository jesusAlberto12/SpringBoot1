package com.example.demo.interfacesService;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.example.demo.modelo.Usuario;

public interface iUsuarioService {
	
	
	
	public List<Usuario>listar();
	public Optional<Usuario>listarId(int id);
	public int save(Usuario p);
	public void delete(int id);
	//public  void update(Usuario p);
	//@Query("select c from Usuario c where c.login=login; ")
	public Optional<Usuario> findByLogin2(String login);
	
	//public Optional<Usuario>listarLogin(String login);

}


