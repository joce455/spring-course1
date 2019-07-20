package com.models;

public class DirectorEmpleado implements Empleado{

	private CrearInformes crear;
	
	private String email;
	private String number;
	
	
	public CrearInformes getCrear() {
		return crear;
	}

	public void setCrear(CrearInformes crear) {
		this.crear = crear;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	
	@Override
	public String getTareas() {
	return	"Director";
		
	}

	@Override
	public String getInformes() {
		return "Informe creado por Director "+ crear.getInforme();
	}

}
