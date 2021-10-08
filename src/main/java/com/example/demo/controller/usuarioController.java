package com.example.demo.controller;

import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaces.iUsuario;
import com.example.demo.interfaces.iUsuarioCrud;
import com.example.demo.interfacesService.iUsuarioService;
import com.example.demo.modelo.Usuario;
@Controller
@RequestMapping
public class usuarioController {
	@Autowired
	private iUsuarioService service;
	@Autowired
	private iUsuario usuariointerface;
	
	private String contrasena;
	private int activar;

	@GetMapping({"/","/login"})
	public String index() {
		
		return "index1";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios =service.listar();
		model.addAttribute("usuarios", usuarios);
		return"index";
	}



	@GetMapping("/new")
	public String agregar(Model model) {
	
		model.addAttribute("usuario", new Usuario());
		return "form";
	}


	@PostMapping("/save")
	public String save(@Validated Usuario p , Model model) {
		
		System.out.print("id " +p.getId());
		Date date= new Date();
		Calendar cal= Calendar.getInstance ();
		cal.add(Calendar.MONTH, 1);
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		contrasena= bCryptPasswordEncoder.encode(p.getPassword());
		p.setCliente(1);
		
		p.setFechaAlta(date);
		date=cal.getTime();
		p.setFechaModificacion(date);
		
		p.setPassword(contrasena);
		service.save(p);
	return "redirect:/listar";
	}

	@GetMapping("/editar/{id}")
	
	public String editar(@PathVariable int id, Model model) {
	
		Optional<Usuario> usuario=service.listarId(id);
		model.addAttribute("usuario",usuario);
		return"form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
	
	@Autowired
	private iUsuario dat;
	
	@GetMapping("/CambiarContrasena")
	public String cambiarContrar(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String loginNomre = auth.getName();
	  	Optional<Usuario> usuario= service.findByLogin2(loginNomre);
		model.addAttribute("usuario",usuario);
		      System.out.print("nombre " +loginNomre);
		return "contrasena";
	}
	


	@PostMapping("/editarContrasena")
	public String editarContra( @Validated Usuario p , Model mode) {
		//Optional<Usuario> usuario=service.listarId(id);
		//model.addAttribute("usuario",usuario);
		service.save(p);
		return "redirect:/listar";
	
	}

	public String getContrasena() {
		return contrasena;
	}



	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getActivar() {
		return activar;
	}

	public void setActivar(int activar) {
		this.activar = activar;
	}
	
	
}
