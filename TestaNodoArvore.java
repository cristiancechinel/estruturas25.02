
package com.mycompany.estruturas202502;

public class TestaNodoArvore {

    public static void main(String[] args){
    
        NodoAVL a = new NodoAVL(8, null, null);
        a = a.insere(a, 10);
        
        a = a.insere(a, 9);
       
        //a = a.insere(a, 4);
        
        a.imprimePre(a);        
        
 
    }
    
}
