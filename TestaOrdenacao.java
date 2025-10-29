
package com.mycompany.estruturas202502;

public class TestaOrdenacao {


    public static void printVet(int[] vet){
    
        for (int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
        System.out.println();
    
    }
    public static void main(String[] args){
    
        int vet[] = {80, 100, 50, 30, 16};
        Ordenar o = new Ordenar();
        printVet(vet); 

        o.insertion(vet);
        printVet(vet); 
             
        
    
    
    }
    
}
