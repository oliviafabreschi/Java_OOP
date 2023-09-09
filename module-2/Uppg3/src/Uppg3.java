import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Uppg3 extends JFrame implements ActionListener {

    //instantiating the variables
    private JTextField text = new JTextField("enter text here");
    private JTextArea textArea = new JTextArea(8,12);
    private JComboBox comboBox = new JComboBox();
    private JButton button = new JButton("Add input");

    private static int nrOfText;

    FlowLayout flowLayout = new FlowLayout();
    Container contentPane = getContentPane();

    public void actionPerformed(ActionEvent e) {
        String textInput = text.getText();
        textArea.append(textInput + "\n");
        comboBox.addItem(textInput);
        nrOfText++;
        System.out.println(nrOfText);

    }

    public Uppg3(){
        //creating the content pane
        contentPane.setLayout(flowLayout);

        //setting colour
        Color beige = new Color(255, 205, 230);
        contentPane.setBackground(beige);

        //adding the components
        contentPane.add(text);
        contentPane.add(button);
        contentPane.add(textArea);
        contentPane.add(comboBox);

        setSize(330, 300);
        setVisible(true);

        button.addActionListener(this);


    }

        public static void main(String[] args) {
        new Uppg3();
    }
}