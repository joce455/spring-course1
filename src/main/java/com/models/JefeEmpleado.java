package com.models;

public class JefeEmpleado implements Empleado {
	
	private CrearInformes crear;
	
	public  JefeEmpleado(CrearInformes crear) {
		this.crear=crear;
	}
	
	@Override
	public String getTareas() {
		return	"Jefe";
	}

	@Override
	public String getInformes() {
		return "Informe creado por Jefe "+ crear.getInforme();
	}
	
	
public void metodoInicial() {
		System.out.println("Dentro de inicio");
	}

//to see change to scope of xml to default= singleton
public void metodoFinal() {
	System.out.println("Dentro de final");
	}

}
