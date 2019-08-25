package clases.constantes;

public enum MatematicasNumeros {

    CERO(0),
    DIURNO(35000),
    NOCTURNO(50000),
    DIURNO_FEST(35000),
    NOCTURNO_FEST(50000),
    EURO(3500),
    DOLAR(3000),
    YEN(1500);


    private int valor;

    MatematicasNumeros(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
