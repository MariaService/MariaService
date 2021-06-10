package com.sngular.devTraining2021.exercises;


public class AlgorithmName {
	public static String accum(String str) {
		// your code

		String result = "";
		// i es la 
		for (int i = 0; i < str.length(); i++) {
			char caracter = str.charAt(i);
			
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					result += Character.toUpperCase(caracter);
				} else {
					result += Character.toLowerCase(caracter);
				}
			}
			result += "-";
		}
		
		//replazamos el utimo carcter de la cadena - despues de remplazar el char
		String re= result.replaceFirst(".$","");
		System.out.println(re);
		
		return re;

	}
}