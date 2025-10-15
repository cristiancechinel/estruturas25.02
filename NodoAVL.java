
package com.mycompany.estruturas202502;

public class NodoAVL {
    
    private Integer valor;
    private NodoAVL esquerda;
    private NodoAVL direita;

    NodoAVL(Integer v, NodoAVL e, NodoAVL d){
        this.valor = v;
        this.esquerda = e;
        this.direita = d;
    }
    
    
    NodoAVL rotacaoEsquerdaDireita(NodoAVL atual){
        atual.esquerda = rotacaoEsquerda(atual.esquerda);
        atual = rotacaoDireita(atual);
        return atual;
    }
    
    NodoAVL rotacaoDireitaEsquerda(NodoAVL atual){
        atual.direita = rotacaoDireita(atual.direita);
        atual = rotacaoEsquerda(atual);
        return atual;
    }
    
    
    NodoAVL rotacaoEsquerda(NodoAVL atual){
        NodoAVL temp = atual.direita;
        atual.direita = temp.esquerda;
        temp.esquerda = atual; 
        return temp;
    }
    
    NodoAVL rotacaoDireita(NodoAVL atual){
        NodoAVL temp = atual.esquerda; 
        atual.esquerda = temp.direita; 
        temp.direita = atual;
        return temp;
    }
    
    
    
    
    NodoAVL insere(NodoAVL atual, Integer v){
        if (atual == null)
            atual = new NodoAVL(v, null, null);
        else if (v < atual.valor)//inserção esquerda
            atual.esquerda = insere(atual.esquerda, v);
        else //inserção direita
            atual.direita = insere(atual.direita, v);
        return atual;
   
    }
    
    NodoAVL remove(NodoAVL atual, Integer v){
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
               NodoAVL temp = atual.esquerda;
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
    
    int max2(int a, int b){
        if (a > b) return a;
        else return b;
    }
    
    int max(int a, int b){
        return a > b ? a: b;
    }
    
    
    int altura(NodoAVL a){
        
        if (a == null) 
            return -1;
        else 
            return 1 + max(altura(a.esquerda), altura(a.direita));
    }
    
    void imprimeSimetrico(NodoAVL a){
        if (a != null){
            System.out.print("<");
            imprimeSimetrico(a.esquerda);
            System.out.print(a.valor);
            imprimeSimetrico(a.direita);
            System.out.print(">");
        } 
    }



    void imprimePre(NodoAVL a){
        if (a != null){
            System.out.print("<");
            System.out.print(a.valor);
            imprimePre(a.esquerda);
            imprimePre(a.direita);
            System.out.print(">");
        } 
    }

}
