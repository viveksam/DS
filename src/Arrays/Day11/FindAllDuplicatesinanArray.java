package Arrays.Day11;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []

 */
public class FindAllDuplicatesinanArray {
   public static void main(String args[])
   {
       int nums[] ={4,3,2,7,8,2,3,1};
       System.out.println(findDuplicates(nums));
   }


    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++)
        {
            while(nums[i]!=i+1)
            {
                int d = nums[i]-1;
                if(nums[d]!=nums[i])
                {
                    int temp = nums[d];
                    nums[d]= nums[i];
                    nums[i]= temp;
                }
                else
                {
                    break;
                }
            }
        }

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=i+1)
            {
                result.add(nums[i]);
            }
        }

        return result;
    }
}
