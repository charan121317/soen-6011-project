package in.src.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import in.src.calculate.Model;

/**
 * This is the test class for unit testing the application methods
 * @author Charanpreet Singh Bedi
 * @version 1.0
 * @since 2019-07-26
 */
public class BetaFunctionTest {

	Model model = new Model();
	
	@Test
	public void testSqrt() {

		assertEquals(model.getSqrt(13), Math.sqrt(13),0.000001);
		assertEquals(model.getSqrt(76.5), Math.sqrt(76.5),0.000001);
		assertEquals(model.getSqrt(501), Math.sqrt(501),0.000001);	
	}
	
	@Test
	public void testPOW() {
		
		assertEquals(model.getPOW(2, 3), Math.pow(2, 3),0.000001);
		assertEquals(model.getPOW(50, 80), Math.pow(50, 80),0.000001);
		assertEquals(model.getPOW(57, 1000), Math.pow(57, 1000),0.000001);
	}

}
