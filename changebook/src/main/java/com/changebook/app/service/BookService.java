package com.changebook.app.service;

import org.springframework.stereotype.Service;

import com.changebook.app.model.Libro;

@Service
public interface BookService {

	void insertar(Libro libro);

	Libro obtenerLibroPorId(int id);

}
