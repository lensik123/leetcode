package leetCode.Easy;

import java.util.*;

public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setList = new HashSet<>();
        Set<Integer> setListUnique = new HashSet<>();
        for (int num : nums1) {
            setList.add(num);
        }
        for (int num : nums2) {
            if (setList.contains(num)) {
                setListUnique.add(num);
            }
        }
        return setListUnique
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();


    }

    public static void main(String[] args) {
        for (int i : intersection(new int[]{9, 4, 9, 8, 4}, new int[]{9, 4, 9, 4})) {
            System.out.println(i);
        }
    }
}
