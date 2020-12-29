import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;
import java.awt.*;


public class CreateArray {
    public ArrayList<Integer> createArray() {
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i < 51; i++) {
            nums.add(9 * i);
        }
        Collections.shuffle(nums);
        System.out.println(nums);

        return nums;
    }

}
