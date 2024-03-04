package leetCode.Easy;

import java.util.Arrays;

public class SquaresofaSorterArray {
    public static int[] sortedSquares(int[] nums) {

        int[] sortedSquaredArray = Arrays.stream(nums)
                .map(num -> num * num)
                .sorted()
                .toArray();

        return sortedSquaredArray;
    }

    public static void main(String[] args) {


        for (int num : sortedSquares(new int[]{-4, -1, 0, 3, 10})) {
            System.out.print(num + " ");
        }


    }
}
