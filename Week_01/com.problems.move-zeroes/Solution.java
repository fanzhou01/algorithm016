package com.problems.move-zeroes;

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return ;
        }
        int count =0;
        for(int n = 0;n<nums.length ;n++){
            if(n>=nums.length-count){
                break;
            }
            if(nums[n]==0){
                for(int j=n;j<nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1]=0;
                n--;
                count++;
            }
        }
    }
}