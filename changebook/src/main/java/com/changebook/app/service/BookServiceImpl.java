package com.changebook.app.service;

import com.changebook.app.model.Libro;

public class BookServiceImpl implements BookService {

	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Libro obtenerLibroPorId(int id) {
		return new Libro(id);
	}

}
