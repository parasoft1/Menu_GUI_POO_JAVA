package salarioDiario;


import clases.salario.SalarioLogica;

import menu.Menu;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

import static clases.constantes.MatematicasMsjs.*;

public class SalarioDiario  extends Frame {
    SalarioLogica salarioLogica = new SalarioLogica();
    DecimalFormat formato = new DecimalFormat("#.##");

    private JPanel salarioDiarioform;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblDia;
    private JTextField txtDia;
    private JRadioButton rdbAM;
    private JRadioButton rdbPM;
    private JLabel lblJornada;
    private JRadioButton rdbLaborable;
    private JRadioButton rdbFestivo;
    private JLabel lblTipoDia;
    private JButton lblSalario;
    private JLabel lblresultado;
    private JButton lblsalir;
    private JLabel lblHoras;
    private JTextField txtHoras;

    public SalarioDiario(){
        add(salarioDiarioform);
        setSize(240,350);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        rdbAM.addActionListener(e -> {

            if(rdbAM.isSelected()){

                rdbPM.setEnabled(false);
            }
            else{
                rdbPM.setEnabled(true);
            }
        });
        rdbPM.addActionListener(e -> {
            if(rdbPM.isSelected()){

                rdbAM.setEnabled(false);
            }
            else{
                rdbAM.setEnabled(true);
            }
        });
        rdbLaborable.addActionListener(e -> {
            if(rdbLaborable.isSelected()){

                rdbFestivo.setEnabled(false);
            }
            else{
                rdbFestivo.setEnabled(true);
            }
        });

        rdbFestivo.addActionListener(e -> {
            if(rdbFestivo.isSelected()){

                rdbLaborable.setEnabled(false);
            }
            else{
                rdbLaborable.setEnabled(true);
            }
        });

        lblSalario.addActionListener(e -> {

            if ( (txtNombre.getText().isEmpty() ) || (txtDia.getText().isEmpty()) || (txtHoras.getText().isEmpty()))  {
                // cadena no está vacía
                JOptionPane.showMessageDialog(this, DATOS_ERROR.getMensaje(), "Error!", JOptionPane.ERROR_MESSAGE);
            }

            else {


                if (rdbAM.isSelected() && rdbLaborable.isSelected()) {

                    dato(txtHoras.getText());
                    lblresultado.setText(String.valueOf(formato.format(salarioLogica.calcularSalarioDiurno())));
                    resultadoSalario1();


                } else if (rdbPM.isSelected() && rdbLaborable.isSelected()) {

                    dato(txtHoras.getText());
                    lblresultado.setText(String.valueOf(formato.format(salarioLogica.calcularSalarioNocturno())));
                    resultadoSalario2();

                } else if (rdbAM.isSelected() && rdbFestivo.isSelected()) {

                    dato(txtHoras.getText());
                    lblresultado.setText(String.valueOf(formato.format(salarioLogica.calcularSalarioDiurnoFest())));
                    resultadoSalario3();

                } else if (rdbPM.isSelected() && rdbFestivo.isSelected()) {

                    dato(txtHoras.getText());
                    lblresultado.setText(String.valueOf(formato.format(salarioLogica.calcularSalarioNocturnoFest())));
                    resultadoSalario4();

                } else
                    JOptionPane.showMessageDialog(null, DATOS.getMensaje());

            }

        });


        lblsalir.addActionListener(e -> {

            Menu menu = new Menu();
            menu.setVisible(true);
            esconderVentana();
        });


    }

    private void esconderVentana(){
        this.dispose();
    }

    private void dato(String valor1){

        salarioLogica.setHorasLabor(Double.parseDouble(valor1));
        lblresultado.setVisible(true);


    }

    private void resultadoSalario1(){

        JOptionPane.showMessageDialog(null, NOMBRE.getMensaje()+ txtNombre.getText()+"\n"+DIA.getMensaje()+txtDia.getText()+"\n"+HORAS.getMensaje()+txtHoras.getText()+"\n"
                + JORNADA_AM.getMensaje() +"\n"+ LABORABLE.getMensaje()+"\n"+SALARIO.getMensaje()+lblresultado.getText()+"\n");


    }

    private void resultadoSalario2(){

        JOptionPane.showMessageDialog(null, NOMBRE.getMensaje()+ txtNombre.getText()+"\n"+DIA.getMensaje()+txtDia.getText()+"\n"+HORAS.getMensaje()+txtHoras.getText()+"\n"
                + JORNADA_PM.getMensaje() +"\n"+ LABORABLE.getMensaje()+"\n"+SALARIO.getMensaje()+lblresultado.getText()+"\n");


    }

    private void resultadoSalario3(){

        JOptionPane.showMessageDialog(null, NOMBRE.getMensaje()+ txtNombre.getText()+"\n"+DIA.getMensaje()+txtDia.getText()+"\n"+HORAS.getMensaje()+txtHoras.getText()+"\n"
                + JORNADA_AM.getMensaje()+"\n"+ FESTIVO.getMensaje()+"\n"+SALARIO.getMensaje()+lblresultado.getText()+"\n");


    }

    private void resultadoSalario4(){

        JOptionPane.showMessageDialog(null, NOMBRE.getMensaje()+ txtNombre.getText()+"\n"+DIA.getMensaje()+txtDia.getText()+"\n"+HORAS.getMensaje()+txtHoras.getText()+"\n"
                + JORNADA_PM.getMensaje() +"\n"+ FESTIVO.getMensaje()+"\n"+SALARIO.getMensaje()+lblresultado.getText()+"\n");


    }
}
