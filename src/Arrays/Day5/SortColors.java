package Arrays.Day5;

import java.util.Arrays;

/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]*/
public class SortColors {

    public static void main(String args[])
    {
        int[] nums = { 2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int one = -1;
        int zero = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one++;

                int temp = nums[one];
                nums[one] = nums[i];
                nums[i] = temp;
            } else if (nums[i] == 0) {
                one++;
                int temp = nums[one];
                nums[one] = nums[i];
                nums[i] = temp;
                zero++;
                temp = nums[zero];
                nums[zero] = nums[one];
                nums[one] = temp;
            }

        }
    }
}
