package com.company;
public class Task3 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 54, 19, 46};
        int a = nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]= a;
        System.out.println(nums[0] + nums[nums.length/2]);
    }
}

