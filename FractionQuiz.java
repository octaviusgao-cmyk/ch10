import java.util.Scanner;
import java.util.Random;

public class FractionQuiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		String[] signs = {"+", "-", "*", "/"};
		
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		
		String sign = signs[rand.nextInt(4)];
		
		System.out.println("ANSWER ME: ");
		System.out.println(f1 + " " + sign + " " + f2);
		
		Fraction answer;
		
		if (sign.equals("+")) {
			answer = Fraction.add(f1, f2);
		} else if (sign.equals("-")) {
			answer = Fraction.subtract(f1, f2);
		} else if (sign.equals("*")) {
			answer = Fraction.mult(f1, f2);
		} else if (sign.equals("/")) {
			answer = Fraction.divide(f1, f2);
		}
		
		System.out.println("Answer: ");
		String input = in.nextLine();
		answer.reduce();
		
		if (input.equals(answer)) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
			System.out.println("The correct answer is: " + answer);
		}
	}
}
