package com.app;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.changebook.app.model.Libro;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void darDeAltaUnNuevoLibro() {

		Libro libro = new Libro();
		libro.setName("La Biblia");

		Assertions.assertThat(libro).isNotNull();
		Assertions.assertThat(libro.getName()).isEqualTo("La Biblia");

	}
}
