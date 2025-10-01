/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturas202502;


public class PilhaEncadeada {
    
    private ListaDuplamenteEncadeada lista;
    
    
    PilhaEncadeada(){
        lista = new ListaDuplamenteEncadeada();
    }
    
    void empilhar(Integer valor){
        lista.insereUltimo(valor);
    }
    
    Integer desempilhar(){
        return lista.removeUltimo();
    }
    
    void imprimePilha(){
        lista.imprimeLista();
    }
}
