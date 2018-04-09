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
public class Firma {
    Scanner in = new Scanner(System.in);
    Pracownik[] pracownik;


    public Firma() 
    { 
    pracownik = new Pracownik[100]; 
    }
       
    void add(){
        int i;
        System.out.println("Podaj numer pracownika na liście: ");
        i = in.nextInt();
        this.pracownik[i - 1] = new Pracownik();
        
    }
   void listaPracownikow() {
		for (int i = 0; i < pracownik.length; i++) {
			if (pracownik[i] != null) pracownik[i].wyswietlanie();
		}
	}
    }
    
    
    
  

   
