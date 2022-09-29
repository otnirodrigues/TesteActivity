package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
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

	@Test
	public void testSubtrair() {
		int result = 1;
		int sub = calc.subtrair(2,1);
		assertEquals("Subtração 2 - 1", result, sub);
	}

	@Test
	public void testMultiplicar() {
		int result = 2;
		int mult = calc.multiplicar(2,1);
		assertEquals("Multiplicação 2 * 1", result, mult);
	}
	
	@Test()
	public void testDividirPorZero() {
		try {
			calc.dividir(2,0);
		}catch(ArithmeticException e) {
			System.out.println("Exceção Lançada");
		}
	}
	
	@Test()
	public void testDividir() {
		int result = 2;
		int div = calc.dividir(2,1);
		assertEquals("Divisão 2 * 1", result, div);
	}
}
