package Arrays.Day10;

import java.util.LinkedList;
import java.util.Queue;

/*Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Implement the MovingAverage class:

MovingAverage(int size) Initializes the object with the size of the window size.
double next(int val) Returns the moving average of the last size values of the stream.
Example 1:

Input
["MovingAverage", "next", "next", "next", "next"]
[[3], [1], [10], [3], [5]]
Output
[null, 1.0, 5.5, 4.66667, 6.0]
Explanation
MovingAverage movingAverage = new MovingAverage(3);
movingAverage.next(1); // return 1.0 = 1 / 1
movingAverage.next(10); // return 5.5 = (1 + 10) / 2
movingAverage.next(3); // return 4.66667 = (1 + 10 + 3) / 3
movingAverage.next(5); // return 6.0 = (10 + 3 + 5) / 3*/

public class MovingAverageByDataStream {

    public int k ;

    public static int avg = 0;
    public static Queue<Integer> queue = new LinkedList<>();
    public MovingAverageByDataStream(int k)
    {
        this.k = k;

    }
    public static void main(String args[])
    {
        MovingAverageByDataStream stream = new MovingAverageByDataStream(3);
        System.out.println(stream.next(1));
        System.out.println(stream.next(10));
        System.out.println(stream.next(3));
        System.out.println(stream.next(5));
    }


    public int next(int x)
    {



        avg = avg+x;
        queue.add(x);
        if(queue.size()>k)
        {
            avg = avg-queue.poll();
        }


        return avg/queue.size();

    }
}
