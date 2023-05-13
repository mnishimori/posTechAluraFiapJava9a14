package br.com.alura.factorymethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		ArrayList<String> primeiraCollectionDenomes = new ArrayList<>();
		primeiraCollectionDenomes.add("primeiroNome");
		primeiraCollectionDenomes.add("segundoNome");
		primeiraCollectionDenomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(primeiraCollectionDenomes);
		System.out.println(nomesImutavel);
		
		List<String> segundaCollectionDenomes = List.of("primeiroNome", "segundoNome", "terceiroNome");
		System.out.println(segundaCollectionDenomes);
		
		List<String> asList = Arrays.asList("nome1", "nome2");
		//asList.add("nome3"); java.lang.UnsupportedOperationException
		//asList.set(1, "nome3"); Ok
		System.out.println(asList);

		List<String> ofList = List.of("nome1", "nome2");
		//ofList.add("nome3"); java.lang.UnsupportedOperationException
		//ofList.set(3, "nome3"); java.lang.UnsupportedOperationException 
		System.out.println(ofList);		
		
	}
}
