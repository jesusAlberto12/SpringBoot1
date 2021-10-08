package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.iUsuario;
import com.example.demo.interfaces.iUsuarioCrud;
import com.example.demo.interfacesService.iUsuarioService;
import com.example.demo.modelo.Usuario;

@Service
public class usuarioService implements iUsuarioService {
	
	@Autowired
	private iUsuarioCrud dat;
	@Autowired
	private iUsuario data;
	
	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return (List<Usuario>)dat.findAll();
	}




	@Override
	public int save(Usuario p) {
		int res=0;
		Usuario usuario=dat.save(p);
		if(!usuario.equals(null)) {
			res=1;
		}
		return 0;
	}
	
	
	@Override
	public void delete(int id) {
		dat.deleteById(id);

	}

	@Override
	public Optional<Usuario> listarId(int id) {
	
		return dat.findById(id);
	}




	@Override
	public Optional<Usuario> findByLogin2(String login) {
		// TODO Auto-generated method stub
		return dat.findByLogin2(login);
	}




	



	

















}
