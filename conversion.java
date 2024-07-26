import java.util.Scanner;

public class toMiles {
	public static double multiply(int input) {
		return input * 0.621371;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter distance in kilometers: ");
		int input = scanner.nextInt();

		double result = multiply(input);
		System.out.println(result + " miles");

		scanner.close();

	}

}
