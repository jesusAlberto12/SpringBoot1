package com.example.demo.interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Usuario;

public interface iUsuario extends JpaRepository<Usuario, Integer>{

	
	Usuario findByNombre(String nombre);
	Usuario findById(int id);
	Usuario findByLogin(String login);

 
}
