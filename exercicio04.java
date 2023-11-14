package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio04 {

	public static void main(String[] args) {
		Set<Integer> list = new HashSet<Integer>();
		Scanner leitor = new Scanner(System.in);
		int num;
		
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(9);
		list.add(7);
		list.add(8);
		list.add(10);
		list.add(6);
		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = leitor.nextInt();
		
		if(list.contains(num)) {
			System.out.println(" O número " + num +" foi encontrado!");
		}else {
			System.out.println("O número " + num + " não foi encontrado!");
		}
	}

}
