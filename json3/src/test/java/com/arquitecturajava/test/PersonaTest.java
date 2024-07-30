package com.arquitecturajava.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.arquitecurajava.Persona;

class PersonaTest {

	@Test
	void esMayorEdadTest() {
		
		Persona persona= new Persona("pepe",20);
		assertTrue(persona.esMayorEdad());
	}
	
	@Test
	void noMayorEdadTest() {
		
		Persona persona= new Persona("pepe",10);
		assertFalse(persona.esMayorEdad());
	}

}
