package Array;
import java.util.*;

public class kadanes {
    public static void kadanes_algo(int arr[]) {
        int curr_sum = 0, maximum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            curr_sum = curr_sum + arr[i];
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            maximum = Math.max(curr_sum, maximum); 
        }
        System.out.println("Our maximum subarray sum is: " + maximum);
    }

    public static void main(String args[]) {
        int arr[] = {-1, -2, 4,5, -3, -4,};
        kadanes_algo(arr);
    }
}

// codevita

