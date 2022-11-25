package edu.hibernate.dao;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Component;

/**
 * Clase que implementa la interfaz PedidoServicio
 * Con la etiqueta component decimos que esta clase se puede añadir al contenedor
 * IoC para hacer inyección de dependencias.
 * Con la etiqueta persistence context estamos iyectando un EntityManager.
 * @author garfe
 *
 */
@Component
public class PedidoServicioImpl implements PedidoServicio{

	@PersistenceContext
	private EntityManager em;
	
	public void insertarPedido(Pedido pedido) {
		em.persist(pedido);
	}
	
	public List<Pedido> buscarTodos() {
		return em.createQuery("SELECT pedidos FROM Pedido pedidos").getResultList();
	}

}
