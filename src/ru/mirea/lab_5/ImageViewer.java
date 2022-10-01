package ru.mirea.lab_5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ImageViewer extends JFrame{
    private JPanel rootPanel;
    private JLabel imageLabel;

    public ImageViewer(String IMG_PATH){
        super("Image: " + IMG_PATH);
        setContentPane(rootPanel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        try{
            BufferedImage img = ImageIO.read(new File(IMG_PATH));
            ImageIcon icon = new ImageIcon(img);
            imageLabel.setIcon(icon);
            setSize(icon.getIconWidth(), icon.getIconHeight());
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new ImageViewer(args[0]);
    }
}
