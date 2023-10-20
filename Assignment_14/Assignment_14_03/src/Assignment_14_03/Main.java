package Assignment_14_03;

import java.util.*;

public class Main {

	public static void calculate(double num1, double num2, Arithematic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);

	}

	public static void main(String[] args) {
		double num1, num2;
		int choice;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Choose an operation:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("Enter your choice (1/2/3/4/5): ");
			choice = sc.nextInt();

			if (choice >= 1 && choice <= 4) {
				System.out.println("Enter num1 : ");
				num1 = sc.nextDouble();
				System.out.println("Enter num2 : ");
				num2 = sc.nextDouble();

			} 
			else if (choice == 5) 
			{
				break;
			}
			else 
			{
				System.out.println("wrong choice");
				continue;
			}

			switch (choice) {
			case 1:
				calculate(num1, num2, (a, b) -> a + b);
				break;

			case 2:
				calculate(num1, num2, (a, b) -> a - b);
				break;
			case 3:
				calculate(num1, num2, (a, b) -> a * b);
				break;
			case 4:
				if (num2 != 0) {
					calculate(num1, num2, (a, b) -> a / b);
				} else {
					System.out.println("division by zero");
				}

				break;
			}

		} while (choice != 5);
		System.out.println("exiting program");
		sc.close();
	}
}
