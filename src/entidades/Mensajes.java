package entidades;

public enum Mensajes {

    /*Mensajes*/
    MENSAJE_PETICION_HORAS("Ingresa las horas laboradas: "),
    MENSAJE_PETICION_VALOR_HORA("Ingresa el valor de la hora trabajada: "),
    MENSAJE_PETICION_SALARIO("EL salario a pagar es: ");

    /*Se crea un atributo para los mensajes de tipo string*/
    private String mensaje;
    /*Se crea un costructor desde mensaje dadole alt + enter*/
    Mensajes(String s) {
        this.mensaje = s;
    }

    /*Se crea un metodo de tipo get de mensajes*/
    public String getMensajes() {
        return mensaje;
    }
    /*despues es en el main*/
}
