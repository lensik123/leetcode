package leetCode.Medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class InsertInterval {

    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {6,9}};
        int[] interval = {2,5};
        insert(intervals, interval);

    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {

        int[][] mergedIntervals = new int[intervals.length + 1][2];

        for (int i = 0; i < intervals.length; i++) {
            mergedIntervals[i] = intervals[i];
        }
        mergedIntervals[intervals.length] = newInterval;
        Arrays.sort(mergedIntervals, Comparator.comparingInt(a -> a[0]));

        LinkedList<int[]> mergedListIntervals = new LinkedList<>();


        for (int[] interval : mergedIntervals){
            if(mergedListIntervals.isEmpty() || mergedListIntervals.getLast()[1] < interval[0]){
                mergedListIntervals.add(interval);
            } else {
                mergedListIntervals.getLast()[1] = Math.max(mergedListIntervals.getLast()[1], interval[1]);
            }
        }


        return  mergedListIntervals.toArray(new int [mergedListIntervals.size()][]);
    }
}
