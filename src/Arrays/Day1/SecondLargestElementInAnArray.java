package Arrays.Day1;

public class SecondLargestElementInAnArray {

    public static void main(String args[]) {
        int[] arr = new int[]{10, 5, 10};
        int number = getSecondLargest(arr);
        System.out.println(number);
    }

    private static int getSecondLargest(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>first){
                second= first;
                first= arr[i];

            }

            if(arr[i]>second && arr[i]!=first)
                second = arr[i];
        }
        return second;
    }
}
