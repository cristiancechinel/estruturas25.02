package com.mycompany.estruturas202502;

public class ListaDuplamenteEncadeada {
    private Nodo inicio, ultimo;
    
    private class Nodo{
        Integer dado;
        Nodo anterior, proximo;
    }

    ListaDuplamenteEncadeada(){
        inicio = ultimo = null;
    }
    
    boolean listaVazia(){
       return inicio == null;
    }
    
    void imprimeLista(){
        for (Nodo temp = inicio; temp != null; temp = temp.proximo)
            System.out.print(temp.dado + " ->");
        System.out.println();
    }
    
    Integer removeInicio(){
        if (inicio == null) return null; //lista vazia
        Integer temp = inicio.dado;
        if (inicio == ultimo){ // lista com 1 elemento
            inicio = ultimo = null;
        }
        else{//mais de 1 elemento 
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        return temp;
    }

    void insereUltimo(Integer valor){
        Nodo novo = new Nodo();
        novo.dado = valor;
        novo.proximo = null;
        //verifica vazia
        if (inicio == null){
            inicio = ultimo = novo;
            novo.anterior = null;
        }
        else {//pelo menos 1 elemento
            novo.anterior = ultimo;
            ultimo.proximo = novo;
            ultimo = novo;
        }
    }
    
    Integer removeUltimo(){
        if (inicio == null) 
            return null;
        
        Integer temp = ultimo.dado;
        if (inicio == ultimo){
            inicio = ultimo = null;
        }
        else {
            ultimo = ultimo.anterior;
            ultimo.proximo = null;
        }
        return temp;
            
    
    
    
    }
    
    Integer removeNodo(Integer valor){
        Nodo temp = inicio;
        while (temp != null && temp.dado != valor)
            temp = temp.proximo;
        //valor não existe 
        if (temp == null) return null;
        //primeiro elemento
        if (temp.anterior == null){
            inicio = temp.proximo;
        }
        else{
            temp.anterior.proximo = temp.proximo;
        }
        
        //ultimo elemento
        if (temp.proximo == null){
            ultimo = temp.anterior;
        }
        else {
            temp.proximo.anterior = temp.anterior;
        }
        
        return temp.dado;
    
    
    }
    
    
    
    void insereInicio(Integer valor){
        Nodo novo = new Nodo();
        novo.dado = valor; 
        novo.anterior = null;
        
        //verifica vazia
        if (inicio == null){
            inicio = ultimo = novo;
            novo.proximo = null;
        }
        else { //ao menos 1 elemento
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        } 
    }
    
}
