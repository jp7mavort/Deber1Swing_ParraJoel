import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Calculador por: Joel Parra");
        frame.setContentPane(new form1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2600, 2400);
        frame.pack();
        frame.setVisible(true);
    }
}