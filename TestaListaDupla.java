
package com.mycompany.estruturas202502;

public class TestaListaDupla {

    public static void main(String[] args){
    
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.insereInicio(8);
        lista.insereInicio(10);
        lista.insereInicio(15);
        
        lista.insereUltimo(20);
        lista.insereUltimo(25);
        lista.insereUltimo(30);
        
        lista.imprimeLista();
    
        lista.removeNodo(15);
        
        lista.imprimeLista();
        
        lista.removeNodo(8);
        lista.imprimeLista();
        
        lista.removeNodo(30);
        lista.imprimeLista();
                
    
    }
}
