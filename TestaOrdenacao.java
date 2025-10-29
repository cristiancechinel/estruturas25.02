
package com.mycompany.estruturas202502;

public class TestaOrdenacao {


    public static void printVet(int[] vet){
    
        for (int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
        System.out.println();
    
    }
    public static void main(String[] args){
    
        int vet[] = {80, 1, 15, 3, 65, 90};
        Ordenar o = new Ordenar();
        printVet(vet); 

        o.mergeSort(vet, 0, 5);
        printVet(vet); 
             
        
    
    
    }
    
}
