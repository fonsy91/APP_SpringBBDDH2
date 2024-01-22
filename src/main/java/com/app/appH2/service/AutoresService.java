package com.app.appH2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.appH2.model.Autores;
import com.app.appH2.repopsitory.AutoresRepository;


@Component
public class AutoresService {

	@Autowired
	private AutoresRepository autoresRepository;

	public Autores insertarAutor(Autores autor) {
		return autoresRepository.save(autor);
	}
	
	public Autores obtenerAutorById(Integer id) {
		Optional<Autores> optionalUser = autoresRepository.findById(id);
		return optionalUser.get();
	}
	
	public List<Autores> obtenerAllAutores() {
		return autoresRepository.findAll();
	}
	
	public void eliminarAutor(Integer id) {
		autoresRepository.deleteById(id);
	}
	
}
