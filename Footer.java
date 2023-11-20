/*
Sage Drewke
Professor Bamford
Final Project
5 May 2023
 */
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class Footer extends JPanel {

    // buttons needed
    JButton addTask;
    JButton clear;
    JButton exit;
    JButton showCompleted;
    JButton showAllTasks;

    // color of user panel
    Color colorA = new Color(245, 66, 191);
    Border emptyBorder = BorderFactory.createEmptyBorder();

    //constructor
    public Footer() {
        this.setPreferredSize(new Dimension(500, 150));
        this.setBackground(colorA);

        //add task button
        addTask = new JButton("Add A New Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Georgia", Font.ITALIC, 25));
        addTask.setVerticalAlignment(JButton.BOTTOM);
        addTask.setBackground(colorA);
        this.add(addTask);

        this.add(Box.createHorizontalStrut(7));

        // clear button
        clear = new JButton("Delete Completed Tasks");
        clear.setFont(new Font("Georgia", Font.ITALIC, 25));
        clear.setBorder(emptyBorder);
        clear.setBackground(colorA);
        this.add(clear);

        //show completed button
        showCompleted = new JButton("Show Completed Tasks");
        showCompleted.setFont(new Font("Georgia", Font.ITALIC, 25));
        showCompleted.setBorder(emptyBorder);
        this.add(showCompleted);

        this.add(Box.createHorizontalStrut(7));

        //show all tasks button
        showAllTasks = new JButton ("Show all Tasks");
        showAllTasks.setFont(new Font("Georgia", Font.ITALIC,25));
        showAllTasks.setBorder(emptyBorder);
        this.add(showAllTasks);

        this.add(Box.createHorizontalStrut(7));

        //exit button
        exit = new JButton("Exit");
        exit.setFont(new Font("Georgia", Font.ITALIC, 25));
        exit.setBorder(emptyBorder);
        exit.setVerticalAlignment(JButton.BOTTOM);
        this.add(exit);

    }

    //returns new task JButton
    public JButton getNewTask() {
        return addTask;
    }

    //returns clear JButton
    public JButton getClear() {
        return clear;
    }
    // returns show completed JButton
    public JButton getShowCompleted() {
        return showCompleted;
    }
    //returns show all tasks JButton
    public JButton getShowAllTasks(){
        return showAllTasks;
    }
    //returns Exit JButton
    public JButton getExit()
    {
        return exit;
    }
}
