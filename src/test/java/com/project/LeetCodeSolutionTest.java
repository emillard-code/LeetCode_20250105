package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void shiftingLetterIITest() {

        int[][] shifts1 = new int[][]{{0,1,0},{1,2,1},{0,2,1}};
        assertEquals("ace", LeetCodeSolution.shiftingLetters("abc", shifts1));

        int[][] shifts2 = new int[][]{{0,0,0},{1,1,1}};
        assertEquals("catz", LeetCodeSolution.shiftingLetters("dztz", shifts2));

    }

}
