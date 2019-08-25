package clases.constantes;

public enum MatematicasMsjs {

    MENU("MENU PRINCIPAL"),
    TITULO("Opciones Operaciones Matematicas"),
    DATOS("Ingrese Los Datos Requeridos"),
    DATOS_ERROR("No dejar Campos Vacios"),
    JORNADA_AM("Jornada: AM"),
    JORNADA_PM("Jornada: PM"),
    LABORABLE("Tipo Dia: Laborable"),
    FESTIVO("Tipo Dia: Festivo"),
    SALARIO("Salario: "),
    NOMBRE("Nombre: "),
    DIA("Dia: "),
    HORAS("Horas: ");

    private String mensaje;

    MatematicasMsjs(String menu) {
        this.mensaje = menu;
    }

    public String getMensaje() {
        return mensaje;
    }
}
