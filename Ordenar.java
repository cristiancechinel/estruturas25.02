
package com.mycompany.estruturas202502;


public class Ordenar {
    //construtor vazio 
    
    
    void mergeSort(int a[], int p, int q){
    
        if (p < q){
            int meio = (p + q)/2;
            mergeSort(a, p, meio);
            mergeSort(a, meio + 1, q);
            merge(a, p, meio, q);
        }
    }
    
    private void merge(int a[], int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;
    
        int[] esquerda = new int[n1];
        int[] direita = new int[n2];
       
        for (int i = 0; i < n1; i++)
            esquerda[i] = a[p+i];
        
        for (int i = 0; i < n2; i++)
            direita[i] = a[q+i+1];

        int j = p; int e = 0; int d = 0;
        
        do{
            if (esquerda[e] <= direita[d]){
                a[j] = esquerda[e];
                e++;
            }
            else{
                a[j] = direita[d];
                d++;            
            }
            j++;
        } while (e < n1 && d < n2);
        
        for (int i = e; i < n1; i++){
            a[j] = esquerda[i];
            j++;
        }
        
        for (int i = d; i < n2; i++){
            a[j] = direita[i];
            j++;
        }
    }
    
    
    
    void bubble(int[] vet){
        for (int i = vet.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
               if (vet[j+1] < vet[j]){
                    int aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
    }
        
    void insertion(int[] vet){
       int i, j, chave;
        for (j = 1; j < vet.length; j++){
            chave = vet[j];
            i = j - 1;
            while (i >= 0 && vet[i] > chave){
                vet[i+1] = vet[i];
                i--;
            }
            vet[i+1] = chave;
        }
   }
}
