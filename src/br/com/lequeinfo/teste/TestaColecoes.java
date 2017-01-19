package br.com.lequeinfo.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestaColecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para criar um ArrayList, basta chamar o construtor:
		//Sem colocar o tipo da coleção qualquer dado pode ser adicionado String, Object...
		
	    ArrayList<String> lista1 = new ArrayList<String>();
	    
	    lista1.add("Manoel");
	    lista1.add("Joaquim");
	    lista1.add("Maria");
	    
	    Collections.sort(lista1);
	    
	    for(String nome :lista1){
	    	System.out.println(nome);
	    }
	    
	    //É sempre possível abstrair a lista a partir da interface List:
	    //Sem colocar o tipo da coleção qualquer dado pode ser adicionado String, Object...
	    List<String> lista2 = new ArrayList<String>();
	    
	    lista2.add("José");
	    lista2.add("Ana");
	    lista2.add("Marta");
	    
	    Collections.sort(lista2);
	    
	    for(String nome :lista2){
	    	System.out.println(nome);
	    }
	    
	    // create array list object
	    List<Integer> numbers = new ArrayList<Integer>();
	       
	    // populate the list
	    for (int i = 0; i < 15; i++) {
	    numbers.add(i);
	    }

	    System.out.println("Antes : "+Arrays.toString(numbers.toArray()));
	       
	    // rotate the list at distance 10
	    Collections.rotate(numbers, 7);

	    System.out.println("Depois : "+Arrays.toString(numbers.toArray()));
	    
	    
	    
	    // create array list object
	    List<Integer> salario = new ArrayList<Integer>();
	       
	    // populate the list
	    for (int i = 0; i < 15; i++) {
	    
	    	Random n = new Random();
	    	salario.add(n.nextInt(9000));
	    }

	    System.out.println("Salário : "+Arrays.toString(salario.toArray()));
	       
	    

	}

}
