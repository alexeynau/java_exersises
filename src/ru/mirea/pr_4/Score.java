package ru.mirea.pr_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {
    private JPanel rootPanel;
    private JPanel buttonPanel;
    private JPanel labelPanel;
    private JButton milanButton;
    private JButton realMadridButton;
    private JLabel winnerLabel;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;

    int milanScore = 0;
    int realMadridScore = 0;
    String winner = "";
    public Score(){
        super("Score Table");
        setContentPane(rootPanel);
        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               milanScore +=1;
               lastScorerLabel.setText("Last Scorer: AC Milan");
               updateScore();
               updateWinner();
            }
        });

        realMadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realMadridScore +=1;
                lastScorerLabel.setText("Last Scorer: Real Madrid");
                updateScore();
                updateWinner();
            }
        });

    }
    public void updateScore(){
        resultLabel.setText("Result: " + milanScore + " X " + realMadridScore);
    }
    public void updateWinner(){
        if (milanScore > realMadridScore){
            winnerLabel.setText("Winner: AC Milan");
        }
        else if (milanScore < realMadridScore){
            winnerLabel.setText("Winner: Real Madrid");
        }
        else {
            winnerLabel.setText("Winner: DRAW");
        }

    }

    public static void main(String[] args) {
        new Score();
    }

}
