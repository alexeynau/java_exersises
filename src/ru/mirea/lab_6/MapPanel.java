package ru.mirea.lab_6;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MapPanel extends JFrame{
    private JPanel rootPanel;
    private JPanel northPanel;
    private JPanel westPanel;
    private JPanel centerPanel;
    private JPanel eastPanel;
    private JPanel southPanel;

    public MapPanel() {
        super("Map Panel");
        setContentPane(rootPanel);
        setVisible(true);
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        centerPanel.addMouseListener(new MouseL("", rootPanel));
        westPanel.addMouseListener(new MouseL("Джидда", rootPanel));
        southPanel.addMouseListener(new MouseL("Абха", rootPanel));
        eastPanel.addMouseListener(new MouseL("Дахране", rootPanel));
        northPanel.addMouseListener(new MouseL("",rootPanel));
    }

    public static void main(String[] args) {
        new MapPanel();
    }
}
