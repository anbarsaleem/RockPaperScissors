import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RockPaperScissors extends JFrame implements ActionListener {

    JPanel choices;
    JButton rock, paper, scissors;
    JLabel instructions; 
    Random opponentChoice = new Random();

    public RockPaperScissors(String rps){

        super(rps);

        choices = new JPanel();
        rock = new JButton("ROCK");
        paper = new JButton("PAPER");
        scissors = new JButton("SCISSORS");
        instructions = new JLabel("Press one of the buttons to challenge the robot");

        rock.addActionListener(this);
        paper.addActionListener(this);
        scissors.addActionListener(this);

        rock.setActionCommand("rock");
        paper.setActionCommand("paper");
        scissors.setActionCommand("scissors");

        final BoxLayout bl = new BoxLayout(choices, BoxLayout.X_AXIS);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        choices.setLayout(bl);

        choices.add(rock);
        choices.add(paper);
        choices.add(scissors);

        add(instructions);
        add(choices);

    }

    @Override
    public void actionPerformed(final ActionEvent e) {

        int opponent = opponentChoice.nextInt(2) + 1; //1 is rock, 2 is paper, 3 is scissors

        String opChoice;
        if(opponent == 1) {

            opChoice = "ROCK";

        }

        else if(opponent == 2) {

            opChoice = "PAPER";

        }

        else {

            opChoice = "SCISSORS";

        }

        if(e.getActionCommand().equals("rock")) {

            if(opponent == 2){

                getContentPane().setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "You lose :(", "The opponent chose " + opChoice, JOptionPane.WARNING_MESSAGE);

            }

            else {

                getContentPane().setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "You win :)", "The opponent chose " + opChoice, JOptionPane.WARNING_MESSAGE);

            }

        }

        if(e.getActionCommand().equals("paper")) {

            if(opponent == 3){

                getContentPane().setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "You lose :(", "The opponent chose " + opChoice, JOptionPane.WARNING_MESSAGE);

            }

            else {

                getContentPane().setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "You win :)", "The opponent chose " + opChoice, JOptionPane.WARNING_MESSAGE);

            }

        }

        if(e.getActionCommand().equals("scissors")) {

            if(opponent == 1){

                getContentPane().setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "You lose :(", "The opponent chose " + opChoice, JOptionPane.WARNING_MESSAGE);

            }

            else {

                getContentPane().setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "You win :)", "The opponent chose " + opChoice, JOptionPane.WARNING_MESSAGE);

            }

        }

    }

    public static void main(final String[] args) {

        RockPaperScissors rps = new RockPaperScissors("Try if you dare...");
        rps.setSize(400, 100);
        rps.setVisible(true);

    }

}