package Lista002;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex002 {
	
	/*	 
Escreva um programa Java para criar uma Collection Set de Objetos da Classe
Wrapper Integer, inicializada com 10 valores inteiros.
O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro
e caso ele seja encontrado no Set, exiba na tela a mensagem: Número 00 Encontrado!
Caso o número não seja encontrado, ele deverá exibir na tela a mensagem:
O número NN não foi encontrado!
	 */

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>();
		
		int[] vetorNum = {2,5,7,8,1,4,3,6,0,10};
		int n1;
		
		for(int i=0;i<vetorNum.length;i++) {
			
			numeros.add(vetorNum[i]);
			
		}
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigire o numero que voce deseja encontrar: ");
		n1 = leia.nextInt();
		
		
		if(numeros.contains(n1)) {
			
			System.out.printf("\nO numero %d foi encontrado! ",n1);
			
		}else {
			
			System.out.printf("\nO numero %d nao foi encontrado! ",n1);
			
		}
		
		
	}

}
