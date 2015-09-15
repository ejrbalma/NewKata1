/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas_varias;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author EnriqueJosé
 */
public class Pruebas_varias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola, soy Pruebas varias");
        MiClase persona1;
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1969, 3, 18);
        persona1 = new MiClase("Enrique", "Ramon", f1, "Triana, 55", null);
        
        System.out.println(persona1.getName());
        System.out.println(persona1.getSurname());
        System.out.println(persona1.getAddress());
        System.out.println(persona1.getBirthday().getTime());
        System.out.println(persona1.getAge());
        persona1.setAccount("20528000773303724509");
        System.out.println(persona1.getAccount());

        System.out.println("Adios, he terminado");

    }

}
