package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[][] shifts1 = new int[][]{{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(shiftingLetterII("abc", shifts1));

        int[][] shifts2 = new int[][]{{0,0,0},{1,1,1}};
        System.out.println(shiftingLetterII("dztz", shifts2));

    }

    // This method will shift characters as per challenge instructions.
    public static String shiftingLetterII(String s, int[][] shifts) {

        // We will use a StringBuilder to easier manipulate the string.
        // We return null if the string isn't completely lowercase (as the challenge specified).
        StringBuilder sBuilder = new StringBuilder(s);
        if (!s.equals(s.toLowerCase())) { return null; }

        // We will perform the shift operations sequentially.
        for (int[] shift : shifts) {

            // Each lower array should only have 3 elements.
            if (shift.length != 3) { return null; }

            // As shift[0] represents the start index and shift[1] is the end index,
            // it must necessarily follow that the value of shift[0] is less than shift[1].
            if (shift[0] > shift [1]) { return null; }

            // shift[2] is only supposed to be 0 or 1 to signify the direction.
            if (shift[2] != 0 && shift[2] != 1) { return null; }

            // We perform the forward or backward shift according to the indexes that
            // were specified by shift[0] and shift[1].
            for (int i = shift[0]; i <= shift[1]; i++) {

                // We shift backwards when shift[2] is 0. We include special logic for
                // when the char at index i for sBuilder is 'a' (we shift to 'z' instead).
                if (shift[2] == 0 && sBuilder.charAt(i) == 'a') { sBuilder.setCharAt(i, 'z'); }
                else if (shift[2] == 0 && sBuilder.charAt(i) != 'a') { sBuilder.setCharAt(i, (char) (sBuilder.charAt(i) - 1)); }

                // We shift forwards when shift[2] is 1. We include special logic for
                // when the char at index i for sBuilder is 'z' (we shift to 'a' instead).
                if (shift[2] == 1 && sBuilder.charAt(i) == 'z') { sBuilder.setCharAt(i, 'a'); }
                else if (shift[2] == 1 && sBuilder.charAt(i) != 'z') { sBuilder.setCharAt(i, (char) (sBuilder.charAt(i) + 1)); }

            }

        }

        // We return string s when all the forward/backward operations have been completed.
        return sBuilder.toString();

    }

}
