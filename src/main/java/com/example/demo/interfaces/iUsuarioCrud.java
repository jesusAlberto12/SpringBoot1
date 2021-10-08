package com.example.demo.interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Usuario;


@Repository
public interface iUsuarioCrud extends  CrudRepository<Usuario, Integer> {

	@Query("select c from Usuario c where c.login='login' ")
	public Optional<Usuario> findByLogin2(String login);

}
