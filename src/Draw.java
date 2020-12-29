import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {
    ArrayList<Integer> nums = null;

    public void initiateBars(ArrayList<Integer> array) {
        nums = array;
    }

    public void paintComponent(Graphics g) {
        for (int idx = 0; idx < 50; idx++) {
            g.setColor(Color.pink);
            g.fillRect(10 + 17 * (idx), 502 - nums.get(idx), 17, nums.get(idx));
        }

    }
}
