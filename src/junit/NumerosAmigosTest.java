package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		NumerosAmigos ejer = new NumerosAmigos(22,284);
		boolean amigo = ejer.amigo();
		assertFalse(amigo);
	}
	
	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos ejer = new NumerosAmigos(496,496);
		boolean amigo = ejer.amigo();
		assertTrue(amigo);
	}
	
	@Test
	public void testEsCeroN1() {
		NumerosAmigos ejer = new NumerosAmigos(0,496);
		assertNull(ejer.esN1IgualAN2());
	}
	
	@Test
	public void testN1yN2SonIguales() {
		NumerosAmigos ejer = new NumerosAmigos(496,496);
		Integer resultadoEsperado= 1;
		assertEquals(resultadoEsperado,ejer.esN1IgualAN2(),0);
	}
	
	@Test
	public void testN1yN2NoSonIguales() {
		NumerosAmigos ejer = new NumerosAmigos(22,284);
		Integer resultadoEsperado= 1;
		assertNotEquals(resultadoEsperado,ejer.esN1IgualAN2());
	}
}
