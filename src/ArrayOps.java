import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;
import java.awt.*;

public class ArrayOps extends JPanel {
    ArrayList<Integer> nums = new ArrayList<>();

    public void createArray() {
        for (int i=1; i<51; i++) {
            nums.add(7*i);
        }
        Collections.shuffle(nums);
        System.out.println(nums);

    }

     public void paintComponent(Graphics g) {
        super.paintComponent(g); // This paints the background

        g.setColor(Color.BLACK);
        g.fillRect(80, 100, 400, 250);
    }


}
