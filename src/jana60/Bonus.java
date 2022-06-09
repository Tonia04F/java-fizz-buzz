package jana60;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		/* Invece che definire a priori di stampare i numeri da 1 a 100, chiediamo all’utente di dirci fino a quale 
		 * numero dobbiamo giocare, purché quel numero sia maggiore di 1 e minore di 200. 
		 * Devo continuare a chiedere all’utente il numero fino a che non ne inserisce uno valido, 
		 * senza interrompere l’esecuzione 
		 * del programma.
        */
		
			Scanner sc = new Scanner(System.in);
		
			boolean continuaAgiocare= true;
			int numeroScelto = 0;
			int limiteNumeri;
		
			while (continuaAgiocare) {
				System.out.println("Fino a che numero dobbiamo giocare?: ");
				limiteNumeri = sc.nextInt();
				System.out.println("Inserisci un numero tra i e 200: ");
				numeroScelto = sc.nextInt();
				//controllo se il numero va bene 
				if(numeroScelto >= 0 && numeroScelto <= 100) {
					continuaAgiocare = false;
					System.out.println("Hai scelto il numero: " + numeroScelto);
				}
				else {
					System.out.println("Prova di nuovo!");
				}
				
				//chiedo prima dei il numero e multiplo di 5 e 3 
				if(numeroScelto%3 ==0 && numeroScelto%5 ==0) {
					System.out.println("fizzBuzz");
				}
				else if(numeroScelto%5 ==0) {
					System.out.println("buzz");
				}
				else if(numeroScelto%3 ==0) {
					System.out.println("Fizz");
				}
				
			}
		
		
		

	}

}
