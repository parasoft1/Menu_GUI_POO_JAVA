package clases.salario;

import clases.constantes.MatematicasNumeros;

import static clases.constantes.MatematicasNumeros.CERO;

public class Salario {

    private double horasLabor;

    public Salario(){
        this.horasLabor = CERO.getValor();
    }

    public double getHorasLabor() {
        return horasLabor;
    }

    public void setHorasLabor(double horasLabor) {
        this.horasLabor = horasLabor;
    }
}
