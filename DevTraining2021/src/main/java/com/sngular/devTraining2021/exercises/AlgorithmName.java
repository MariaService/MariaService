package com.sngular.devTraining2021.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AlgorithmName {

	public static boolean isIsogram(String str) {

//		buscar concurrencias 
//		stexto = stexto.substring(stexto.indexof(
//			      stextobuscado)+stextobuscado.length(),stexto.length());

		str = str.toLowerCase();
		if (str.equals("")) {
			return true;
		} else {
			// creao un array
			String[] array = str.split("");
			//  convertir mi array, y devuelvo elemento unicos, 
			Set<String> set = new HashSet<String>(Arrays.asList(array));
			// si el tamaño es igual a la cadena original tons la ponemos como isograma
			if (str.length() == set.size()) {
				return true;
			} else {
				return false;
			}
		}

	}

}