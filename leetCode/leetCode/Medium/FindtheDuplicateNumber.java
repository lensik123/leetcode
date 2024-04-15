package leetCode.Medium;

public class FindtheDuplicateNumber {
    //iven an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
    //
    //There is only one repeated number in nums, return this repeated number.
    //
    //You must solve the problem without modifying the array nums and uses only constant extra space.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [1,3,4,2,2]
    //Output: 2
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 3, 3};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];

        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        tortoise = nums[0];

        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }
}
