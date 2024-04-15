package leetCode.Medium;


import java.util.Arrays;
import java.util.Comparator;

//You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.
//
//Permute the characters of s so that they match the order that order was sorted. More specifically, if a character x occurs before a character y in order, then x should occur before y in the permuted string.
//
//Return any permutation of s that satisfies this property.
public class CustomSortString {
    public static void main(String[] args) {

        System.out.println(customSortString("cba","abcd"));

    }

    public static String customSortString(String order, String s) {
        Character [] sortedString = new Character[s.length()];

        for (int i = 0; i < s.length();i++){
            sortedString[i] = s.charAt(i);
        }

        Arrays.sort(sortedString, Comparator.comparingInt(order::indexOf));

        String str1 = "";
        for (char i : sortedString){
            str1 += i;
        }
        return str1;
    }
}
