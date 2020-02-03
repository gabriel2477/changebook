package com.app;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import com.changebook.app.controller.BookController;
import com.changebook.app.model.Libro;
import com.changebook.app.service.BookService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
@SpringBootConfiguration
public class bookControllerTest {
	
	private static final int ID_LIBRO = 12;
	private static final String NOMBRE_LIBRO = "TDDBook";
	private static final String ISBN = "A12B32";
	
	@Mock
    BookService mockBookService;
    
	@InjectMocks
    BookController bookController = new BookController();
	
	@Test
	public void insertarLibro() {
		
		Libro biblia =  new Libro(ID_LIBRO, NOMBRE_LIBRO, ISBN);
		
		bookController.insertarLibro(biblia);

        Mockito.verify(mockBookService).insertar(biblia);

	}
	
	@Test
	public void obtenerLibroPorId() {
		
		Mockito.when(bookController.obtenerLibroPorId(ID_LIBRO)).thenReturn(new Libro(ID_LIBRO,NOMBRE_LIBRO, ISBN));
		
		Libro libro = bookController.obtenerLibroPorId(ID_LIBRO);

        Mockito.verify(mockBookService).obtenerLibroPorId(12);
        
        Assertions.assertThat(libro.getId()).isEqualTo(ID_LIBRO);
        Assertions.assertThat(libro.getName()).isEqualTo(NOMBRE_LIBRO);
        Assertions.assertThat(libro.getISBN()).isEqualTo(ISBN);
		
	}
	
	@Test
	public void ObtenerTodosLosLibros() {
		//TODO
	}
	
	@Test
	public void modificarUnLibroPorId() {
		//TODO
	}
	
	@Test
	public void eliminarUnLibroPorId() {
		//TODO
	}
	
	@Test
	public void EliminarTodosLosLibros() {
		//TODO
	}

}
