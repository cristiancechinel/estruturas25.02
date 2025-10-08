
package com.mycompany.estruturas202502;

public class NodoArvore {
    
    private Integer valor;
    private NodoArvore esquerda;
    private NodoArvore direita;

    NodoArvore(Integer v, NodoArvore e, NodoArvore d){
        this.valor = v;
        this.esquerda = e;
        this.direita = d;
    }
    
    NodoArvore insere(NodoArvore atual, Integer v){
        if (atual == null)
            atual = new NodoArvore(v, null, null);
        else if (v < atual.valor)//inserção esquerda
            atual.esquerda = insere(atual.esquerda, v);
        else //inserção direita
            atual.direita = insere(atual.direita, v);
        return atual;
   
    }
    
    NodoArvore remove(NodoArvore atual, Integer v){
        if (atual == null) return null;//não existe
        if (v < atual.valor)
            atual.esquerda = remove(atual.esquerda, v);
        else if (v > atual.valor)
            atual.direita = remove(atual.direita, v);
        else{//encontrou o elemento sem filhos
            if (atual.esquerda == null && atual.direita == null)
                return null;
            else if (atual.direita == null)
                    return atual.esquerda;
            else if (atual.esquerda == null)
                    return atual.direita;
            else {
               //tem dois filhos 
               NodoArvore temp = atual.esquerda;
               while (temp.direita != null){
                   temp = temp.direita;
               }
               
               atual.valor = temp.valor;
               temp.valor = v;
               atual.esquerda = remove(atual.esquerda, v);
            }
        }
        return atual;
    }
    
    
    
    void imprimeSimetrico(NodoArvore a){
        if (a != null){
            System.out.print("<");
            imprimeSimetrico(a.esquerda);
            System.out.print(a.valor);
            imprimeSimetrico(a.direita);
            System.out.print(">");
        } 
    }



    void imprimePre(NodoArvore a){
        if (a != null){
            System.out.print("<");
            System.out.print(a.valor);
            imprimePre(a.esquerda);
            imprimePre(a.direita);
            System.out.print(">");
        } 
    }

}
