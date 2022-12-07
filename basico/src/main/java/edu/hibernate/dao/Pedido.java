package edu.hibernate.dao;

import javax.persistence.*;

/**
 * DAO para la entidad ped_tbh_pedidos
 * @author garfe
 *
 */
@Entity
@Table(name="ped_tbh_pedidos", schema="dlk_web_pedidos")
public class Pedido {

	
	
	public Pedido(int id, String cod_pedido) {
		super();
		this.id = id;
		this.cod_pedido = cod_pedido;
	}
	
	
	public Pedido() {
		super();
	}


	//ATRIBUTOS
	@Id
	@Column(name="id", unique=true, nullable=false)
	private int id;
	@Column(name="cod_pedido")
	private String cod_pedido;
	
	//GETTERS & SETTERS
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCod_pedido() {
		return cod_pedido;
	}
	public void setCod_pedido(String cod_pedido) {
		this.cod_pedido = cod_pedido;
	}


	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cod_pedido=" + cod_pedido + "]";
	}	
	
	
	
}
