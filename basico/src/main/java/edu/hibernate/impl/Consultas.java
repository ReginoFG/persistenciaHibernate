package edu.hibernate.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.hibernate.dao.Pedido;
import edu.hibernate.dao.PedidoServicioImpl;
/**
 * Clase que agrupa las transacaciones contra base de datos.
 * La etiqueta autowired nos permite hacer inyección de dependencia de la clase
 * PedidoServicioImpl.
 * La etiqueta Transactional automatiza la gestión de la transacción.
 * @author garfe
 *
 */
@Component
public class Consultas{

	@Autowired
	private PedidoServicioImpl psi;
	
	@Transactional
	public void insertarUnPedido(Pedido pedido) {
		psi.insertarPedido(pedido);
	}
	
	@Transactional
	public void insertarListaPedidos(Collection<Pedido> colPedidos) {
		for (Pedido pedido : colPedidos) {
			psi.insertarPedido(pedido);
		}
	}
	
	@Transactional
	public List<Pedido> buscarTodosPedidos() {
		return psi.buscarTodos();
	}
	
}
