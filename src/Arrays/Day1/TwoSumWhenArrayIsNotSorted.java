package Arrays.Day1;

/*Given an array and a target number, find the indices of the two values from the array that sum up to the given target number.

Example One
{
        "numbers": [5, 3, 10, 45, 1],
        "target": 6
        }
Output:

        [0, 4]
Sum of the elements at index 0 and 4 is 6.

Example Two
{
        "numbers": [4, 1, 5, 0, -1],
        "target": 10
        }
Output:

        [-1, -1]*/

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSumWhenArrayIsNotSorted {


    public static void main(String args[]) {
        int[] numbers = {4, 1, 5, 0, -1};
        int target = 10;

        ArrayList<Integer> result = new ArrayList<>();
        result = Sum(numbers, target);
        System.out.println(result.toString());
    }

    private static ArrayList<Integer> Sum(int[] numbers, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            int num = target-numbers[i];
            if(!hm.containsKey(num)){
                hm.put(numbers[i],i);
            }
            else{
                result.add(i);
                result.add(hm.get(num));
                return  result;
            }
        }

       result.add(-1);
        result.add(-1);
        return result;
    }
}



