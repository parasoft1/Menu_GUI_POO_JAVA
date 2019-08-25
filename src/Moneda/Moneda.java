package Moneda;

import static clases.constantes.MatematicasNumeros.CERO;

public class Moneda {

    private double valorMoneda;

    public Moneda(){ this.valorMoneda= CERO.getValor();
    }

    public double getValorMoneda() {
        return valorMoneda;
    }

    public void setValorMoneda(double valorMoneda) {
        this.valorMoneda = valorMoneda;
    }
}
