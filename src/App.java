import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class App extends JFrame implements ActionListener {

    // Instantiate Objects

    // Random stuff
     JComboBox algosDropdown;
     JLabel lblTtl;
     String selectedAlgo = "";
     JPanel panelUpper = new JPanel();
    CreateArray newArray = new CreateArray();
    ArrayList<Integer> array = newArray.createArray();
    Draw draw = new Draw(array);

    // Buttons
    JButton start;
    JButton reset;

    // Instantiate Algorithms
    BubbleSort bubble = new BubbleSort();
    SelectionSort selection = new SelectionSort();
    InsertionSort insertion = new InsertionSort();
     // [Insert more sorting algorithms here]

    boolean needReset = false;

    public App(){
        // Instantiate stuff
        this.setTitle("Sorting Algorithms Visualizer");
        this.setSize(new Dimension(870, 582));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title
        lblTtl = new JLabel("Sorting Algorithms Visualizer");
        lblTtl.setHorizontalAlignment(JLabel.CENTER);
        lblTtl.setVerticalAlignment(JLabel.NORTH);
        lblTtl.setFont(new Font("Niagara Solid", Font.BOLD, 30));
        panelUpper.add(lblTtl);

        // Combo Box
        String[] algorithms = {"Select Algorithm", "Bubble Sort", "Selection Sort", "Insertion Sort", "Quick Sort"};
        algosDropdown = new JComboBox(algorithms);
        algosDropdown.setBounds(690,0,155,30);
        algosDropdown.addActionListener(this);
        panelUpper.add(algosDropdown);

        // Buttons
        // Start Button
        start = new JButton("Start Visualization");
        start.setBounds(695, 30, 140,30);
        start.addActionListener(this);
        panelUpper.add(start);

        // Reset Button
        reset = new JButton("Reset");
        reset.setBounds(695, 60, 140, 30);
        reset.addActionListener(this);
        panelUpper.add(reset);

        // Align two panels
        panelUpper.setBounds(0,0,870,60);
        draw.setBounds(0,60,870,502);

        // Draw Array Bars on Panel

        // Add panels
        this.add(draw);
        this.add(panelUpper);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Check status before pressing start button
        if (e.getSource()==start & algosDropdown.getSelectedItem() != "Select Algorithm" & !needReset) {
            if (selectedAlgo.equals("Bubble")) {
                System.out.println("A");
                try {
                    bubble.executeBubbleSort(array, draw, this);
                    System.out.println("B");
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                    System.out.println("C");
                }

            } else if (selectedAlgo == "Selection") {
                try {
                    selection.executeSelectionSort(array, draw, this);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

            } else if (selectedAlgo == "Insertion") {
                try {
                    insertion.executeInsertionSort(array, draw, this);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

            } else if (selectedAlgo == "Quick") {

            }
        }
            // Reset button status
            if (e.getSource()==reset) {
                array = newArray.createArray();
                draw.updateArray(array);
                draw.repaint();
                needReset = false;

            }
            // Combo box status
        if (e.getSource()==algosDropdown) {
            System.out.println(algosDropdown.getSelectedItem());
            if (algosDropdown.getSelectedItem() == "Bubble Sort") {
                selectedAlgo = "Bubble";
                lblTtl.setText("Bubble Sort");
                lblTtl.setFont(new Font("Niagra Solid", Font.BOLD, 40));

            } else if (algosDropdown.getSelectedItem() == "Selection Sort") {
                selectedAlgo = "Selection";
                lblTtl.setText("Selection Sort");
                lblTtl.setFont(new Font("Niagra Solid", Font.BOLD, 40));

            } else if (algosDropdown.getSelectedItem() == "Insertion Sort") {
                selectedAlgo = "Insertion";
                lblTtl.setText("Insertion Sort");
                lblTtl.setFont(new Font("Niagra Solid", Font.BOLD, 40));

            } else if (algosDropdown.getSelectedItem() == "Quick Sort") {
                selectedAlgo = "Quick";
            }
        }

    }
}

