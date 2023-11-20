/*
Sage Drewke
Professor Bamford
Final Project
5 May 2023
 */
import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    //buttons needed
    private JButton addATask;
    private JTextField taskName;
    private JCheckBox completed;

    Color ColorOne = new Color(245, 66, 191);

    //constructor
    public Task() {
        this.setBackground(ColorOne);
        this.setLayout(new BorderLayout());

        addATask = new JButton("");
        addATask.setBorder(BorderFactory.createEmptyBorder());
        this.add(addATask, BorderLayout.WEST);

        taskName = new JTextField("");
        taskName.setHorizontalAlignment(JTextField.CENTER);
        taskName.setFont(new Font("Georgia", Font.ITALIC, 20));
        this.add(taskName, BorderLayout.CENTER);


        completed = new JCheckBox("Completed");
        completed.setFont(new Font("Georgia", Font.BOLD, 15));
        completed.setBorder(BorderFactory.createEmptyBorder());
        this.add(completed, BorderLayout.SOUTH);

    }
    // updates the index
    public void changeIndex(int num) {
        this.addATask.setText(num + "");
        this.revalidate();
    }
    //returns whether a task is completed
    public JCheckBox getCompleted() {
        return completed;
    }
}
