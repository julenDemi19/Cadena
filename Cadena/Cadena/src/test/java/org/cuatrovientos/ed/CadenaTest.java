package org.cuatrovientos.ed;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {

	Cadena target;
	
	@BeforeEach
	void setUp() throws Exception {
		this.target = new Cadena();
	}

	@Test
	void testLongitud() {
		int expected = 90;
		int actual = this.target.longitud("cadena");
		assertEquals(expected, actual);
	}

	@Test
	void testVocales() {
		int expected = 10;
		int actual = this.target.vocales("OierChasco");
		assertEquals(expected, actual);
	}

	@Test
	void testInvertir() {
		String expected = "skaxt";
		String actual = this.target.invertir("OierChasco");
		assertEquals(expected, actual);
	}

	@Test
	void testContarLetra() {
		int expected = 10;
		int actual = this.target.contarLetra("Oier", 't');
		assertEquals(expected, actual);
	}

}
