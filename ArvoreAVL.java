
package com.mycompany.estruturas202502;

public class ArvoreAVL {
    private NodoAVL raiz;

    
    ArvoreAVL(){
        this.raiz = null;
    }
    
    int altura(){
        if (this.raiz == null)
            return -1; 
        else
            return this.raiz.altura(raiz);
    }
    
    void imprimePre(){
        this.raiz.imprimePre(raiz);
        System.out.println();
    }

    void imprimeSimetrico(){
        this.raiz.imprimeSimetrico(raiz);
        System.out.println();
    }
    
    void removeNodo(Integer v){
        if (this.raiz != null) 
           this.raiz = this.raiz.remove(this.raiz, v);
    }
    
    void insereNodo(Integer v){
        if (this.raiz == null)
            this.raiz = new NodoAVL(v, null, null);
        else 
            this.raiz = this.raiz.insere(this.raiz, v);
    }
}
