package com.sngular.devTraining2021.exercises;

import java.util.ArrayList;
import java.util.Collections;

public class AlgorithmName {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
    	
    	ArrayList<Integer> array = new ArrayList<>();
    	for(int a : arr ) {
    		
    		array.add(a);
    	}
    	int max = Collections.max(array);
    	int min = Collections.min(array);
    	return new int [] {min,max};
    	
    }
    
}