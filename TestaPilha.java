
package com.mycompany.estruturas202502;

import java.util.Scanner;

public class TestaPilha {

    public static void main(String[] args){
    
        System.out.println("digite uma palavra");
        Scanner entrada = new Scanner(System.in);
        String str = entrada.nextLine();
        
        PilhaGenerica<Character> pi = new PilhaGenerica<Character>(str.length());
        
              
        for (int i = 0; i < str.length(); i++)
            pi.empilha(str.charAt(i));
        
        while (!pi.vazia()){
        
            Character c = pi.desempilha();
            System.out.print(c);
        
        }
        System.out.println();
            
            
       
    }

    
}
