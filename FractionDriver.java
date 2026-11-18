public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1, 2);
        System.out.println(f1.getNumerator() + "/" + f1.getDenominator());
        System.out.println(f2.getNumerator() + "/" + f2.getDenominator());
		
		Fraction half = new Fraction("1/2");
		System.out.println(half.getNumerator() + "/" + half.getDenominator());
		
		Fraction anotherHalf = new Fraction(half);
		System.out.println(anotherHalf.getNumerator() + "/" + anotherHalf.getDenominator());
		
    }
}
