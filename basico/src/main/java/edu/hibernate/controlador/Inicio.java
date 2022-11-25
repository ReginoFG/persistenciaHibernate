package edu.hibernate.controlador;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;


import edu.hibernate.dao.Pedido;
import edu.hibernate.impl.Consultas;

@Controller
public class Inicio {

	
	public static void main(String[] args) { 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		consulta.insertarUnPedido(new Pedido(6,"funciona"));
		System.out.println("Lista pedidos: " + consulta.buscarTodosPedidos());
	    
	}


}
