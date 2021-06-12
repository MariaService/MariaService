
package com.sngular.devTrianing2021.exercises;

import static org.junit.Assert.assertArrayEquals;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.sngular.devTraining2021.exercises.AlgorithmName;

public class TestsCasesAlgorithmName {
    private Random rand;

    @Before
    public void initTest() {
        rand = new Random();
    }

    @Test
    public void testExampleCases() {
     assertArrayEquals(new int[]{1,5}, AlgorithmName.minMax(new int[]{1,2,3,4,5}));
      assertArrayEquals(new int[]{5, 2334454}, AlgorithmName.minMax(new int[]{2334454,5}));
       assertArrayEquals(new int[]{1, 1}, AlgorithmName.minMax(new int[]{1}));
    }

    @Test
    public void minMaxRandomTest() {
        for(int i = 0; i < 20; i++) {
            int r = rand.nextInt();
            assertArrayEquals(new int[]{r, r}, AlgorithmName.minMax(new int[]{r}));
        }
    }
}
