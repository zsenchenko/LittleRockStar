package com.go.little.rockstar.task02;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,6,0};
        System.out.println(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        int max = -1, index = -1, second = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > second)
                second = nums[i];
        }
        return second * 2 <= max ? index : -1;
    }
}

