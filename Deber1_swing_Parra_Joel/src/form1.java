import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class form1 {
    public JTextField textField1;
    public JTextField textField2;
    public JButton suma;
    public JButton resta;
    public JButton divisionButton;
    public JButton multiplicacionButton;
    public JButton raiz;
    public JButton potencia;
    public JButton seno;
    public JButton coseno;
    public JButton tangente;
    public JLabel respuesta;
    public JPanel panel1;

    private static final DecimalFormat df = new DecimalFormat("#.##");

    public form1() {

        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField1.getText());
                double d1 = Double.parseDouble(textField2.getText());

                Double suma = d + d1;
                respuesta.setText(df.format(suma));
            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField1.getText());
                double d1 = Double.parseDouble(textField2.getText());

                Double resta = d - d1;
                respuesta.setText(df.format(resta));
            }
        });
        multiplicacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField1.getText());
                double d1 = Double.parseDouble(textField2.getText());

                Double multiplicacion = d * d1;
                respuesta.setText(df.format(multiplicacion));
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField1.getText());
                double d1 = Double.parseDouble(textField2.getText());
                if (d1 != 0) {
                    Double division = d / d1;
                    respuesta.setText(df.format(division));
                } else {
                    respuesta.setText("No se puede");
                }
            }
        });


        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField1.getText());
                if (d >= 0) {
                    Double raiz = Math.sqrt(d);
                    respuesta.setText(df.format(raiz));
                } else {
                    respuesta.setText("No se puede calcular la raíz cuadrada de un número negativo");
                }
            }
        });
        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField1.getText());
                double d1 = Double.parseDouble(textField2.getText());

                Double potencia = Math.pow(d, d1);
                respuesta.setText(df.format(potencia));
            }
        });
        seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField1.getText());

                Double seno = Math.sin(Math.toRadians(d));
                respuesta.setText(df.format(seno));
            }
        });
        coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField1.getText());

                Double coseno = Math.cos(Math.toRadians(d));
                respuesta.setText(df.format(coseno));
            }
        });
        tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField1.getText());

                Double tangente = Math.tan(Math.toRadians(d));
                respuesta.setText(df.format(tangente));
            }
        });
    }
}
