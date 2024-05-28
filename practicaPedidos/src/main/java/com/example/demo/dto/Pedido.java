package com.example.demo.dto;

import com.example.demo.service.ESTADO;
/**
 * Clase que gestiona los pedidos
 */
public class Pedido {
	private long id_pedido;
	private float precio;
	private ESTADO estado;
	private String fecha;
	private Usuario usu;
/**
 * Creacion de un pedido por constructor
 * @param id_pedido
 * @param precio
 * @param estado
 * @param fecha
 * @param usu
 */
	public Pedido(long id_pedido, float precio, String estado, String fecha, Usuario usu) {
		this.id_pedido = id_pedido;
		this.precio = precio;
		this.estado = ESTADO.valueOf(estado);
		this.fecha = fecha;
		this.usu = usu;
	}

	public long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public ESTADO getEstado() {
		return estado;
	}

	public void setEstado(ESTADO estado) {
		this.estado = estado;
	}

	public String getPedido() {
		return fecha;
	}

	public void setPedido(String fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsu() {
		return usu;
	}

	public void setUsu(Usuario usu) {
		this.usu = usu;
	}
	
	
}
