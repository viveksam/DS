package Arrays.Day7;

/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.



        Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays {

    public static void main(String args[])
    {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer m : nums1)
            hs.add(m);

        for(Integer n : nums2)
        {
            if(hs.contains(n))
            {
                if(!list.contains(n))
                    list.add(n);
            }
        }

        int[] result = new int[list.size()];
        for(int k=0; k<list.size(); k++)
        {
            result[k]=list.get(k);
        }

        return result;
    }

}
