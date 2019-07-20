package com.models;

public class SecretarioEmpleado implements Empleado{
	private CrearInformes crear;
	private String email;
	private String number;
	
	
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

	public CrearInformes getCrear() {
		return crear;
	}
	
	public void setCrear(CrearInformes crear) {
		this.crear = crear;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Empleado";
	}

	@Override
	public String getInformes() {
		return "Informe creado por Secretario "+ crear.getInforme();
	}
	
	

}
