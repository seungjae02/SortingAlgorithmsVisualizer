import javax.swing.*;
import javax.swing.Timer;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.awt.event.*;

public class BubbleSort extends JPanel {
    boolean swapped = true;
    Object screen;

    public BubbleSort(Object thing) {
        screen = thing;
    }
    
    public void executeBubbleSort(ArrayList<Integer> nums, Draw draw) throws InterruptedException {
        // Initiate New Array

        // Start bubble sorting
        while (swapped) {
            swapped = false;
            for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i) > nums.get(i+1)) {
                    Collections.swap(nums, i, i+1);
                    swapped = true;


                    Thread.sleep(10);
                    draw.removeAll();
                    draw.updateArray(nums);
                    draw.revalidate();
                    draw.paintImmediately(0,30,870,532);;
                    System.out.println(nums);
                }
            }

        }
        System.out.println(nums);
    }
}
