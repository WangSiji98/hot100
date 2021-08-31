package com.oasis.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int[] s = new int[]{1, 2, 3, 4, 5};
        int[] t = Arrays.copyOfRange(s, 1, 3);
        for (int n: t) {
            System.out.println(n);
        }
    }
}

//class Test {
//    public int[][] merge(int[][] intervals) {
//        if (intervals.length == 1) {
//            return intervals;
//        }
//        Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
//
//        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
//
//        List<int[]> res = new ArrayList<>();
//        for (int i=0; i<intervals.length ; i++) {
//            int L = intervals[i][0], R = intervals[i][1];
//            if (res.size() == 0 || res.get(res.size() - 1)[1] < L) {
//                res.add(new int[]{L, R});
//            } else {
//                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], R);
//            }
//        }
//        return res.toArray(new int[res.size()][]);
//    }
//
//    public void fuck(int[] nums) {
//        Arrays.sort(nums, (a, b) -> (a - b));
//    }
//}