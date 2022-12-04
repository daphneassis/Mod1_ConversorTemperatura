package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Conversor conv = new Conversor();

	
		System.out.println("---CONVERSOR DE TEMPERATURA CELSIUS PARA FARENHEIT---");
		char escolha;
		do{
	System.out.println("Qual temperatura você deseja converter?");
	double temp = sc.nextDouble();
	System.out.println(conv.converterTemp(temp)+" F");
	System.out.println("Deseja converter outra temperatura?(s/n)");
	 escolha = sc.next().charAt(0);
		}
		while (escolha!='n');
	}
	}


