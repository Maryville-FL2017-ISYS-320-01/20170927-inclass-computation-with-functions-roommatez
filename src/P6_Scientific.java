/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P6_Scientific {

	public static void main(String[] args) {
		// REMINDER: Any print statements should only be in the main method
		System.out.println(ComputeValue(6.5, 3));
	}
	public static double ComputeValue(double base, double exponent) {
		double value = base * (Math.pow(10,  exponent));
		return value;
	}
}
