package chewy;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class CalculationsTest {
	
	Random rGenerator = new Random(System.nanoTime());
	int oper1 = 0;
	int oper2 = 0;

	@Test
	public void arithmaticMultiplyTest() {
		for(int i = 0; i < 100000; i++){
			oper1 = rGenerator.nextInt();
			oper2 = rGenerator.nextInt();
			
			assertEquals(String.valueOf(oper1 * oper2), Calculations.arithmatic(oper1, oper2, "\u00d7"));
			
		}
		
		assertEquals("25", Calculations.arithmatic(5, 5, "\u00d7"));
		assertEquals("0", Calculations.arithmatic(100, 0, "\u00d7"));
	}
	
	@Test
	public void arithmaticDivisionTest() {
		assertEquals("1", Calculations.arithmatic(5, 5, Character.toString((char) 247)));
		assertEquals("10", Calculations.arithmatic(100, 10, Character.toString((char) 247)));
		assertEquals("3000", Calculations.arithmatic(3000, 1, Character.toString((char) 247)));
		assertEquals("2", Calculations.arithmatic(80, 40, Character.toString((char) 247)));
	}
	
	@Test
	public void arithmaticDivisionByZeroTest(){
		assertEquals("Error", Calculations.arithmatic(5, 0, Character.toString((char) 247)));
	}
	
	@Test
	public void arithmaticAdditionTest(){
		for(int i = 0; i < 100000; i++){
			oper1 = rGenerator.nextInt();
			oper2 = rGenerator.nextInt();
			
			assertEquals(String.valueOf(oper1 + oper2), Calculations.arithmatic(oper1, oper2, "+"));
		}		
	}
	
	@Test
	public void arithmaticSubtractionTest(){
		for(int i = 0; i < 100000; i++){
			oper1 = rGenerator.nextInt();
			oper2 = rGenerator.nextInt();
			assertEquals(String.valueOf(oper1 - oper2), Calculations.arithmatic(oper1, oper2, "-"));
		}
	}
}
