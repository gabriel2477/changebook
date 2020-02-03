package com.changebook.app.model;

public class Libro {

	private int id;
	private String name;
	private String ISBN;

	public Libro() {
	}

	public Libro(int id) {
		super();
		this.id = id;
	}

	public Libro(int id, String name, String iSBN) {
		super();
		this.id = id;
		this.name = name;
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
