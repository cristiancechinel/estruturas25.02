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
        //inicializa vetores
        for (int i = 0; i < g.getV(); i++){
            cor[i] = BRANCO;
            dist[i] = -1;
            pai[i]  = -1;
        }
        //inicializa origem
        cor[origem] = CINZA; dist[origem] = 0; 
        
        FilaEncadeada fila = new FilaEncadeada();
        fila.insereFinal(origem);
        
        while (!fila.filaVazia()){
            int u = fila.removeInicio();
            for (int v = 0; v < this.g.getV(); v++)
                if (this.g.adjacente(u, v))
                    if (cor[v] == BRANCO){
                        cor[v] = CINZA;
                        dist[v] = dist[u] + 1;
                        pai[v] = u;
                        fila.insereFinal(v);
                    }
            cor[u] = PRETO;   
        }
    }
    
    void imprimeCaminho(int destino){
    
        PilhaEncadeada pi = new PilhaEncadeada();
        pi.empilhar(destino);
        int i = destino;
        while (pai[i] != -1){
            //System.out.print(pai[i] + " -> ");
            pi.empilhar(pai[i]);
            i = pai[i];
        }
        
        while (!pi.vazia()){
            System.out.print(pi.desempilhar() + " -> ");
        }
        System.out.println();
        
    }
    
    void imprimeVetores(){
    
        System.out.println("Cores");
        for (int i = 0; i < this.g.getV(); i++)
            System.out.print(cor[i] + " | ");
        System.out.println();

        System.out.println("Pai");
        for (int i = 0; i < this.g.getV(); i++)
            System.out.print(pai[i] + " | ");
        System.out.println();
        
        System.out.println("Distância");
        for (int i = 0; i < this.g.getV(); i++)
            System.out.print(dist[i] + " | ");
        System.out.println();

        
    
    }
    
    
}
