
package com.mycompany.estruturas202502;


public class TestaLista {
    
    public static void main(String[] args){
    
        ListaVetores lista = new ListaVetores(10);
        lista.insere(66);
        lista.insere(77);
        lista.insere(88);
        lista.insere(333);
        lista.insere(999);
        lista.insere(55);
        
        System.out.println(lista.removeFinal());
        lista.imprime();
        System.out.println(lista.removeFinal());
        lista.imprime();
        System.out.println(lista.removeFinal());
        lista.imprime();
        System.out.println(lista.removeFinal());
        lista.imprime();
        System.out.println(lista.removeFinal());
        lista.imprime();
          
    }
    
}
