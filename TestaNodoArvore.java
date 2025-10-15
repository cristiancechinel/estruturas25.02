
package com.mycompany.estruturas202502;

public class TestaNodoArvore {

    public static void main(String[] args){
    
        NodoAVL a = new NodoAVL(10, null, null);
        a = a.insere(a, 8);
        a = a.insere(a, 9);
        a.imprimePre(a);
        
        a = a.rotacaoEsquerdaDireita(a);
        System.out.println();
        a.imprimePre(a);        
        
 
    }
    
}
