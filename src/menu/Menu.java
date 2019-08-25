package menu;

import clases.constantes.MatematicasMsjs;
import converMoneda.ConversionMoneda;
import opciones.operacionesmatematicas.OperacionesMatimaticas;
import salarioDiario.SalarioDiario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Frame {
    private JPanel menuprincipal;
    private JButton operacionesMatematicasButton;
    private JButton salarioDiarioButton;
    private JButton converMonedaButton;

    public Menu(){

        add(menuprincipal);
        setTitle(MatematicasMsjs.MENU.getMensaje());
        setSize(500,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        /*operacionesMatematicasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesMatimaticas operacionesMatimaticas = new OperacionesMatimaticas();
                operacionesMatimaticas.setVisible(true);
                esconderVentana();

            }
        });*/

        operacionesMatematicasButton.addActionListener(e ->  {


                OperacionesMatimaticas operacionesMatimaticas = new OperacionesMatimaticas();
                operacionesMatimaticas.setVisible(true);
                esconderVentana();


        });


        salarioDiarioButton.addActionListener(e -> {

            SalarioDiario salarioDiario = new SalarioDiario();
            salarioDiario.setVisible(true);
            esconderVentana();

        });
        converMonedaButton.addActionListener(e ->{
            ConversionMoneda conversionMoneda = new ConversionMoneda();
            conversionMoneda.setVisible((true));
            esconderVentana();
        });
    }



    private void esconderVentana(){
        this.dispose();
    }
}
