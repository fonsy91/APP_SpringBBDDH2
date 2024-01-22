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

import com.app.appH2.model.Autores;
import com.app.appH2.service.AutoresService;


import io.swagger.v3.oas.annotations.Operation;

@Configuration
@RestController
@RequestMapping("/autores")
public class AutoresController {
	
	@Autowired
	private AutoresService autoresService;


    @Bean
    GroupedOpenApi autoresApi() {
		return GroupedOpenApi.builder().group("autores").pathsToMatch("/autores/**").build();
	}
	
	
	@Operation(summary = "Inserta un autor")
	@PostMapping("/insertaAutor")
	public Autores insertarUser(@RequestBody Autores autor) {
		return autoresService.insertarAutor(autor);
	}
	
	@Operation(summary = "Lista de todos los Autores")
	@GetMapping("/listaAutores")
	public List<Autores> obtenerAllAutores () {
		return autoresService.obtenerAllAutores();
	}
	
	@Operation(summary = "Obtener un autor por su id")
	@GetMapping("{id}")
	public Autores obtenerAutorById(@PathVariable("id") Integer id) {
		return autoresService.obtenerAutorById(id);
	}
	
	@Operation(summary = "Eliminar un autor por su id")
	@DeleteMapping("{id}")
	public void eliminarAutor(@PathVariable("id") Integer id) {
		autoresService.eliminarAutor(id);
	}

}
