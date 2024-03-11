package leetCode.Easy;


import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue {
    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1, 2, 3, 6}, new int[]{2, 3, 4, 5}));
    }

    public static int getCommon(int[] nums1, int[] nums2) {

        Set<Integer> setList = new HashSet<>();

        for (int i : nums1) {
            setList.add(i);
        }
        for (int i : nums2) {
            if (setList.contains(i)) {
                return i;
            }
        }

        
        return -1;
    }
}
