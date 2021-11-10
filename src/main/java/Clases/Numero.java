/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ajxup
 */
public class Numero {
    private Token numero;
    private char car[];
    private int cont = 0;
    public boolean aceptar = true;
    public String nm;
     public String getNm() {
        return nm;
    }
     public void  inicio(String dato ) {
        this.nm=dato;
       
        car = nm.toCharArray();
        q0();
       
    }
         private void q0() {
        aceptar = false;
        System.out.println("Entramos al estado q0");
        if (cont <= car.length) {
            if (Character.isDigit(car[cont])) {
                cont++;
                q2();

            } else {
                System.out.println("Error");

            }

        }

    }
             private void q2() {
        aceptar = true;
        System.out.println("Entramos al estado q2");
        if (cont < car.length) {
            if (Character.isDigit(car[cont])) {
                cont++;
                q2();

            } else if (Character.isDigit(car[cont])) {
                System.out.println("Error");

            }else{
                
            }

        }

    }
}
