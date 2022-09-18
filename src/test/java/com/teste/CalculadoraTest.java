package com.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculadoraTest{

	private static Calculadora calc;
	
	@Before
	public void setupCalc() {
		calc = new Calculadora();
	}
	
	
	@AfterClass
	public static void tearDownCalc() {
		calc = null;
		System.out.println("Finalizando a Calculadora");
	}
	
	@Test
	public void testSomar() {
		int result = 4;
		int add = calc.somar(2,2);
		assertEquals("Soma 2 + 2", result, add);
	}

	@Ignore
	@Test
	public void testSubtrair() {
		int result = 1;
		int sub = calc.subtrair(2,1);
		assertEquals("Subtra��o 2 - 1", result, sub);
	}

	@Ignore
	@Test
	public void testMultiplicar() {
		int result = 2;
		int mult = calc.multiplicar(2,1);
		assertEquals("Multiplica��o 2 * 1", result, mult);
	}
	
	@Test(timeout = 100)
	public void testDividir() {
		try {
			calc.dividir(2,0);
			fail("Dever� lan�ar uma exce��o");
		}catch(ArithmeticException e) {
			System.out.println("Exce��o Lan�ada");
		}
	}
	
	@Test(timeout = 100)
	public void testTime() {
		while (true);
	}
}
