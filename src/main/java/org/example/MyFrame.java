package org.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
       
        this.setTitle("Pharma 4+");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Provide the correct path to the image
        String imagePath = "src/main/java/org/example/logo.png";
        ImageIcon image = new ImageIcon(imagePath);

        // Check if image was loaded successfully
        if (image.getImageLoadStatus() == MediaTracker.COMPLETE) {
            System.out.println("Image loaded successfully.");
            this.setIconImage(image.getImage());
        } else {
            System.out.println("Failed to load image: " + imagePath);
        }

        this.setSize(420, 420);
        this.setVisible(true);

        this.getContentPane().setBackground(new Color(123, 50, 250));

    }

}
