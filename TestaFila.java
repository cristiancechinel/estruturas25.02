
package com.mycompany.estruturas202502;

public class TestaFila {

    public static void main(String[] args){
    
        FilaInteiros fila = new FilaInteiros(5);
        
        fila.insereFinal(5);
        fila.insereFinal(15);
        fila.insereFinal(20);
        fila.insereFinal(25);
        fila.insereFinal(40);
        fila.imprimeFila();
        System.out.println("removeu "+ fila.removeInicio());
        System.out.println("removeu "+ fila.removeInicio());
        
        fila.insereFinal(44);
        fila.imprimeFila();
        
    
    
    }
    
}
