package Arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoSumInASortedArray {


    /*Given an array sorted in non-decreasing order and a target number, find the indices of the two values from the array that sum up to the given target number.

            Example
    {
        "numbers": [1, 2, 3, 5, 10],
        "target": 7
    }
    Output:

            [1, 3]
    Sum of the elements at index 1 and 3 is 7.*/

    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 5, 10};
        int target =7;

        ArrayList<Integer> result = new ArrayList<>();
        result = hasSum(numbers , target);

       System.out.println(result.toString());
    }

    private static ArrayList<Integer> hasSum(int[] numbers, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = numbers.length-1;

        while(left<right){
         int sum = numbers[right]+numbers[left];
         if(sum>target)
             right--;
         else if(sum<target)
             left++;
         else if(sum==target)
         {
             result.add(left);
             result.add(right);
             return result;
         }

        }

        result.add(-1);
        result.add(-1);
        return result;
    }
}
