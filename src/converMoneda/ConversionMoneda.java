package converMoneda;

import Moneda.MonedaLogica;
import clases.constantes.MatematicasMsjs;
import menu.Menu;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

import static clases.constantes.MatematicasMsjs.DATOS;

public class ConversionMoneda extends Frame {

    MonedaLogica monedaLogica = new MonedaLogica();

    DecimalFormat formato = new DecimalFormat("#.##");


    private JRadioButton rdbEuro;
    private JRadioButton rdbDolar;
    private JRadioButton rdbYen;
    private JTextField txtCantidad;
    private JButton btnConverMoneda;
    private JButton btnSalir;
    private JLabel lblresultado;
    private JPanel conversionMonedaform;
    private JPanel conversionMoneda;
    private JLabel lblMoneda;
    private JLabel lblCantidad;


    public ConversionMoneda() {

        add(conversionMonedaform);
        setSize(240,350);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        rdbEuro.addActionListener(e -> {

            if(rdbEuro.isSelected()){

                rdbDolar.setEnabled(false);
                rdbYen.setEnabled(false);
            }
            else{
                rdbDolar.setEnabled(true);
                rdbYen.setEnabled(true);
                lblresultado.setVisible(false);
            }
        });

        rdbDolar.addActionListener(e -> {

            if(rdbDolar.isSelected()){

                rdbEuro.setEnabled(false);
                rdbYen.setEnabled(false);
            }
            else{
                rdbEuro.setEnabled(true);
                rdbYen.setEnabled(true);
                lblresultado.setVisible(false);
            }
        });

        rdbYen.addActionListener(e -> {

            if(rdbYen.isSelected()){

                rdbEuro.setEnabled(false);
                rdbDolar.setEnabled(false);
            }
            else{
                rdbEuro.setEnabled(true);
                rdbDolar.setEnabled(true);
                lblresultado.setVisible(false);
            }
        });


        btnConverMoneda.addActionListener( e -> {
            if(rdbEuro.isSelected()){
                monedaLogica.setValorMoneda(Double.parseDouble(txtCantidad.getText()));
                lblresultado.setVisible(true);
                lblresultado.setText(String.valueOf(monedaLogica.calcEuro()));

            }else if(rdbDolar.isSelected()){
                monedaLogica.setValorMoneda(Double.parseDouble(txtCantidad.getText()));
                lblresultado.setVisible(true);
                lblresultado.setText(String.valueOf(monedaLogica.calcDolar()));

            }else if(rdbYen.isSelected()) {
                monedaLogica.setValorMoneda(Double.parseDouble(txtCantidad.getText()));
                lblresultado.setVisible(true);
                lblresultado.setText(String.valueOf(monedaLogica.calcYen()));
            }else {
                lblresultado.setVisible(false);
                JOptionPane.showMessageDialog(null, DATOS.getMensaje());
            }
        });

        btnSalir.addActionListener( e -> {
            Menu menu = new Menu();
            menu.setVisible(true);
            esconderVentana();
        });
    }

    private void esconderVentana(){
        this.dispose();
    }
}
