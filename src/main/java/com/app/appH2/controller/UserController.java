package com.app.appH2.controller;

import java.util.List;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.appH2.model.User;
import com.app.appH2.service.UserService;

import io.swagger.v3.oas.annotations.Operation;

@Configuration
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

    @Bean
    GroupedOpenApi usersApi() {
		return GroupedOpenApi.builder().group("users").pathsToMatch("/users/**").build();
	}
	
	
	@Operation(summary = "Inserta un usuario")
	@PostMapping("/insertaUsuario")
	public User insertarUser(@RequestBody User user) {
		return userService.insertarUser(user);
	}
	
	@Operation(summary = "Lista de todos los Usuarios")
	@GetMapping("/listaUsuarios")
	public List<User> obtenerAllUsers () {
		return userService.obtenerAllUsers();
	}
	
	@Operation(summary = "Obtener usuario por id")
	@GetMapping("{id}")
	public User obtenerUserById(@PathVariable("id") Integer id) {
		return userService.obtenerUserById(id);
	}
	
	@Operation(summary = "Eliminar usuario por id")
	@DeleteMapping("{id}")
	public void eliminarUsers(@PathVariable("id") Integer id) {
		userService.eliminarUsers(id);
	}
	
}
