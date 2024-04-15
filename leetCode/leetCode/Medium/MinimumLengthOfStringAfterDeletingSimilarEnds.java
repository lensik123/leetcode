package leetCode.Medium;

public class MinimumLengthOfStringAfterDeletingSimilarEnds {

    //Given a string s consisting only of characters 'a', 'b', and 'c'. You are asked to apply the following algorithm on the string any number of times:
    //
    //Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
    //Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
    //The prefix and the suffix should not intersect at any index.
    //The characters from the prefix and suffix must be the same.
    //Delete both the prefix and the suffix.
    //Return the minimum length of s after performing the above operation any number of times (possibly zero times).v


    //Input: s = "ca"
    //Output: 2

    //Input: s = "cabaabac"
    //Output: 0

    //Input: s = "aabccabba"
    //Output: 3
    //Explanation: An optimal sequence of operations is:
    //- Take prefix = "aa" and suffix = "a" and remove them, s = "bccabb".
    //- Take prefix = "b" and suffix = "bb" and remove them, s = "cca".
    //

    public static int minimumLength(String s) {


        int begin = 0;
        int end = s.length() - 1;

        // Delete similar ends until the ends differ, or they meet in the middle
        while (begin < end && s.charAt(begin) == s.charAt(end)) {
            char c = s.charAt(begin);

            // Delete consecutive occurrences of c from prefix
            while (begin <= end && s.charAt(begin) == c) {
                begin++;
            }


            //da
            // Delete consecutive occurrences of c from suffix
            while (end > begin && s.charAt(end) == c) {
                end--;
            }
        }

        // Return the number of remaining characters
        return end - begin + 1;
    }


    public static void main(String[] args) {

        System.out.println(minimumLength("cabaabac"));


    }
}
