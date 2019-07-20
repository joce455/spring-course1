package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.models.Empleado;
import com.models.JefeEmpleado;

public class Prototype {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		JefeEmpleado juan= contexto.getBean("miEmpleado",JefeEmpleado.class);
		
		JefeEmpleado maria= contexto.getBean("miEmpleado",JefeEmpleado.class);
		
		System.out.println(maria.getInformes());
		System.out.println(juan.getInformes());
		
		
		
		
		contexto.close();
	}

}
