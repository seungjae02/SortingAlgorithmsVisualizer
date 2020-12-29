import java.io.*;
import java.util.*;

public class BubbleSort {
    boolean swapped = true;

    public void executeBubbleSort(ArrayList<Integer> nums) {
        // Initiate New Array

        // Start bubble sorting
        while (swapped) {
            swapped = false;
            for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i) > nums.get(i+1)) {
                    Collections.swap(nums, i, i+1);
                    swapped = true;

                }
            }

        }
        System.out.println(nums);


    }

}
