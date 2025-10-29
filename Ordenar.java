/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturas202502;


public class Ordenar {
    //construtor vazio 
    
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
