package com.mycompany.estruturas202502;

public class Recursividade {


    public static void imprime10(int n){
    
        if (n == 1)
            System.out.println(1);
        else {
            System.out.println(n);
            imprime10(n-1);
        }
    
    }

    public static int potencia(int b, int e){
    
        if (e == 0) 
            return 1;
        else 
            return b * potencia(b, e-1); 
    
    }
    
    public static int MDC(int x, int y){
    
        if (y <= x && x % y == 0)
            return y;
        else
            if (x < y) return MDC(y, x);
            else return MDC(y, x % y); 
    }
    
    
    
    
    public static void main(String[] args){
        System.out.println(potencia(2, 6));
        //imprime10(30);
        //System.out.println(MDC(100, 40));
    
    }
    
    
}
