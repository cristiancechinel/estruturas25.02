
package com.mycompany.estruturas202502;

public class ArvoreBinaria {
    private NodoArvore raiz;

    
    ArvoreBinaria(){
        this.raiz = null;
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
            this.raiz = new NodoArvore(v, null, null);
        else 
            this.raiz = this.raiz.insere(this.raiz, v);
    }
}
