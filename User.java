/*
Sage Drewke
Professor Bamford
Final Project
5 May 2023
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class User extends JFrame {

    private Title title;
    private Footer footer;
    private List list;

    //buttons needed
    private JButton newTask;
    private JButton clear;
    private JButton exit;
    private JButton showCompleted;
    private JButton showAllTasks;

    //constructor that initializes buttons
    public User() {
        this.setSize(600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new Title();
        footer = new Footer();
        list = new List();

        this.add(title, BorderLayout.NORTH);
        this.add(footer, BorderLayout.SOUTH);
        this.add(list, BorderLayout.CENTER);

        newTask = footer.getNewTask();
        clear = footer.getClear();
        exit = footer.getExit();
        showAllTasks = footer.getShowAllTasks();

        // new
        showCompleted = footer.getShowCompleted();


        addListeners();
        this.setVisible(true);


    }

    //method that add mouse listeners to buttons
    public void addListeners() {
        newTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.updateNumbers();
            }
        });

        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                list.removeCompletedTasks();
                repaint();
            }
        });

        showCompleted.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                list.showCompleted();
            }
        });

        showAllTasks.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                list.showAllTasks();
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                System.exit(0);
            }
        });
    }
}