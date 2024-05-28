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

/**
 * Clase que implementa los servicios de Usuarios y Pedidos.
 */
@RestController
public class AppController {

    /**
     * Servicio de pedidos
     */
    @Autowired
    private PedidoService pedidoService;

    /**
     * Servicio de usuarios
     */
    @Autowired
    private UserService userService;

    /**
     * Crea un nuevo pedido
     * @param pedido que se va a crear
     */
    @PostMapping("/createPedido")
    public void createPedido(@RequestBody Pedido pedido) {
        pedidoService.crearPedido(pedido);
    }

    /**
     * Busca un pedido por su Id
     *
     * @param id El Id del pedido a buscar
     * @return Una lista del pedido encontrado
     */
    @GetMapping("/buscarPedido")
    public ArrayList<Pedido> buscarPedido(@RequestParam long id) {
        return pedidoService.buscarPedido(id);
    }

    /**
     * Procesa un pedido cambiando su estado
     *
     * @param id del pedido que se va cambiar su estado
     * @param status El nuevo estado del pedido
     * @return true si el pedido se procesó correctamente y false en caso contrario
     */
    @PutMapping("/procesarPedido")
    public boolean procesarPedido(@RequestParam long id, @RequestParam ESTADO status) {
        return pedidoService.procesarPedido(id, status);
    }

    /**
     * Borra un pedido por su Id
     *
     * @param id del pedido que se va a borrar
     * @return true si el pedido se borra correctamente, false en caso contrario
     */
    @DeleteMapping("/borrarPedido")
    public boolean borrarPedido(@RequestParam long id) {
        return pedidoService.borrarPedido(id);
    }

    /**
     * Obtiene todos los usuarios
     *
     * @return Una lista de todos los usuarios
     */
    @GetMapping("/usersAll")
    public ArrayList getAllUsers() {
        return (ArrayList) userService.getAllUsers();
    }

    /**
     * Obtiene todos los pedidos
     *
     * @return Una lista de todos los pedidos
     */
    @GetMapping("/PedidoAll")
    public ArrayList getAllPedidos() {
        return (ArrayList) pedidoService.getAllPedidos();
    }
}
