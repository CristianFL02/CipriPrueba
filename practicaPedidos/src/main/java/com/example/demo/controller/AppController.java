package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Pedido;
import com.example.demo.service.ESTADO;
import com.example.demo.service.PedidoService;
import com.example.demo.service.UserService;

@RestController
public class AppController {

	@Autowired
	private PedidoService pedidoService;
	@Autowired
	private UserService userService;

	@PostMapping("/createPedido")
	public void createPedido(@RequestBody Pedido pedido) {
		pedidoService.crearPedido(pedido);
	}

	@GetMapping("/buscarPedido")
	public ArrayList<Pedido> buscarPedido(@RequestParam long id) {
		return  pedidoService.buscarPedido(id);
	}

	@PutMapping("/procesarPedido")
	public boolean procesarPedido(@RequestParam long id, @RequestParam ESTADO status) {
		return pedidoService.procesarPedido(id, status);
	}

	@DeleteMapping("/borrarPedido")
	public boolean borrarPedido(@RequestParam long id) {
		return pedidoService.borrarPedido(id);
	}

	@GetMapping("/usersAll")
	public ArrayList getAllUsers() {
		return (ArrayList) userService.getAllUsers();
	}

	@GetMapping("/PedidoAll")
	public ArrayList getAllPedidos() {
		return (ArrayList) pedidoService.getAllPedidos();
	}
}
