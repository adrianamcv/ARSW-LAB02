package edu.eci.arsw.primefinder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		PrimeFinderThread pft=new PrimeFinderThread(0, 30000000);
		pft.start();*/

		 PrimeFinderThread pft=new PrimeFinderThread(0, 10000000);
		 PrimeFinderThread pft1=new PrimeFinderThread(10000000, 20000000);
		 PrimeFinderThread pft2=new PrimeFinderThread(20000000, 30000000);
		 pft.start();
		 pft1.start();
		 pft2.start();

		 try{
			 Thread.sleep(5000);
			 pft.pause();
			 pft1.pause();
			 pft2.pause();
		 } catch (Exception e){}

		System.out.println("\n La cantidad de números primos que se han encontrado en el rango de 0 a 10000000 es: "+ pft.getPrimes().size() + "\n");
		System.out.println("La cantidad de números primos que se han encontrado en el rango de 10000000 a 20000000 es: "+ pft1.getPrimes().size() + "\n");
		System.out.println("La cantidad de números primos que se han encontrado en el rango de 20000000 a 30000000 es: "+ pft2.getPrimes().size() + "\n");
		System.out.println("Por favor presione enter para continuar:");

		Scanner scanner = new Scanner(System.in);
		String entrada ="";
		do{
			entrada  = scanner.nextLine();
			System.out.println(entrada);
		}
		while(!entrada.equals(""));
		/*System.out.println("SE PRESIONÓ LA TECLA ENTER");*/
		pft.play();
		pft1.play();
		pft2.play();

		boolean alive = true;
		while (alive){
			if (pft.isAlive() || pft1.isAlive() || pft2.isAlive()){
				alive = true;
			}
			else{
				alive = false;
			}
		}
		System.out.println("\n La cantidad de números primos que se han encontrado en el rango de 0 a 10000000 es: "+ pft.getPrimes().size() + "\n");
		System.out.println("La cantidad de números primos que se han encontrado en el rango de 10000000 a 20000000 es: "+ pft1.getPrimes().size() + "\n");
		System.out.println("La cantidad de números primos que se han encontrado en el rango de 20000000 a 30000000 es: "+ pft2.getPrimes().size() + "\n");
	}
	
}
