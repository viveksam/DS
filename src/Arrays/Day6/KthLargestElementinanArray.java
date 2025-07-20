package Arrays.Day6;

/*Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?



Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4*/

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {

    public static void main(String args[])
    {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for(Integer n : nums)
        {
            maxHeap.add(n);
        }

        for(int i=1; i<k; i++)
        {
            maxHeap.poll();
        }

     //   System.out.println(maxHeap.peek());
        return maxHeap.peek();
    }
}
