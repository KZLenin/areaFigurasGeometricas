import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JTextField lado;
    private JTextField baseTriangulo;
    private JTextField radio;
    private JTextField baseRectangulo;
    private JTextField alturaRectangulo;
    private JTextField alturaTriangulo;
    private JTextField dMayor;
    private JTextField dMenor;
    private JButton cuadradoButton;
    private JButton circuloButton;
    private JButton rectanguloButton;
    private JButton trianguloButton;
    private JButton romboButton;
    private JLabel resultado;

    public form1() {
        cuadradoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ladoC = Double.parseDouble(lado.getText());
                resultado.setText("Cuadrado: " + ladoC*ladoC);
            }
        });

        circuloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double radioC = Double.parseDouble(radio.getText());
                resultado.setText("Circulo: " + 3.1416*radioC*radioC);
            }
        });

        rectanguloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double baseR=Double.parseDouble(baseRectangulo.getText());
                double alturaR=Double.parseDouble(alturaRectangulo.getText());
                resultado.setText("Rectangulo: " + baseR*alturaR);
            }
        });


        trianguloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double baseT=Double.parseDouble(baseTriangulo.getText());
                double alturaT=Double.parseDouble(alturaTriangulo.getText());
                resultado.setText("Triangulo: " + (baseT*alturaT)/2);
            }
        });


        romboButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double dMayorR=Double.parseDouble(dMayor.getText());
                double dMenorR=Double.parseDouble(dMenor.getText());
                resultado.setText("Mayor: " + (dMayorR*dMenorR)/2);
            }
        });
    }
}
