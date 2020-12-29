import java.io.*;
import java.util.*;

public class BubbleSort {
    ArrayOps array = new ArrayOps();
    boolean swapped = true;

    public void executeBubbleSort() {
        // Initiate New Array
        array.createArray();

        // Start bubble sorting
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.nums.size() - 1; i++) {
                if (array.nums.get(i) > array.nums.get(i+1)) {
                    Collections.swap(array.nums, i, i+1);
                    swapped = true;

                }
            }

        }
        System.out.println(array.nums);


    }

}
