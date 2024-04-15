package leetCode.Medium;

import java.util.List;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {

        productExceptSelf(new int[]{1, 2, 3, 4});
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftList = new int[n];
        int[] rightList = new int[n];
        int[] answer = new int[n];


        int start = 1;
        int end = n - 2;
        leftList[0] = 1;
        rightList[n - 1] = 1;

        while (start < n && end >= 0){
            leftList[start] = leftList[start - 1] * nums[start - 1];
            rightList[end] = rightList[end + 1] * nums[end + 1];
            start++;
            end--;
        }

        for (int i = 0; i < answer.length; i++){
            answer[i] = leftList[i] * rightList[i];
        }

        return answer;
    }
}
