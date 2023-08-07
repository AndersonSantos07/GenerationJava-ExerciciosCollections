package Lista001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe
 Wrapper Integer, inicializada com 10 valores inteiros.
 O programa deverá solicitar ao usuário, que ele digite 
 via teclado 1 número inteiro e caso ele seja encontrado no ArrayList,
 exiba na tela a posição deste número na Collection. Caso o número não seja
 encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 */

public class ex002 {

	public static void main(String[] args) {
		
		int[] vetor = {2,3,1,7,5,6,4,8,9,12};
		int n1;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for(int i = 0;i<vetor.length;i++) {
			
			list.add(vetor[i]);
			
		}
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o numero que voce deseja encontrar: ");
		n1 = leia.nextInt();
		
		boolean verifica = list.contains(n1);
		
		if(verifica) {
			int index = list.indexOf(n1);
			System.out.printf("\nO numero %d esta localizado na posicao: %d ",n1,index);
		}else {
			System.out.printf("\nO numero %d nao foi encontrado!", n1);
		}
		
	}

}
