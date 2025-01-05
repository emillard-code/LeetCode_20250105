package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[][] shifts1 = new int[][]{{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(shiftingLetterII("abc", shifts1));

        int[][] shifts2 = new int[][]{{0,0,0},{1,1,1}};
        System.out.println(shiftingLetterII("dztz", shifts2));

    }

    public static String shiftingLetterII(String s, int[][] shifts) {

        StringBuilder sBuilder = new StringBuilder(s);
        if (!s.equals(s.toLowerCase())) { return null; }

        for (int[] shift : shifts) {

            if (shift.length != 3) { return null; }
            if (shift[0] > shift [1]) { return null; }
            if (shift[2] != 0 && shift[2] != 1) { return null; }

            for (int i = shift[0]; i <= shift[1]; i++) {

                if (shift[2] == 0 && sBuilder.charAt(i) == 'a') { sBuilder.setCharAt(i, 'z'); }
                else if (shift[2] == 0 && sBuilder.charAt(i) != 'a') { sBuilder.setCharAt(i, (char) (sBuilder.charAt(i) - 1)); }

                if (shift[2] == 1 && sBuilder.charAt(i) == 'z') { sBuilder.setCharAt(i, 'a'); }
                else if (shift[2] == 1 && sBuilder.charAt(i) != 'z') { sBuilder.setCharAt(i, (char) (sBuilder.charAt(i) + 1)); }

            }

        }

        return sBuilder.toString();

    }

}
