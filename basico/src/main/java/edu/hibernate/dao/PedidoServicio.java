package edu.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

/**
 * Interfaz que actúa sobre PedidoDao
 * Tan solo se define la signatura de los métodos que actuarán sobre
 * PedidoDao, la implementación se define en PedidoServicioImpl
 * @author garfe
 *
 */
public interface PedidoServicio {
	
	/**
	 * Método que inserta un nuevo pedido en base de datos.
	 * @param pedido
	 */
	public void insertarPedido(Pedido pedido);
	
	/**
	 * Método que trae todos los registros de la tabla ped_tbh_pedidos
	 * @return
	 */
	public List<Pedido> buscarTodos();

}
