package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void shiftingLetterIITest() {

        int[][] shifts1 = new int[][]{{0,1,0},{1,2,1},{0,2,1}};
        assertEquals("ace", LeetCodeAttempt.shiftingLetterII("abc", shifts1));

        int[][] shifts2 = new int[][]{{0,0,0},{1,1,1}};
        assertEquals("catz", LeetCodeAttempt.shiftingLetterII("dztz", shifts2));

    }

}
