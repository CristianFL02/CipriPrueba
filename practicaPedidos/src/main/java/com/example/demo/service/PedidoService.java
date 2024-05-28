package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Pedido;
import com.example.demo.dto.Usuario;
/**
 * Clase que gestiona los servicios de los pedidos
 */
@Service
public class PedidoService {
	public List<Pedido> pedidos = new ArrayList<>();
/**
 * Creacion de un pedido 
 * @param p pedido que se va a añadir a la lista de pedidos
 * @return el id del pedido añadido
 */
	public int crearPedido(Pedido p) {
		pedidos.add(p);
		return (int) p.getId_pedido();
	}
/**
 * Buscar pedido en la lista de Pedidos
 * @param id Pedido a buscar
 * @return pedido encontrado
 */
	public ArrayList<Pedido> buscarPedido(long id) {
		ArrayList<Pedido>copia = new ArrayList<>();
		for (Pedido pedido : pedidos) {
			if (pedido.getId_pedido() == id) {
				copia.add(pedido);
				return copia;
			}
		}
		return copia;
	}
/**
 * Procesa un pedido pasado por parametro y cambia el estado
 * @param id pedido a cambiar estado
 * @param status estado al que se va a cambiar
 * @return si se ha cambiado el pedido, true o no, false
 */
	public boolean procesarPedido(long id, ESTADO status) {
		for (Pedido pedido : pedidos) {
			if (pedido.getId_pedido() == id) {
				pedido.setEstado(status);
				return true;
			}
		}
		return false;
	}
/**
 * Borrar pedidos pasados por parametro
 * @param id del pedido a borrar
 * @return true si ha sido borrado, false en el caso contrario
 */
	public boolean borrarPedido(long id) {
		for (Pedido pedido : pedidos) {
			if (pedido.getId_pedido() == id && pedido.getEstado().equals(ESTADO.PROCESADO)) {
				pedidos.remove(pedido);
				return true;
			}
		}
		return false;
	}
/**
 * Devuelve todos los pedidos almacenados en la lista
 * @return la lista con todos los pedidos
 */
	public List<Pedido> getAllPedidos() {
		return new ArrayList(pedidos);
	}

}
