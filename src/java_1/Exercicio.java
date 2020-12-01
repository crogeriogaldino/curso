package java_1;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Defina a opera��o 1 - Adi��o, 2- Subtra��o");
		int o = sc.nextInt();
		
		switch(o) {
		case 1: 
			int resulta = soma(x,y);
			mostra(resulta);
			fina(resulta);
			sc.close();
			break;
		case 2:
			resulta = sub(x,y);
			mostra(resulta);
			fina(resulta);
			sc.close();
			break;
		}
	}
	
	public static int soma(int x, int y) {
		int result = x+y;
		return result;
	}
	
	public static int sub(int x, int y) {
		int result = x-y;
		return result;
	}
	
	public static void mostra(int a) {
		System.out.println("O resultado do c�lculo �: " + a);
	}
	public static void fina(int a) {
		System.out.println("FIM DA EXECU��O");
	}
	
}