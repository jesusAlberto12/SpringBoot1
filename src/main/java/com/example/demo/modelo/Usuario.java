package com.example.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario" )
public class Usuario {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int id;
	
	private String login;
	
	private String password;
	private String nombre;
	private float cliente;
	private String email;
	private Date fechaAlta;
	private Date fechaBaja;
	private char status;
	private float intentos;
	private Date fechaRevocado;
	private Date fechaVigencia;
	private Integer noacceso;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaModificacion;
	public Usuario() {
		//super();
	}
	public Usuario(int id ,String login, String password, String nombre, float cliente, String email, Date fechaAlta,
			Date fechaBaja, char status, float intentos, Date fechaRevocado, Date fechaVigencia, Integer noacceso,
			String apellidoPaterno, String apellidoMaterno, Date fechaModificacion) {
		super();
		this.id=id;
		this.login = login;
		this.password = password;
		this.nombre = nombre;
		this.cliente = cliente;
		this.email = email;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.status = status;
		this.intentos = intentos;
		this.fechaRevocado = fechaRevocado;
		this.fechaVigencia = fechaVigencia;
		this.noacceso = noacceso;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaModificacion = fechaModificacion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getCliente() {
		return cliente;
	}
	public void setCliente(float cliente) {
		this.cliente = cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public float getIntentos() {
		return intentos;
	}
	public void setIntentos(float intentos) {
		this.intentos = intentos;
	}
	public Date getFechaRevocado() {
		return fechaRevocado;
	}
	public void setFechaRevocado(Date fechaRevocado) {
		this.fechaRevocado = fechaRevocado;
	}
	public Date getFechaVigencia() {
		return fechaVigencia;
	}
	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	public Integer getNoacceso() {
		return noacceso;
	}
	public void setNoacceso(Integer noacceso) {
		this.noacceso = noacceso;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	
}
