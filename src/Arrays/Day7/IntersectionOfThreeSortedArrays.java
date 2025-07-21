package Arrays.Day7;
/*Given three arrays sorted in the ascending order, return their intersection sorted array in the ascending order.

Example One
{
        "arr1": [2, 5, 10],
        "arr2": [2, 3, 4, 10],
        "arr3": [2, 4, 10]
        }
Output:

        [2, 10]
Example Two
{
        "arr1": [1, 2, 3],
        "arr2": [],
        "arr3": [2, 2]
        }
Output:

        [-1]
Example Three
{
        "arr1": [1, 2, 2, 2, 9],
        "arr2": [1, 1, 2, 2],
        "arr3": [1, 1, 1, 2, 2, 2]
        }
Output:

        [1, 2, 2]
Notes
If the intersection is empty, return an array with one element -1.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfThreeSortedArrays {
    public static void main(String args[])
    {
        int[] arr1 = {2, 5, 10};
        int[] arr2 = {2, 3, 4, 10};
        int[] arr3 ={2, 4, 10};
        System.out.println(Arrays.toString(intersection(arr1,arr2,arr3)));
    }

    public static int[] intersection(int[] nums1, int[] nums2 , int[] nums3) {

        ArrayList<Integer> list = new ArrayList<>();
        int i=0 , j=0 , k=0;
        while(i<nums1.length && j<nums2.length && k<nums3.length)
        {
            if(nums1[i]==nums2[j]&&nums2[j]==nums3[k]){
                list.add(nums1[i]);
                i++;
                j++;
                k++;
            }
            else {
                int min= Math.min(nums1[i],Math.min(nums2[j],nums3[k]));
                if(min==nums1[i]){
                    i++;
                }
                if(min==nums2[j])
                {
                    j++;
                }
                if(min==nums3[k]){
                    k++;
                }
            }
        }
        int[] result = new int[list.size()];
        for(k=0; k<list.size(); k++)
        {
            result[k]=list.get(k);
        }

        return result;
    }

}
