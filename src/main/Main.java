package main;

import static entidades.Mensajes.*;
import entidades.empleados.Salario;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    /*Se crea un metodo*/
    public static void main(String[] args){
        DecimalFormat formateador = new DecimalFormat( "###,###.##");
        /*Primero se crea un package referente a lo que nos vamos a referenciar, y despues creamos otro que dependerá
        * de lo que nos esta pidiendo*/

        /*Despues de los mensajes se instancia la clase salario en este caso*/
        Salario salario = new Salario();

        /*Se crea una variable de tipo string*/
        /*Y se importa los mensajes que creamos en la clase mensajes*/
        String horas = JOptionPane.showInputDialog(null, MENSAJE_PETICION_HORAS.getMensajes());
        /*El otro campo para mostrar*/
        String valor = JOptionPane.showInputDialog(null, MENSAJE_PETICION_VALOR_HORA.getMensajes());

        /*Se crea una variable double que aceptarn los datos del usuario*/
        /*SE llama al objeto de la clase y se llama al set para que las horas las enteguen por set*/
        /*Set asignar, entregar. get consulta y retorna*/
        salario.setHorasTrabajadas(Double.parseDouble(horas));
        salario.setValorHora(Double.parseDouble(valor));


        JOptionPane.showMessageDialog(null, MENSAJE_PETICION_SALARIO.getMensajes() + formateador.format(salario.calcularSalario()));
        /*Se agrega arriba una clase para decimales*/
    }
}
