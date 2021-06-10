package com.sngular.devTraining2021.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AlgorithmName {
	public static int orderNumber(int number) {
		// Implements the function with the algorithm

		String numbers = String.valueOf(number);
		// descomposicion de digitos
		char[] a = numbers.toCharArray();
		int size = a.length;
		Integer[] arr = new Integer[size];

		for (int i = 0; i < size; i++) {
			// llenamos ya descompuesto
			arr[i] = Integer.parseInt(String.valueOf(a[i]));
		}
		ArrayList<Integer> integerArray = new ArrayList<>();
		
		// metodo de ordenacion desecente
		Arrays.sort(arr, Collections.reverseOrder());
		for (int numeros : arr) {
			// guardamos en array de integers
			integerArray.add(numeros);
		}
		// limpiamos la cadena
		String s = integerArray.toString();
		String strOfInts = s.replaceAll("\\[|\\]|,|\\s", "");
		// devolvemos el tipo de dato en int
		long veryLongNumber = Long.parseLong(strOfInts);
		return (int) veryLongNumber;
	}
}