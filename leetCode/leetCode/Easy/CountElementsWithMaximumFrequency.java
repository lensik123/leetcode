package leetCode.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountElementsWithMaximumFrequency {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int maxFreq = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            maxFreq = Math.max(maxFreq,map.get(i));
        }
        int sum = 0;
        for (int freq : map.values()){
            if (maxFreq == freq){
                sum +=freq;
            }
        }



        return sum;
    }


    public static void main(String[] args) {
        int[] inda = new int[]{10,12,11,9,6,19,11,11};

        System.out.println(maxFrequencyElements(inda));
        ;
    }
}
