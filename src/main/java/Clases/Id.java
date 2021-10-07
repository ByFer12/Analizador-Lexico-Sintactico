/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Id {

    /**
     * @param args the command line arguments
     */
    private char car[];
    private int cont = 0;
    private boolean aceptar = false;
    /**
     * Retorna el valor de la cadena a evaluar
     * @return 
     */
    public String getNm() {
        return nm;
    }
    Scanner ent = new Scanner(System.in);
    private String nm;
    
    /**
     * Procedimiento Principal
     */
    public void  inicio() {

        System.out.println("Ingrese una palabra");
        nm = ent.nextLine();
        car = nm.toCharArray();
        q0();
        if (aceptar) {
            System.out.println("La cadena es aceptada: " + nm);
        } else {
            System.out.println("La cadena no es valida");
        }
    }
    /**
     * Estado cero dond einicia
     */
    private void q0() {
        aceptar = false;
        System.out.println("Entramos al estado q0");
        if (cont <= car.length) {
            if (Character.isAlphabetic(car[cont])) {
                cont++;
                q2();

            } else {
                System.out.println("Error");

            }

        }

    }
    /**
     * Estado dos comprobando el ID
     */
    private void q2() {
        aceptar = true;
        System.out.println("Entramos al estado q2");
        if (cont < car.length) {
            if (Character.isAlphabetic(car[cont])) {
                cont++;
                q2();

            } else if (Character.isDigit(car[cont])) {
                cont++;
                q5();

            }else{
                fin();
            }

        }

    }
    /**
     * Estado 5 para validar el ID
     */
    private void q5() {
        aceptar = true;
        System.out.println("Entramos al estado q5");
        if (cont < car.length) {
            if (Character.isAlphabetic(car[cont])) {
                cont++;
                fin();

            } else if (Character.isDigit(car[cont])) {
                cont++;
                q5();

            } else {
                fin();
            }

        }

    }
        /**
         * Estado de finalizacion de todos los estados
         */
     private void fin() {
         aceptar=false;
     }

}