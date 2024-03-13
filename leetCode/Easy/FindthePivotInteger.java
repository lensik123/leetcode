package leetCode.Easy;

public class FindthePivotInteger {
    public static void main(String[] args) {

        System.out.println(pivotInteger(8));

    }

    public static int pivotInteger(int n) {

        if (n == 1) {
            return 1;
        }

        int leftValue = 1;
        int rightValue = n;
        int leftSum = leftValue;
        int rightSum = rightValue;

        while (leftValue < rightValue){

            if (leftSum < rightSum){
                leftSum += ++leftValue;
            }
            else {
                rightSum += --rightValue;
            }

            if (leftSum == rightSum && leftValue + 1 == rightValue - 1){
                return leftValue + 1;
            }
        }

        return -1;
    }
}
