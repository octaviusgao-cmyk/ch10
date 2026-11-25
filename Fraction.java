import java.util.Random;

public class Fraction {
	Random rand = new Random();
	//instance variable (attribute or fields)
	private int numerator, denominator;
	String[] signs = {"+", "-", "*", "/"};
	
	//constructor(s)
	public Fraction () { // default constructor
		numerator = rand.nextInt(10);
		denominator = rand.nextInt(10);
		
		String sign = signs[rand.nextInt(4)];
	}
	
	public Fraction (int n, int d) { //parameterized constructor
		numerator = n;
		setDenominator(d);
	}
	
	public Fraction (String n) {
		for (int i = 0; i < n.length(); i++) {
			if (n.substring(i, i+1).equals("/")) {
				numerator = Integer.parseInt(n.substring(0, i));
				setDenominator(Integer.parseInt(n.substring(i+1)));
			}
		}
	} 
	
	public Fraction (Fraction f) {
		numerator =  f.numerator;
		denominator = f.denominator;

	}
	
	//behaviour methods (accessor, mutator, helper)
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	//mutator methods
	public void setNumerator(int n) {
		numerator = n;
	}
	
	public void setDenominator(int d) {
		if (d != 0) {
			denominator = d;
		} else {
			denominator = 1;
			System.out.println("Denominator cannot be 0");
		}
	}
	
	public void reduce() {
		if (numerator == 0) {
		denominator = 1;
		return;
		}
		int g = gcf(numerator, denominator);
		numerator = numerator / g;
		if (denominator < 0) {
			numerator = -numerator;
			denominator = -denominator;
		}
	}
	public boolean equals (Fraction f) {
		return (numerator == f.getNumerator() && denominator == f.getDenominator());
		}
	
	public static Fraction mult (Fraction a, Fraction b) {
		int n = a.getNumerator() * b.getNumerator();
		int d = a.getDenominator() * b.getDenominator();
		Fraction answer = new Fraction(n,d);
		return answer;
		
	}
	
	public static Fraction divide(Fraction a, Fraction b) {
		Fraction flipped = new Fraction(b.getDenominator(), b.getNumerator());
		return mult(a, flipped);
	} 
	
	public static Fraction add(Fraction a, Fraction b) {
		int n = a.getNumerator() * b.getDenominator() +  b.getNumerator() * a.getDenominator();
		int d = a.getDenominator() * b.getDenominator();
		Fraction ans = new Fraction(n, d);
		ans.reduce();
		return ans;
	}
	
	private static int gcf (int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
	
}
