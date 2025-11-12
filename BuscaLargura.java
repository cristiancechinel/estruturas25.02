/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturas202502;

public class BuscaLargura {
    private static final int BRANCO = 0;
    private static final int CINZA  = 1;
    private static final int PRETO  = 2;
       
    private  int cor[], dist[], pai[];
    private Grafo g; 
    
    BuscaLargura(Grafo g){
        this.g = g;
        cor =  new int[g.getV()];
        dist = new int[g.getV()];
        pai  = new int[g.getV()];
    }
    
    void busca(int origem){
    
    
    
    }
    
}
