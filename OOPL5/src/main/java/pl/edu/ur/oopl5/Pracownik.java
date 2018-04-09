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
public class Pracownik {
   String imie;
   String nazwisko;
   int wiek;
   String stanowisko;
   
Scanner in = new Scanner(System.in);

    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public Pracownik() {
        this.wprowadzeneDanych();
    }

   	public void wprowadzeneDanych() {
		System.out.println("Wpisz imie: ");
		this.imie = in.next();

		System.out.println("Wpisz nazwisko: ");
		this.nazwisko = in.next();

		System.out.println("Wpisz wiek: ");
		this.wiek = in.nextInt();

		System.out.println("Wpisz stanowisko: ");
		this.stanowisko = in.next();
	}
   void wyswietlanie(){

        System.out.println("imie to "+this.imie);
        System.out.println("nazwisko to "+this.nazwisko);
        System.out.println("wiek to "+this.wiek);
        System.out.println("stanowisko "+this.stanowisko);

    }
  
}
