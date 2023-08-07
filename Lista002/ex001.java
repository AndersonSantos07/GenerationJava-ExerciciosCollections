package Lista002;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.
O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores
inteiros não repetidos e adicione-os individualmente na Collection Set.
Em seguida, faça o que se pede:
Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
Veja o exemplo abaixo:

 */

public class ex001 {

	public static void main(String[] args) {
		
		Set<Integer> meuSet = new HashSet<>(); //é uma forma de armazenar dados que não podem conter valores repetidos.
		int n1;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("\nDigite um numero inteiro: ");
			n1 = leia.nextInt();
			
			if(meuSet.isEmpty()) {
				meuSet.add(n1);	
			}else if(meuSet.contains(n1)) {
				System.out.println("\nDigite um valor nao repetido! ");
			}else if(!meuSet.contains(n1)) {
				meuSet.add(n1);
			}
			
		}while(meuSet.size() < 10);
		
		
		Iterator<Integer> iteratorMeuSet = meuSet.iterator(); //serve pra iterar o set, passar valor pro valor.
		
		while(iteratorMeuSet.hasNext()) { //enquanto tiver um próximo valor
			
			System.out.println(iteratorMeuSet.next()); //mostre o próximo valor
			
		}
		
		

	}

}
