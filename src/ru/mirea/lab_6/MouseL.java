package ru.mirea.lab_6;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseL implements MouseListener {
    private String place;
    private JPanel rootPanel;
    public MouseL(String p, JPanel panel) {
        place = p;
        rootPanel = panel;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JOptionPane.showMessageDialog(rootPanel,
                place,
                "Добро пожаловать в",
                JOptionPane.PLAIN_MESSAGE);
    }

    public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
