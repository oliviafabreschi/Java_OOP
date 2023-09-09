import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;


public class Practice extends JFrame implements ActionListener {

    //instantiating the variables
    private JButton button = new JButton("Push here to change colour");
    private JButton buttonFinish = new JButton("Push here to stop");
    private JLabel label = new JLabel("Hola amigos!");
    private JTextField text = new JTextField("enter color here");

    private static int nrOfPresses;

    FlowLayout flowLayout = new FlowLayout();
    Container contentPane = getContentPane();

    public void actionPerformed(ActionEvent event)
    {
        Random random = new Random();
        int redColor = random.nextInt(255);
        int greenColor = random.nextInt(255);
        int blueColor = random.nextInt(255);

        contentPane.setBackground(new Color(redColor, greenColor,blueColor));
       /* if ((nrOfPresses % 3) == 0){
            contentPane.setBackground(Color.RED);
        }
        else if ((nrOfPresses % 3) == 2){
            contentPane.setBackground(Color.CYAN);
        }
        else
            contentPane.setBackground(Color.PINK);*/
        label.setText("colour changing!");
        nrOfPresses++;
    }

    public Practice(){
        //creating the content pane

        contentPane.setLayout(flowLayout);
        Color turquoise = new Color(75, 175, 175);
        contentPane.setBackground(turquoise);
        label.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC,35));

        //adding the components
        contentPane.add(label);
        //spacing the inputs a bit
        flowLayout.setHgap(50);
       // contentPane.add(text);
        contentPane.add(button);
       // contentPane.add(buttonFinish);

        button.addActionListener(this);
        buttonFinish.addActionListener(this);

        setSize(330, 300);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Practice();
    }
}