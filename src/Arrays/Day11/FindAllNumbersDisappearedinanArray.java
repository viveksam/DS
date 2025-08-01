package Arrays.Day11;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]

 */

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

    public static void main(String args[]) {
        int nums[] ={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            while(nums[i]!=i+1)
            {
                int d = nums[i]-1;
                if(nums[i]!=nums[d]){
                    int temp = nums[i];
                    nums[i]=nums[d];
                    nums[d]= temp;
                }

                else
                {
                    break;
                }
                //    System.out.println(Arrays.toString(nums));
            }
        }

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=i+1)
                result.add(i+1);
        }

        return result ;
    }
}

