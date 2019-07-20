package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.models.CrearInformes;
import com.models.DirectorEmpleado;
import com.models.Empleado;
import com.models.SecretarioEmpleado;



//@SpringBootApplication
public class DepencyInjectionApplication {

	public static void main(String args[] ) {
		//SpringApplication.run(DepencyInjectionApplication.class, args);
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleado juan= contexto.getBean("miEmpleado",Empleado.class);
		
		
		System.out.println(juan.getTareas());
		System.out.println(juan.getInformes());
		
		System.out.println("--------------------------");
		
		SecretarioEmpleado pedro= contexto.getBean("miEmpleado2",SecretarioEmpleado.class);
		System.out.println(pedro.getTareas());
		System.out.println(pedro.getInformes());
		System.out.println(pedro.getEmail());
		System.out.println(pedro.getNumber());
		
		System.out.println("--------------------------");
		
		DirectorEmpleado jose= contexto.getBean("miEmpleado3",DirectorEmpleado.class);
		System.out.println(jose.getTareas());
		System.out.println(jose.getInformes());
		System.out.println(jose.getEmail());
		System.out.println(jose.getNumber());
		
		
		contexto.close();
		
	}

}
