package Arrays.Day11;
/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.



Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
 */
public class FindtheDuplicateNumber {
   public static void main(String args[])
   {
       int nums[] ={1,3,4,2,2};
       System.out.println(findDuplicate(nums));
   }

    public static int findDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++)
        {
            while(nums[i]!=i+1)
            {
                int d = nums[i]-1;
                if(nums[i]!=nums[d])
                {
                    int temp = nums[i];
                    nums[i]= nums[d];
                    nums[d]= temp;
                }
                else
                {
                    break;
                }

                //  System.out.println(Arrays.toString(nums));
            }
        }

        return nums[nums.length-1];
    }
}
