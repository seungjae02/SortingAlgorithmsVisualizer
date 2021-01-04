import javax.swing.*;
import java.util.*;

public class InsertionSort extends JPanel {

    public void executeInsertionSort(ArrayList<Integer> nums, Draw draw, App app) throws InterruptedException {
        System.out.println(nums);

        for (int static_idx = 1; static_idx < nums.size(); static_idx++) {
            int moving_idx = static_idx;
            int compare_idx = moving_idx - 1;

            while (compare_idx >= 0 && nums.get(compare_idx) > nums.get(moving_idx)) {
                // Swap and decrement
                Collections.swap(nums, compare_idx, moving_idx);
                moving_idx = moving_idx - 1;
                compare_idx = compare_idx - 1;

                Thread.sleep(25);
                draw.removeAll();
                draw.updateArray(nums);
                draw.revalidate();
                draw.paintImmediately(0,30,870,532);
                System.out.println(nums);
            }
        }
        app.needReset = true;
    }
}
