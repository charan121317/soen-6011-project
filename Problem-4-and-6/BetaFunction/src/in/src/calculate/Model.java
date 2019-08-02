package in.src.calculate;

/**
 * <p>The Model class has all the methods used for 
 * calculating the beta function </p>
 * 
 * @author Charanpreet Singh Bedi
 * @version 1.0
 * @since 2019-07-26
 */

public class Model {
	
	/**
	 * <p>Setting up the global constants</p>
	 */
	private static final double PI = 3.14159;
	private static final double EXPONENTIAL = 2.7183;
	
	/**
	 * <p>The calculateBeta method does the calculation based on
	 * the Gamma function.</p>
	 * @param x This is the first input number
	 * @param y This is the second input number
	 * @return double This returns the beta function result
	 */
	public double calculateBeta(double x, double y) {
		
		double numerator = calculateGamma(x) * calculateGamma(y);
		double denominator = calculateGamma(x+y);
		double result = numerator/denominator;
		System.out.println(result);
		return result;
	}
	
	/**
	 * <p>The calculateGamma method calculates the gamma function
	 * using the Stirling's Approximation.</p>
	 * @param num This is the input for Gamma function
	 * @return double This returns the gamma function.
	 */
	public double calculateGamma(double num) {
		
		double variableA = (PI*2)/num;
		double variableB = num/EXPONENTIAL;
		
		double sqrt = getSqrt(variableA);
		double pow = getPOW(variableB, num);
		
		double result = sqrt * pow;
		return result;
	}
	
	/**
	 * <p>The getSqrt method is used to calculate the square root </p>
	 * @param num This is the input 
	 * @return double returns the square root of input
	 */
	public double getSqrt(double num) {
		
		double result;
	    double x;
	    double n = num / 2;
	    do {
	      x = n;
	      n = (x + num / x) / 2;
	    } while ((x - n) != 0);
	    result = x;		
		return result;
	}
	
	/**
	 * <p>The getPOW method calculates the power of x to y</p>
	 * @param x This is the first number.
	 * @param y This is the second number
	 * @return double This returns the POW of x to y
	 */
	public double getPOW(double x, double y) {
		
		double result = x;
		
		for(int i = 1; i<y; i++) {
			result = result * x;
		}
		return result;
	}
}
