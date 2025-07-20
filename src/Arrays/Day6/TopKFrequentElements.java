package Arrays.Day6;

/*Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



        Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static void main(String args[])
    {
        int[] nums = {1,1,1,2,2,3};
        int k =2;
        int[] result = new int[k];
        result = topKFrequent(nums,k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(Integer n : nums)
        {
            if(!hm.containsKey(n))
            {
                hm.put(n,1);
            }
            else
            {
                hm.put(n, hm.get(n)+1);
            }
        }


        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b)-> hm.get(b)-hm.get(a));


        minHeap.addAll(hm.keySet());

        System.out.println(minHeap);

        for(int i=1; i<=k; i++)
        {
            result[i-1] = minHeap.poll();
        }

        return result;
    }
}
