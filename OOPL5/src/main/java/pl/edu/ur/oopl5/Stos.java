/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Patrycja
 */
public class Stos {
    int top,n;
    int[] tab;
    Scanner in = new Scanner(System.in);
    
    public Stos(int n) {
        this.tab = new int[n];
        top = 0;
    }
   
    public void wyswietlanie(){
        System.out.println("WYŚWIETLANIE STOSU: ");
        int i;
        for(i=top-1; i>=0; i--){
            System.out.println(tab[i]);
        }
    }
    
    public void push(int x){  
        if(top >=tab.length){
            System.out.println("Stos jest pełny, nie można nic dopisać");
        }
        else 
            tab[top++] = x;  
        
    }
    
    public void pop(){
        if(top >=1){
            top--;
            System.out.println("Liczba zostala usunieta");
        }
        else
            System.out.println("Stos jest pusty, nie można nic usunąć.");
                   
    }
   
}
