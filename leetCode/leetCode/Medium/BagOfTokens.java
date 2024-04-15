package leetCode.Medium;

import java.util.*;

public class BagOfTokens {

    //You start with an initial power of power, an initial score of 0, and a bag of tokens given as an integer array tokens, where each token[i] donates the value of token.
    //
    //Your goal is to maximize the total score by strategically playing these tokens. In one move, you can play an unplayed token in one of the two ways (but not both for the same token):
    //
    //Face-up: If your current power is at least tokens[i], you may play tokeni, losing tokens[i] power and gaining 1 score.
    //Face-down: If your current score is at least 1, you may play tokeni, gaining tokens[i] power and losing 1 score.
    //Return the maximum possible score you can achieve after playing any number of tokens.


    public static int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        Arrays.sort(tokens);
        Deque<Integer> deque = new ArrayDeque<>();

        for (int token : tokens){
            deque.add(token);
        }

        while (!deque.isEmpty()){
            if (power >= deque.peekFirst()){
                power -= deque.pollFirst();
                score++;
            } else if (deque.size() > 1 && score > 0){
                power += deque.pollLast();
                score--;
            } else {
                return score;
            }
        }
        return score;
    }

    public static void main(String[] args) {

        System.out.println(bagOfTokensScore(new int[]{48,87,26}, 81));

    }
}
