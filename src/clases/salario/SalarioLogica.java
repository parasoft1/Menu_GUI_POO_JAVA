package clases.salario;

import static clases.constantes.MatematicasNumeros.*;

public class SalarioLogica extends Salario {


    public double calcularSalarioDiurno(){
        return  (this.getHorasLabor()* DIURNO.getValor());
    }

    public double calcularSalarioNocturno(){
        return  (this.getHorasLabor()* NOCTURNO.getValor());
    }

    public double calcularSalarioDiurnoFest(){ return  (this.getHorasLabor()*DIURNO_FEST.getValor()*1.1);
    }

    public double calcularSalarioNocturnoFest(){  return  (this.getHorasLabor()*NOCTURNO_FEST.getValor()*1.15);
    }



}
