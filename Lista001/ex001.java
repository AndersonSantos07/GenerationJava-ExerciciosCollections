package Lista001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Escreva um programa Java para criar uma Collection -
ArrayList de Objetos da Classe String. O programa deverá solicitar ao usuário,
que ele digite via teclado 5 cores e deverá adicioná-las -
individualmente no ArrayList. Em seguida, faça o que se pede:

-Mostre na tela todas as cores que foram adicionadas. 
-Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 */


public class ex001 {

	public static void main(String[] args) {
	
		ArrayList<String> cores = new ArrayList<>();
		String cor;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(int i=0;i<5;i++) {
			System.out.printf("Digite a %d cor: ",(i+1));
			cor = leia.next();
			cores.add(cor);
		}
		
		System.out.println();
		
		System.out.println("Todas as cores adicionadas: ");
		for(String elementos:cores) {
			System.out.println(elementos);
		}
		
		Collections.sort(cores);
		
		System.out.println();
		System.out.println("\nCores ordenadas: ");
		
		for(int i = 0; i<cores.size();i++) {
			System.out.println(cores.get(i));
		}
		
	
	}

}
