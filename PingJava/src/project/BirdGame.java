package project;

import javax.swing.*;
import java.awt.*;

public class BirdGame {

    public static void main(String[] args) {

           
            JFrame frame = new JFrame();
            frame.setTitle("Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);


            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                  
                     Image backgroundImage = new ImageIcon("pic/background1.jpg").getImage();
                     g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                     
                }
            };


            panel.setLayout(null);


            frame.getContentPane().add(panel);


            frame.setVisible(true);
        };
        
    }
