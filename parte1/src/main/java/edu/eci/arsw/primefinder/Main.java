package edu.eci.arsw.primefinder;

public class Main {

	public static void main(String[] args) {
		PrimeFinderThread pft=new PrimeFinderThread(0, 30000000);
		pft.start();

		/**
		PrimeFinderThread pft=new PrimeFinderThread(0, 9999999);
		PrimeFinderThread pft1=new PrimeFinderThread(10000000, 19999999);
		PrimeFinderThread pft2=new PrimeFinderThread(20000000, 30000000);

		pft.start();
		pft1.start();
		pft2.start();
		 */

	}
	
}
