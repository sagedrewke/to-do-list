/*
Sage Drewke
Professor Bamford
Final Project
5 May 2023
 */
import javax.swing.*;
import java.awt.*;

public class List extends JPanel {

    Color salmon = new Color(245, 66, 191);
    JLabel middleTitle;

    // constructor
    public List() {
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(9);

        this.setLayout(layout);
        this.setPreferredSize(new Dimension(400, 560));
        this.setBackground(salmon);

        middleTitle = new JLabel("Programmed by Sage Drewke");
        middleTitle.setFont(new Font("Georgia", Font.ITALIC, 20));
        middleTitle.setPreferredSize(new Dimension(10,500));
        middleTitle.setHorizontalAlignment(JLabel.CENTER);
        this.add(middleTitle, BorderLayout.WEST);
    }
    // updates the index of each "task"
    public void updateNumbers() {
        Component[] listItems = this.getComponents();

        for (int i = 1; i < listItems.length; i++) {
            if (listItems[i] instanceof Task) {
                ((Task) listItems[i]).changeIndex(i);
            }
        }

    }
    // shows all completed tasks
    public void showCompleted(){
        for (Component c : getComponents()) {
            if (c instanceof Task){
                JCheckBox completed = ((Task) c).getCompleted();
                if (completed.isSelected()) {
                    c.setVisible(true);
                }
                else {
                    c.setVisible(false);
                }
            }
        }
    }
    // shows all tasks
    public void showAllTasks(){
        for (Component x : getComponents())
        {
            if (x instanceof Task) {

                x.setVisible(true);
            }
        }
    }
    // removes completed tasks
    public void removeCompletedTasks() {
        for (Component c : getComponents()) {
            if (c instanceof Task) {
                JCheckBox completed = ((Task) c).getCompleted();
                if (completed.isSelected()) {
                    remove(c);
                    updateNumbers();
                }
            }
        }

    }
}