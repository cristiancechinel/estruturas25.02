package com.mycompany.estruturas202502;

public class ListaEncadeada {

    private Nodo inicio;
    
    private class Nodo{
        Integer dado;
        Nodo prox;
    }
    
    ListaEncadeada(){
        inicio = null;
    }

    Integer removeInicio(){
        if (inicio == null) 
            return null;
        
        Integer temp = inicio.dado;
        inicio = inicio.prox;
        return temp; 
    }
    
    void insereOrdenado(Integer n){
        Nodo temp = inicio;
        Nodo anterior = null;
    
        while (temp != null && temp.dado < n){
            anterior = temp;
            temp = temp.prox;
        }
        Nodo novo = new Nodo();
        novo.dado = n;
        
        if (anterior == null){ //inserção na primeira posição
            novo.prox = inicio;
            inicio = novo;
        }
        else{ //insercao no meio ou final
            anterior.prox = novo;
            novo.prox = temp;
        }
    
    }
    
    
    Integer removeNodo(Integer n){
        Nodo temp = inicio;
        Nodo anterior = null;
        
        while (temp != null && temp.dado != n){
            anterior = temp;
            temp = temp.prox;
        }
        /*while (temp.dado != n && temp != null) { NÃO PODE SER ASSIM
            anterior = temp; 
            temp = temp.prox;
        }*/
        if (temp == null) //não achou - percorreu toda a lista e não achou
            return null;
        
        if (anterior == null){// achou na primeira posição, nem entrou no while
            Integer d = temp.dado;
            inicio = inicio.prox;
            return d;
        }
        //achou no meio ou ao final
        Integer d = temp.dado;
        anterior.prox = temp.prox;
        return d;
    }
    
    
    void insereNodo(Integer valor){
        Nodo novo = new Nodo();
        novo.dado = valor;
        novo.prox = inicio;
        inicio = novo;
    }
    
    void imprimeReversa2(){
    
        ListaEncadeada nova = new ListaEncadeada();
        Nodo temp = inicio;
        while (temp != null){
            Integer dado = temp.dado;
            nova.insereNodo(dado);
            temp = temp.prox;
        }
        
        nova.imprimeLista();
       // this = nova;
    
    }
    
    
    
    
    void imprimeListaRev(){
        imprimeListaReversa(inicio);
        System.out.println();
    }
    
    void imprimeListaReversa(Nodo atual){
    
        if (atual != null){
            imprimeListaReversa(atual.prox);
            System.out.print(atual.dado + "->");
            
                 
        }
        
    
    }
    
    void imprimeLista(){
        for (Nodo temp = inicio; temp != null; temp = temp.prox)
            System.out.print(temp.dado + "->");
        System.out.println();
    }
    
}
