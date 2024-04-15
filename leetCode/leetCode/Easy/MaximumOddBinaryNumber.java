package leetCode.Easy;

import java.util.Arrays;

public class MaximumOddBinaryNumber {
    public static String maximumOddBinaryNumber(String s) {
        int countOfOnes = 0;
        for (int i = 0; i < s.length(); i++) {
            countOfOnes += s.charAt(i) - '0';
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOfOnes - 1; i++) {
            sb.append("1");
        }
        for (int i = 0; i < s.length() - countOfOnes; i++) {
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("0100111"));
    }

}
