import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;

public class passGui extends JFrame
{
    private JLabel I;
    private JLabel numOfChar;
    private JLabel yourPass;
    private JCheckBox lettersBox;
    private JCheckBox numbersBox;
    private JCheckBox symbolsBox;
    private JTextField numCharInt;
    private JTextField yourNewPass;
    private JButton genPass;

    public void createGui()
    {
        /*
        Random rand = new Random();
        numbersLettersSymbols(10);
        */
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Password Generator");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        I = new JLabel("Include these characters:");
        I.setBounds(10, -20, 300, 100);
        panel.add(I);

        lettersBox = new JCheckBox("Letters");
        panel.add(lettersBox);

        numbersBox = new JCheckBox("Numbers");
        panel.add(numbersBox);
        
        symbolsBox = new JCheckBox("Symbols");
        panel.add(symbolsBox);
        
        numOfChar = new JLabel("Enter password length:");
        numOfChar.setBounds(10, 85, 300, 100);
        panel.add(numOfChar);
        
        numCharInt = new JTextField(0);
        numCharInt.setBounds(10, 147, 150, 20);
        panel.add(numCharInt);
        
        yourPass = new JLabel("Your password is:");
        yourPass.setBounds(10, 215, 300, 20);
        panel.add(yourPass);
        
        yourNewPass = new JTextField("Your password appears here.");
        yourNewPass.setBounds(10, 235, 150, 20);
        panel.add(yourNewPass);
        
        genPass = new JButton("Generate Password!");
        genPass.setBounds(10, 185, 155, 20);
        
        panel.add(genPass);
        
        frame.setVisible(true);
        I.setVisible(true);
        numOfChar.setVisible(true);
        numCharInt.setVisible(true);
        yourPass.setVisible(true);
        yourNewPass.setVisible(true);
        genPass.setVisible(true);
        buttonAction buttonAction =  new buttonAction();
        genPass.addActionListener(buttonAction);
    }
    private class buttonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            passRandom passRandom = new passRandom();
            String tempText = numCharInt.getText();
            int passwordLength = Integer.parseInt(tempText);
            {
                if (lettersBox.isSelected() && numbersBox.isSelected() && symbolsBox.isSelected())
                {
                yourNewPass.setText(passRandom.numbersLettersSymbols(passwordLength));
                }
                else if (lettersBox.isSelected() && numbersBox.isSelected())
                {
                yourNewPass.setText(passRandom.lettersNumbers(passwordLength));
                }
                else if (lettersBox.isSelected() && symbolsBox.isSelected())
                {
                yourNewPass.setText(passRandom.lettersSymbols(passwordLength));
                }
                else if(numbersBox.isSelected() && symbolsBox.isSelected())
                {
                yourNewPass.setText(passRandom.numbersSymbols(passwordLength));
                }
                else if(lettersBox.isSelected())
                {
                yourNewPass.setText(passRandom.lettersOnly(passwordLength));
                }
                else if(numbersBox.isSelected())
                {   
                yourNewPass.setText(passRandom.numbersOnly(passwordLength));
                }
                else if (symbolsBox.isSelected())
                {
                yourNewPass.setText(passRandom.symbolsOnly(passwordLength));
                }   
                else
                {   
                yourNewPass.setText(passRandom.numbersLettersSymbols(passwordLength));
                }
            }
        }
    }
}
