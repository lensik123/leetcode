package leetCode.Easy;

import java.util.HashMap;

public class RomanToInteger {
    static int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);


        //LVIII
        int i = 0;
        int currentSum = 0;

        while (i < s.length()) {

            if (i < s.length() - 1) {

                String doubleSymbol = s.substring(i, i + 2);
                if (map.containsKey(doubleSymbol)) {
                    
                    currentSum += map.get(doubleSymbol);
                    i += 2;
                    continue;
                }
            }
            String singleSymbol = s.substring(i, i + 1);
            currentSum += map.get(singleSymbol);
            i++;
        }

        return currentSum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
