package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Pedido;
import com.example.demo.dto.Usuario;

@Service
public class PedidoService {
	public List<Pedido> pedidos = new ArrayList<>();

	public int crearPedido(Pedido p) {
		pedidos.add(p);
		return (int) p.getId_pedido();
	}

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

	public boolean procesarPedido(long id, ESTADO status) {
		for (Pedido pedido : pedidos) {
			if (pedido.getId_pedido() == id) {
				pedido.setEstado(status);
				return true;
			}
		}
		return false;
	}

	public boolean borrarPedido(long id) {
		for (Pedido pedido : pedidos) {
			if (pedido.getId_pedido() == id && pedido.getEstado().equals(ESTADO.PROCESADO)) {
				pedidos.remove(pedido);
				return true;
			}
		}
		return false;
	}

	public List<Pedido> getAllPedidos() {
		return new ArrayList(pedidos);
	}

}
