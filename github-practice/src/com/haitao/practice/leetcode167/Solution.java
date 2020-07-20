package com.haitao.practice.leetcode167;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int lo = 0, hi = numbers.length-1;
        while (lo<hi){
            if(target == numbers[lo]+numbers[hi]){
                return new int[]{lo+1,hi+1};
            }else if(target < numbers[lo]+numbers[hi]){
                hi--;
            }else {
                lo++;
            }

        }
        return null;
    }
}
