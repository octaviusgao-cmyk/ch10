public class Fraction {
	
	//instance variable (attribute or fields)
	private int numerator, denominator;
	
	//constructor(s)
	public Fraction () { // default constructor
		numerator = 1;
		denominator = 1;
	}
	
	public Fraction (int n, int d) { //parameterized constructor
		numerator = n;
		denominator = d;
	} 
	
	//behaviour methods (accessor, mutator, helper)
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
}
