import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class App extends JFrame implements ActionListener {

    // Instantiate Objects
     JComboBox algosDropdown;
     JButton start;
     JLabel lblTtl;
     String selectedAlgo = "";
     BubbleSort bubble;
     JPanel panelUpper = new JPanel();
     ArrayOps arrayVis = new ArrayOps();

     // [Insert more sorting algorithms here]

    public App(){
        // Instantiate Shit
        this.setTitle("Sorting Algorithms Visualizer");
        this.setSize(new Dimension(870, 582));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Combo Box
        String[] algorithms = {"Select Algorithm", "Bubble Sort", "Selection Sort", "Insertion Sort", "Quick Sort"};
        algosDropdown = new JComboBox(algorithms);
        algosDropdown.setBounds(690,0,155,30);
        algosDropdown.addActionListener(this);
        panelUpper.add(algosDropdown);

        // Button
        start = new JButton("Start Visualization");
        start.setBounds(695, 30, 140,30);
        start.addActionListener(this);
        panelUpper.add(start);

        // Title
        lblTtl = new JLabel("Sorting Algorithms Visualizer");
        lblTtl.setHorizontalAlignment(JLabel.CENTER);
        lblTtl.setVerticalAlignment(JLabel.NORTH);
        lblTtl.setFont(new Font("Niagara Solid", Font.BOLD, 30));
        panelUpper.add(lblTtl);

        panelUpper.setBounds(0,0,870,80);
        arrayVis.setBounds(0,50,870,532);

        //this.add(arrayVis);
        this.add(panelUpper);
        this.setVisible(true);

        // Instantiate Array to Sort
        bubble = new BubbleSort();

        // NOTE FOR FUTURE: Instantiate array in a different class maybe
    }
    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==start & algosDropdown.getSelectedItem() != "Select Algorithm") {
            //System.out.println(selectedAlgo);
            if (selectedAlgo == "Bubble") {
                bubble.executeBubbleSort();
            } else if (selectedAlgo == "Selection") {

            } else if (selectedAlgo == "Insertion") {

            } else if (selectedAlgo == "Quick") {

            }
        }
        if (e.getSource()==algosDropdown) {
            System.out.println(algosDropdown.getSelectedItem());
            if (algosDropdown.getSelectedItem() == "Bubble Sort") {
                selectedAlgo = "Bubble";
                lblTtl.setText("Bubble Sort");
                lblTtl.setFont(new Font("Niagra Solid", Font.BOLD, 40));
            } else if (algosDropdown.getSelectedItem() == "Selection Sort") {
                selectedAlgo = "Selection";
            } else if (algosDropdown.getSelectedItem() == "Insertion Sort") {
                selectedAlgo = "Insertion";
            } else if (algosDropdown.getSelectedItem() == "Quick Sort") {
                selectedAlgo = "Quick";
            }
        }

    }
}

