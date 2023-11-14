package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args ) {
		ArrayList<String> minhaLista = new ArrayList<String>();
		String cores = null;
		int x;
		Scanner leitor = new Scanner(System.in);
		
		for(x=0; x < 5; x++) {
			System.out.println("Digite as cores que voce deseja: ");
			cores = leitor.nextLine();
			minhaLista.add(cores);
		}
	
		Iterator<String> iterator = minhaLista.iterator();
		
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nLista de todas as cores;");
		System.out.println(minhaLista);
		System.out.println("\nLista de cores ordenadas em ordem crescente: ");
		Collections.sort(minhaLista);
		System.out.println(minhaLista);
	}
}
