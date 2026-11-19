public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(2, 3);
        System.out.println(f1.getNumerator() + "/" + f1.getDenominator());
        System.out.println(f2.getNumerator() + "/" + f2.getDenominator());
		
		Fraction half = new Fraction("1/2");
		System.out.println(half.getNumerator() + "/" + half.getDenominator());
		
		Fraction anotherHalf = new Fraction(half);
		System.out.println(anotherHalf.getNumerator() + "/" + anotherHalf.getDenominator());
		
		Fraction f4 = Fraction.mult(f2, f3);
		System.out.println(f4);
    }
}
