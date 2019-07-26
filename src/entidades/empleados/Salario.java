package entidades.empleados;

public class Salario {

    /*Horas y el valor de la misma */

    private double horasTrabajadas;
    private double valorHora;

    /*Se crea el metodo getter y setter*/

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /*Se crea un metodo de accion*/
    public double calcularSalario(){
        return (this.getHorasTrabajadas()*this.getValorHora());
    }
    /*Despues creas otra clase de mensajes */
}
