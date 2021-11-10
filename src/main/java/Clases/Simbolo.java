
package Clases;


public class Simbolo {
    private Token simbolo;
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
            if ((car[cont]==',')||(car[cont]=='.')||(car[cont]==':')||(car[cont]==';')||(car[cont]=='/')||(car[cont]=='<')||(car[cont]=='>')||(car[cont]=='+')||(car[cont]=='*')||(car[cont]=='-')||(car[cont]=='\'')) {
                cont++;
                q0();
                System.out.println("Aceptado");
            } else {
                System.out.println("Error");

            }

        }

    }
    
}
