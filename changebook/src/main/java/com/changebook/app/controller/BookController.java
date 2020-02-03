package com.changebook.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.changebook.app.model.Libro;
import com.changebook.app.service.BookService;

@RestController
public class BookController {
	
	@Autowired 
	BookService service;

	@PutMapping
	public void insertarLibro(Libro libro) {
		service.insertar(libro);
	}
	
	@GetMapping
	public Libro obtenerLibroPorId(int id) {
		
		return service.obtenerLibroPorId(id);
	}
}
