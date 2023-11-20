/*
Sage Drewke
Professor Bamford
Final Project
5 May 2023
 */
import javax.swing.*;
import java.awt.*;
public class Title extends JPanel {
    Color color1 = new Color(245,66,191);

    //constructor
    public Title(){
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(color1);
        JLabel titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(200,60));
        titleText.setFont(new Font("Georgia", Font.ITALIC, 35));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleText);
    }
}
