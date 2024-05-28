package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Usuario;

	
/**
 * Clase que gestiona los servicios de los Usuarios
 */
@Service
public class UserService {
	private Map<Long, Usuario> users = new HashMap<>();
	
	public UserService() {
		Usuario user = new Usuario(1,"Cipri","Maquina",222L,"cipri@gmail.com","Su casa");
		users.put((long) user.getId(), user);

		 user = new Usuario(2,"Manolo","Malak",4444L,"manolo@gmail.com","Su casa");
		users.put((long) user.getId(), user);
		
		user = new Usuario(3,"Juan","Garcia",222L,"juan@gmail.com","Su casa");
		users.put((long) user.getId(), user);
	}
/**
 * Devuelve todos los usuarios registrados en el mapa
 * @return un mapa de usuarios
 */
	public List<Usuario> getAllUsers() {
		return new ArrayList(users.values());
	}
/**
 * Busca un usuario por id
 * @param id del usuario a encontrar
 * @return usuario encontrado
 */
	public Usuario findById(Long id) {
		return users.get(id);
	}
	/**
	 * Crea un usuario
	 * @param user Usuario a crear
	 * @return el usuario creado
	 */
	public Usuario createUser(Usuario user) {
		users.put((long)user.getId(), user);
		return user;
	}
	/**
	 * Borra un usuario de la lista de usuarios
	 * @param id del usuario a borrar
	 * @return true en caso de que se borre, false en el contrario
	 */
	public boolean deleteUserById(Long id) {
		Usuario user = this.findById(id);
		return users.remove(id, user);
	}

}

