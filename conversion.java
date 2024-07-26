import java.util.Scanner;

public class toMiles {
	public static double multiply(int input) {
		return input * 1.6;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter distance in miles: ");
		int input = scanner.nextInt();

		double result = multiply(input);
		System.out.println(result + " miles");

		scanner.close();

	}

}
