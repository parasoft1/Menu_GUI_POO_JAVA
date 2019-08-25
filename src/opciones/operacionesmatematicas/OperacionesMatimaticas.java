package opciones.operacionesmatematicas;

import clases.constantes.MatematicasMsjs;
import clases.operaciones.MatematicasLogica;
import menu.Menu;

import javax.swing.*;
import java.awt.*;

public class OperacionesMatimaticas extends Frame {

    MatematicasLogica matematicasLogica  = new MatematicasLogica();

    protected JPanel operacionesMatematicasform;
    protected JTextField txtnumero1;
    protected JTextField txtnumero2;
    protected JButton lblsuma;
    protected JButton lblresta;
    protected JButton lblmultiplicacion;
    protected JButton lbldivision;
    protected JButton lblsalir;
    protected JLabel lblnumero1;
    protected JLabel lblnumero2;
    protected JLabel lblresultado;

    public OperacionesMatimaticas(){
        add(operacionesMatematicasform);
        setTitle(MatematicasMsjs.TITULO.getMensaje());
        setSize(240,350);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        /*lblsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.setVisible(true);
                esconderVentana();


            }
        });*/

        lblsalir.addActionListener(e ->  {

                Menu menu = new Menu();
                menu.setVisible(true);
                esconderVentana();



        });

        lblsuma.addActionListener(e ->  {

            datos(txtnumero1.getText(),txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicasLogica.calcularSuma()));


        });

        lblresta.addActionListener(e ->  {

            datos(txtnumero1.getText(),txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicasLogica.calcularResta()));

        });
        lblmultiplicacion.addActionListener(e ->  {

            datos(txtnumero1.getText(),txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicasLogica.calcularMultiplicacion()));

        });
        lbldivision.addActionListener(e ->  {
            datos(txtnumero1.getText(),txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicasLogica.calcularDivision()));

        });
    }
    private void esconderVentana(){
        this.dispose();
    }

    private void datos(String valor1, String valor2){

        matematicasLogica.setNumero1(Double.parseDouble(valor1));
        matematicasLogica.setNumero2(Double.parseDouble(valor2));
        lblresultado.setVisible(true);


    }
}
