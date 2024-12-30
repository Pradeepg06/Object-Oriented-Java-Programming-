import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionCalculator extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultField;
    private JButton divideButton;

    public DivisionCalculator() {
        // Set up the frame
        setTitle("Integer Division Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        JLabel num1Label = new JLabel("Num1:");
        num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Num2:");
        num2Field = new JTextField(10);
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false);
        divideButton = new JButton("Divide");

        // Add components to the frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(divideButton);
        add(resultLabel);
        add(resultField);

        // Add action listener to the button
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performDivision();
            }
        });
    }

    private void performDivision() {
        try {
            // Get input values
            String num1Text = num1Field.getText();
            String num2Text = num2Field.getText();

            // Parse integers
            int num1 = Integer.parseInt(num1Text);
            int num2 = Integer.parseInt(num2Text);

            // Perform division
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            int result = num1 / num2;

            // Display result
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        // Create and display the GUI
        SwingUtilities.invokeLater(() -> {
            DivisionCalculator calculator = new DivisionCalculator();
            calculator.setVisible(true);
        });
    }
}