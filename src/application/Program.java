package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("How many people? ");
		int n = input.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
		for (int i = 0; i < n; i++) {
			input.nextLine();
			System.out.println("Person #: " + (i + 1));
			System.out.print("Name: ");
			name[i] = input.nextLine();
			System.out.print("Age: ");
			age[i] = input.nextInt();
			System.out.print("Height: ");
			height[i] = input.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += height[i];
		}
		
		double avg = sum / n;
		System.out.println();
		System.out.printf("Average height: %.2f%n", avg);
		
		System.out.println();
		System.out.println("Persons under age 16:");
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (age[i] < 16) {
				count += 1;
				System.out.println("Name: " + name[i] + ", age: " + age[i]);
			}
		}
		
		double percent = count * 100 / n;
		System.out.printf("Percent of persons under 16 %.2f%%", percent);
		
		input.close();

	}

}
