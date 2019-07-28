package in.src.calculate;

public class Model {
	
	//declaring constants used in the calculation
	private static final double PI = 3.14159;
	private static final double EXPONENTIAL = 2.7183;
	
	
	public double calculateBeta(double x, double y) {
		
		//beta function is related to gamma function
		double numerator = calculateGamma(x) * calculateGamma(y);
		double denominator = calculateGamma(x+y);
		double result = numerator/denominator;
		System.out.println(result);
		return result;
	}
	
	private double calculateGamma(double num) {
		
		//gamma function is calculated using Stirling's Approximation
		double variableA = (PI*2)/num;
		double variableB = num/EXPONENTIAL;
		
		double sqrt = getSqrt(variableA);
		double pow = getPOW(variableB, num);
		
		double result = sqrt * pow;
		return result;
	}
	
	//calculating the square root
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
	
	//calculating the POW
	public double getPOW(double x, double y) {
		
		double result = x;
		
		for(int i = 1; i<y; i++) {
			result = result * x;
		}
		return result;
	}
}
