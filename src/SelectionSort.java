import javax.swing.*;
import java.util.*;

public class SelectionSort extends JPanel {

    public void executeSelectionSort(ArrayList<Integer> nums, Draw draw, App app) throws InterruptedException {
        int anchor_idx = 0;

        while (anchor_idx < nums.size() - 1) {
            int lowest = nums.get(anchor_idx);
            int lowest_idx = anchor_idx;

            for (int idx = anchor_idx + 1; idx < nums.size(); idx++) {
                if (nums.get(idx) < lowest) {
                    lowest = nums.get(idx);
                    lowest_idx = idx;
                }
            }
            Collections.swap(nums, anchor_idx, lowest_idx);
            anchor_idx++;

            Thread.sleep(100);
            draw.removeAll();
            draw.updateArray(nums);
            draw.revalidate();
            draw.paintImmediately(0,30,870,532);;
        }
        app.needReset = true;
    }
}
