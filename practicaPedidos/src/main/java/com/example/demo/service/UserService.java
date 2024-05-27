package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Usuario;

	

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

	public List<Usuario> getAllUsers() {
		return new ArrayList(users.values());
	}

	public Usuario findById(Long id) {
		return users.get(id);
	}
	public Usuario createUser(Usuario user) {
		users.put((long)user.getId(), user);
		return user;
	}

	public boolean deleteUserById(Long id) {
		Usuario user = this.findById(id);
		return users.remove(id, user);
	}

}

