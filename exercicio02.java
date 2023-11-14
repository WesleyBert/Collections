package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		int num, index = 0;
		Scanner leitor = new Scanner(System.in);
		Queue<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(9);
		list.add(7);
		list.add(8);
		list.add(10);
		list.add(6);
		
		
		System.out.println("Digite o número qu você deseja encontrar: ");
		num = leitor.nextInt();
		
		
		for(Integer element: list) {
			if(element == num) {
				System.out.println("\nO número " + num + " foi encontrado na posição " + index);
				break;
				
			} index++;
			if(index == list.size()) {
				System.out.println("\nO número " + num + " não foi encontrado!" );
			}
		}
		
		
		

	}

}
