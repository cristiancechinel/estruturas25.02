
package com.mycompany.estruturas202502;

public class TestaFilaEncadeada {

    public static void main(String[] args){
    
        FilaEncadeada fila = new FilaEncadeada();
        
        fila.insereFinal(10);
        fila.insereFinal(20);
        fila.insereFinal(30);
        
        fila.imprimeFila();
        
        fila.removeInicio();
        fila.removeInicio();
        
        fila.imprimeFila();
    
    }
    
}
