import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class FactorialApplet extends Applet implements ActionListener {
    // Declare UI components
    TextField inputField, outputField;
    Button computeButton;

    // Initialize the applet
    public void init() {
        // Set layout
        setLayout(new FlowLayout());

        // Initialize components
        Label inputLabel = new Label("Enter an integer:");
        inputField = new TextField(10);
        Label outputLabel = new Label("Factorial:");
        outputField = new TextField(15);
        outputField.setEditable(false);  
        // Output field should be read-only
        computeButton = new Button("Compute");

        // Add components to the applet
        add(inputLabel);
        add(inputField);
        add(computeButton);
        add(outputLabel);
        add(outputField);

        // Add action listener to the button
        computeButton.addActionListener(this);
    }

    // Handle button click event
    public void actionPerformed(ActionEvent e) {
        try {
            // Get input value from the text field
            int number = Integer.parseInt(inputField.getText());
            // Compute factorial
            long factorial = computeFactorial(number);
            // Set output value in the output field
            outputField.setText(String.valueOf(factorial));
        } catch (NumberFormatException ex) {
            outputField.setText("Invalid Input");
        }
    }

    // Method to compute factorial
    private long computeFactorial(int n) {
        if (n < 0) return 0; // Return 0 for negative numbers as factorial is not defined
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
