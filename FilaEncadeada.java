/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturas202502;

public class FilaEncadeada {
    private ListaDuplamenteEncadeada lista;
    
    FilaEncadeada(){
        lista = new ListaDuplamenteEncadeada();
    }
        
    void insereFinal(Integer valor){
        lista.insereUltimo(valor);
    }
    
    Integer removeInicio(){
        return lista.removeInicio();
    }
    
    void imprimeFila(){
        lista.imprimeLista();
    }
}
