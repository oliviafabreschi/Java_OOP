import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventObject;

public class Calculator extends JFrame implements ItemListener {
    private int result = 0;
    private String resultString = "";
    FlowLayout flowLayout = new FlowLayout();
    Container contentPane = getContentPane();
    private JComboBox comboBox = new JComboBox();
    private JLabel label = new JLabel("Enter numbers to be calculated");
    private JTextField number1 = new JTextField(resultString);
    private JTextField number2 = new JTextField("   ");
    private JLabel labelResult = new JLabel("The result will show here");



    public Calculator(){
        //creating the content pane
        contentPane.setLayout(flowLayout);

        //setting colour
        Color beige = new Color(255, 225, 230);
        contentPane.setBackground(beige);

        comboBox.addItem("Choose calculation");
        comboBox.addItem("plus");
        comboBox.addItem("minus");
        comboBox.addItem("multiply");
        comboBox.addItem("division");

        contentPane.add(label);
        contentPane.add(number1);
        contentPane.add(number2);
        contentPane.add(comboBox);
        contentPane.add(labelResult);


        number1.setPreferredSize(new Dimension(50, 30));
        number2.setPreferredSize(new Dimension(50, 30));

        comboBox.addItemListener(this);



        //making visible
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public void itemStateChanged(ItemEvent e) {
        Calculations calculation = new Calculations();
        if ((e.getStateChange() == ItemEvent.SELECTED)) {
            int selection = comboBox.getSelectedIndex();
            //different methods depending on selection
            switch (selection) {
                case 0:
                    break;
                case 1:
                    result = calculation.PlusCalcuation(number1, number2);
                    resultString = Integer.toString(result);
                    labelResult.setText(resultString);
                    break;
                case 2:
                    result =calculation.MinusCalcuation(number1, number2);
                    resultString = Integer.toString(result);
                    labelResult.setText(resultString);

                    break;
                case 3:
                    result =calculation.MultiplyCalcuation(number1, number2);
                    resultString = Integer.toString(result);
                    labelResult.setText(resultString);

                    break;
                case 4:
                    result =calculation.DivisionCalcuation(number1, number2);
                    resultString = Integer.toString(result);
                    labelResult.setText(resultString);

                    break;



            }

        }
    }



}