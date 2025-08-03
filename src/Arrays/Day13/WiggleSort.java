package Arrays.Day13;
/*
Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

Example:

Input: nums = [3,5,2,1,6,4]
Output: One possible answer is [3,5,1,6,2,4]
 */


import java.util.Arrays;

public class WiggleSort {

    public static void main(String args[])
    {
        int[] nums = {3,5,2,1,6,4};
        solution(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void solution(int[] nums)
    {
        for(int i=1; i<nums.length; i++ )
        {
            if((nums[i]%2==0 && nums[i-1]>nums[i])||(nums[i]%2!=0 && nums[i-1]<nums[i]))
            {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
        }
    }
}
