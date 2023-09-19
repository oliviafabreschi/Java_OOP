import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;


/**
 * This class does the main GUI behind the calculator
 *
 * @author Olivia Fabreschi
 * @Version Sep 2023
 */
public class Calculator extends JFrame implements ItemListener, ActionListener {
    private int result = 0;
    private String resultString = "";
    FlowLayout flowLayout = new FlowLayout();
    Container contentPane = getContentPane();
    private JComboBox comboBox = new JComboBox();
    private JLabel label = new JLabel("Enter numbers to be calculated");
    private JTextField number1 = new JTextField(resultString);
    private JTextField number2 = new JTextField("   ");
    private JLabel labelResult = new JLabel("The result will show here");

    private JButton memoryButton = new JButton("Memory");

    /**
     * Main method for calculator GUI
     * Sets up contentpane and adds components
     */
    public Calculator() {
        //creating the content pane
        contentPane.setLayout(flowLayout);

        //setting colour
        Color beige = new Color(255, 225, 230);
        contentPane.setBackground(beige);

        //adding components to combobox
        comboBox.addItem("Choose calculation");
        comboBox.addItem("plus");
        comboBox.addItem("minus");
        comboBox.addItem("multiply");
        comboBox.addItem("division");
        //adding components
        contentPane.add(label);
        contentPane.add(number1);
        contentPane.add(number2);
        contentPane.add(comboBox);
        contentPane.add(memoryButton);
        contentPane.add(labelResult);


        //adjusting
        number1.setPreferredSize(new Dimension(50, 30));
        number2.setPreferredSize(new Dimension(50, 30));

        //adding listener to combobox for items
        comboBox.addItemListener(this);
        //adding listener to memory button
        memoryButton.addActionListener(this);


        //making visible
        setSize(400, 300);
        labelResult.setPreferredSize(new Dimension(200, 50));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    /**
     * Switch cases depending on which item of combox is selected
     * calculation method called from Calculations class for each choice
     *
     * @param e the event to be processed
     */
    public void itemStateChanged(ItemEvent e) {
        Calculations calculation = new Calculations();
        if ((e.getStateChange() == ItemEvent.SELECTED)) {
            int selection = comboBox.getSelectedIndex();
            //different methods depending on selection
            switch (selection) {
                case 0:
                    break;
                case 1:
                    //each case has a parsing check to check for valid input
                    if (parsingCheckOK(number1, number2)) {
                        //calls calculation method
                        result = calculation.plusCalculation(number1, number2);
                        setGUIResultText(result);
                    }
                    comboBox.setSelectedIndex(0);
                    break;

                case 2:
                    if (parsingCheckOK(number1, number2)) {
                        result = calculation.minusCalculation(number1, number2);
                        setGUIResultText(result);
                    }
                    comboBox.setSelectedIndex(0);
                    break;
                case 3:
                    if (parsingCheckOK(number1, number2)) {
                        result = calculation.multiplyCalculation(number1, number2);
                        setGUIResultText(result);
                    }
                    comboBox.setSelectedIndex(0);
                    break;
                case 4:
                    if (parsingCheckOK(number1, number2)) {
                        //extra parsing check for divison for 0 in demoninator
                        if (parsingCheckDivisionOK(number2)) {
                            result = calculation.divisionCalculation(number1, number2);
                            setGUIResultText(result);
                        }
                    }
                    comboBox.setSelectedIndex(0);
                    break;

            }


        }
    }

    /**
     * Sets the text to be shown on the GUI
     * @param result the integer of the final calculation
     */
    private void setGUIResultText(int result) {
        resultString = Integer.toString(result);
        //setting the result on the label
        labelResult.setText("Result is " + resultString);
        //setting the result in the "memory" for the user
        number1.setText(" ");
        number2.setText(" ");
    }



    /**
     * action event for memory button
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //setting the result in the "memory" for the user
        number1.setText(resultString);
        number2.setText(" ");

    }


    /**
     * Checks that the input from the user is a valid int
     * Boolean true or false to see if program should continue
     * @param input1   the first digit from the JTextField
     * @param input2   the second digit from the JTextField
     * @return
     */
    public boolean parsingCheckOK(JTextField input1, JTextField input2) {
        String nr1 = input1.getText().trim();
        String nr2 = input2.getText().trim();
        try {
            Integer.parseInt(nr1);
            Integer.parseInt(nr2);
            return true;
        } catch (Exception e) {
            String errorMessage = "Not a valid input. Try again";
            labelResult.setText(errorMessage);
            return false;
        }
    }

    /**
     * Checks that the input from the user isn't 0 for the denominator
     * Boolean true or false to see if program should continue
     * @param input2   checks second nr input
     * @return true or false to continue
     */
    public boolean parsingCheckDivisionOK(JTextField input2) {
        String nr2 = input2.getText().trim();
        String divisionErrorMessage;
        if (String.valueOf(nr2.charAt(0)).equals("0")) {
            divisionErrorMessage = " isn't a valid denominator. Try again";
            labelResult.setText(nr2 + divisionErrorMessage);
            return false;
        }
        return true;

    }



}