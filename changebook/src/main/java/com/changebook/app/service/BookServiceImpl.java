package com.changebook.app.service;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Libro> obtenerTodosLosLibros() {
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		return listaLibros;
	}
	
	

}
