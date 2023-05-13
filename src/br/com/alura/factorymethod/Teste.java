package br.com.alura.factorymethod;

import java.util.ArrayList;
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
		
	}
}
