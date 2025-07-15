package Arrays.Day2;

import java.util.*;

/*Given an array arr[], write a function that segregates even and odd numbers. The functions should put all even numbers first, and then odd numbers.

        Example:

Input: arr = [0, 1, 2, 3, 4]
Output: arr = [0, 2, 4, 1, 3]
Explanation: 0 2 4 are even and 1 3 are odd numbers. Please note that [2, 0, 4, 3, 1] or [4, 2, 0, 1, 3] are also valid outputs. We only need to make sure that all even elements are before all odd.

Input : arr = {1, 5, 11}
Output : arr = {1, 5, 11}
Explanation All numbers are odd*/

public class SegregateEvenandOddnumbersUsing2Pointers {


    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        int[] result = new int[arr.length];
       result= segregateEvenOdd(arr);
        System.out.println("Array after segregation: " + Arrays.toString(result));
    }

    private static int[]  segregateEvenOdd(int[] arr) {
       int left =0;
       int right= arr.length-1;

       while(left<=right)
       {
           if(arr[left]%2!=0)
           {
               left++;
           }
           else if(arr[right]%2==0)
           {
               right--;
           }

           else{
               int temp = arr[left];
                arr[left]=arr[right];
               arr[right]=temp;
               left++;
               right--;
           }



       }

        return arr;
    }
}
