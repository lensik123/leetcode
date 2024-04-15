package leetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;


        int c = a + b;

        b = c - b;
        a = c - b;


        String st = "Current task posted for Java developers developers";

        String[] words = st.split(" ");


        Map<String, Integer> strFreq = new HashMap<>();

        for (String word : words){
            strFreq.put(word, strFreq.getOrDefault(word, 0) + 1);
        }

        String da = "da";
    }
}
