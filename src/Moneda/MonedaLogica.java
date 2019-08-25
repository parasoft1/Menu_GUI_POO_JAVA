package Moneda;


import static clases.constantes.MatematicasNumeros.*;

public class MonedaLogica extends Moneda {

    public double calcEuro(){
        return (this.getValorMoneda()* EURO.getValor());
    }

    public double calcDolar(){
        return (this.getValorMoneda()* DOLAR.getValor());
    }

    public double calcYen(){
        return (this.getValorMoneda()*YEN.getValor());
    }
}
