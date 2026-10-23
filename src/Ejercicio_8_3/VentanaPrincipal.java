package Ejercicio_8_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel lblCilindro, lblRadioCil, lblAlturaCil, lblVolCil, lblSupCil;
    private JTextField txtRadioCil, txtAlturaCil;
    private JButton btnCalcularCil;

    private JLabel lblEsfera, lblRadioEsf, lblVolEsf, lblSupEsf;
    private JTextField txtRadioEsf;
    private JButton btnCalcularEsf;

    private JLabel lblPiramide, lblBasePir, lblAlturaPir, lblApotemaPir, lblVolPir, lblSupPir;
    private JTextField txtBasePir, txtAlturaPir, txtApotemaPir;
    private JButton btnCalcularPir;

    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras Geométricas");
        setSize(480, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        // Cilindro
        lblCilindro = new JLabel("CILINDRO"); lblCilindro.setBounds(20, 20, 100, 23);
        lblRadioCil = new JLabel("Radio (cm):"); lblRadioCil.setBounds(20, 50, 100, 23);
        txtRadioCil = new JTextField(); txtRadioCil.setBounds(120, 50, 100, 23);
        lblAlturaCil = new JLabel("Altura (cm):"); lblAlturaCil.setBounds(20, 80, 100, 23);
        txtAlturaCil = new JTextField(); txtAlturaCil.setBounds(120, 80, 100, 23);
        btnCalcularCil = new JButton("Calcular"); btnCalcularCil.setBounds(240, 50, 100, 23);
        btnCalcularCil.addActionListener(this);
        lblVolCil = new JLabel("Volumen = "); lblVolCil.setBounds(240, 80, 200, 23);
        lblSupCil = new JLabel("Superficie = "); lblSupCil.setBounds(240, 110, 200, 23);

        // Esfera
        lblEsfera = new JLabel("ESFERA"); lblEsfera.setBounds(20, 150, 100, 23);
        lblRadioEsf = new JLabel("Radio (cm):"); lblRadioEsf.setBounds(20, 180, 100, 23);
        txtRadioEsf = new JTextField(); txtRadioEsf.setBounds(120, 180, 100, 23);
        btnCalcularEsf = new JButton("Calcular"); btnCalcularEsf.setBounds(240, 180, 100, 23);
        btnCalcularEsf.addActionListener(this);
        lblVolEsf = new JLabel("Volumen = "); lblVolEsf.setBounds(240, 210, 200, 23);
        lblSupEsf = new JLabel("Superficie = "); lblSupEsf.setBounds(240, 240, 200, 23);

        // Pirámide
        lblPiramide = new JLabel("PIRÁMIDE"); lblPiramide.setBounds(20, 280, 100, 23);
        lblBasePir = new JLabel("Base (cm):"); lblBasePir.setBounds(20, 310, 100, 23);
        txtBasePir = new JTextField(); txtBasePir.setBounds(120, 310, 100, 23);
        lblAlturaPir = new JLabel("Altura (cm):"); lblAlturaPir.setBounds(20, 340, 100, 23);
        txtAlturaPir = new JTextField(); txtAlturaPir.setBounds(120, 340, 100, 23);
        lblApotemaPir = new JLabel("Apotema (cm):"); lblApotemaPir.setBounds(20, 370, 100, 23);
        txtApotemaPir = new JTextField(); txtApotemaPir.setBounds(120, 370, 100, 23);
        btnCalcularPir = new JButton("Calcular"); btnCalcularPir.setBounds(240, 310, 100, 23);
        btnCalcularPir.addActionListener(this);
        lblVolPir = new JLabel("Volumen = "); lblVolPir.setBounds(240, 340, 200, 23);
        lblSupPir = new JLabel("Superficie = "); lblSupPir.setBounds(240, 370, 200, 23);

        // Agregar al contenedor
        contenedor.add(lblCilindro); contenedor.add(lblRadioCil); contenedor.add(txtRadioCil);
        contenedor.add(lblAlturaCil); contenedor.add(txtAlturaCil); contenedor.add(btnCalcularCil);
        contenedor.add(lblVolCil); contenedor.add(lblSupCil);
        contenedor.add(lblEsfera); contenedor.add(lblRadioEsf); contenedor.add(txtRadioEsf);
        contenedor.add(btnCalcularEsf); contenedor.add(lblVolEsf); contenedor.add(lblSupEsf);
        contenedor.add(lblPiramide); contenedor.add(lblBasePir); contenedor.add(txtBasePir);
        contenedor.add(lblAlturaPir); contenedor.add(txtAlturaPir); contenedor.add(lblApotemaPir);
        contenedor.add(txtApotemaPir); contenedor.add(btnCalcularPir); contenedor.add(lblVolPir);
        contenedor.add(lblSupPir);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
            if (evento.getSource() == btnCalcularCil) {
                Cilindro cilindro = new Cilindro(Double.parseDouble(txtRadioCil.getText()), Double.parseDouble(txtAlturaCil.getText()));
                lblVolCil.setText("Volumen = " + String.format("%.2f", cilindro.calcularVolumen()) + " cm³");
                lblSupCil.setText("Superficie = " + String.format("%.2f", cilindro.calcularSuperficie()) + " cm²");
            }
            if (evento.getSource() == btnCalcularEsf) {
                Esfera esfera = new Esfera(Double.parseDouble(txtRadioEsf.getText()));
                lblVolEsf.setText("Volumen = " + String.format("%.2f", esfera.calcularVolumen()) + " cm³");
                lblSupEsf.setText("Superficie = " + String.format("%.2f", esfera.calcularSuperficie()) + " cm²");
            }
            if (evento.getSource() == btnCalcularPir) {
                Piramide piramide = new Piramide(Double.parseDouble(txtBasePir.getText()), Double.parseDouble(txtAlturaPir.getText()), Double.parseDouble(txtApotemaPir.getText()));
                lblVolPir.setText("Volumen = " + String.format("%.2f", piramide.calcularVolumen()) + " cm³");
                lblSupPir.setText("Superficie = " + String.format("%.2f", piramide.calcularSuperficie()) + " cm²");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar valores numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
