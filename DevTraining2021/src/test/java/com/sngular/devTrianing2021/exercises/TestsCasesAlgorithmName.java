
package com.sngular.devTrianing2021.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sngular.devTraining2021.exercises.AlgorithmName;

public class TestsCasesAlgorithmName {
	@Test
	public void test() {


	    assertEquals(true, AlgorithmName.isIsogram("Dermatoglyphics"));
        assertEquals(true, AlgorithmName.isIsogram("isogram"));
        assertEquals(false, AlgorithmName.isIsogram("moose"));
        assertEquals(false, AlgorithmName.isIsogram("isIsogram"));
        assertEquals(false, AlgorithmName.isIsogram("aba"));
        assertEquals(false, AlgorithmName.isIsogram("moOse"));
        assertEquals(true, AlgorithmName.isIsogram("thumbscrewjapingly"));
        assertEquals(true, AlgorithmName.isIsogram(""));

	}

}