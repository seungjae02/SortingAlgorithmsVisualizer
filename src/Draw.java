import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {
    ArrayList<Integer> nums;

    public Draw(ArrayList<Integer> array) {
        nums = array;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int idx = 0; idx < nums.size(); idx++) {
            //super.paintComponent(g);
            g.setColor(Color.pink);
            g.fillRect(10 + 17 * (idx), 502 - nums.get(idx), 17, nums.get(idx));
        }

    }

    public void updateArray(ArrayList<Integer> array) throws InterruptedException {
        nums = array;
    }
}
