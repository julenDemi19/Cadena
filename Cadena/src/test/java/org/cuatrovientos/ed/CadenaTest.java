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
		int expected = 8;
		int actual = this.target.longitud("julentxo");
		assertEquals(expected, actual);
	}

	@Test
	void testVocales() {
		int expected = 2;
		int actual = this.target.vocales("julentxo");
		assertEquals(expected, actual);
	}

	@Test
	void testInvertir() {
		String expected = "oxtneluj";
		String actual = this.target.invertir("julentxo");
		assertEquals(expected, actual);
	}

	@Test
	void testContarLetra() {
		int expected = 10;
		int actual = this.target.contarLetra("julentxo", 'u');
		assertEquals(expected, actual);
	}

}
