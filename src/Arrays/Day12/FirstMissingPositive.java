package Arrays.Day12;

/*Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.



Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.

 */

public class FirstMissingPositive {
    public static void main(String args[])
    {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        for(int i=0; i<nums.length; i++)
        {
            while(nums[i]!=i+1)
            {
                int d = nums[i]-1;
                if((d>=0 && d<=nums.length-1)&&(nums[i]!=nums[d]))
                {
                    int temp = nums[i];
                    nums[i]=nums[d];
                    nums[d]=temp;
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
                return i+1;

        }

        return nums.length+1;
    }
}
