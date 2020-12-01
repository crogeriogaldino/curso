	package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Digite o valor do Raio:");
		double radius = sc.nextDouble();
		double c = Calculator.circuference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circuference: %.2f%n", c );
		System.out.printf("Volume: %.2f%n", v );
		System.out.printf("Valor de PI: %.2f%n", Calculator.PI);

		
			
		sc.close();
		
	}
	
}
