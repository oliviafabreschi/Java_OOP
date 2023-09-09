import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventObject;

public class Calculator extends JFrame implements ItemListener {
    FlowLayout flowLayout = new FlowLayout();
    Container contentPane = getContentPane();
    private JComboBox comboBox = new JComboBox();
    private JLabel label = new JLabel("Enter numbers to be calculated");
    private JTextField number1 = new JTextField("   ");
    private JTextField number2 = new JTextField("   ");

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

        comboBox.addItemListener(this);
        //making visible
        setSize(400, 300);
        setVisible(true);

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
                    calculation.PlusCalcuation();
                    break;
                case 2:
                    calculation.MinusCalcuation();
                    break;
                case 3:
                    calculation.MultiplyCalcuation();
                    break;
                case 4:
                    calculation.DivisionCalcuation();
                    break;



            }

        }
    }



}