/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Patrycja
 */
public class Liczba {
    char[] cyfry;
  
  public Liczba(String number) {
    this.cyfry = new char[number.length()];
    
    /* przekopiuj znaki liczby do tablicy cyfr (indeks 0 to jedności) */
    for (int i = 0; i < number.length(); i++) {
      this.cyfry[i] = number.charAt(i);
    }
  }
  
  public void print() {
    for (int i = 0; i < this.cyfry.length; i++) {
      System.out.print(this.cyfry[i]);
    }
    System.out.println();
  }
  
  public void multiply(int number) {
    long total = 0;
    
    for (int i = 0; i < this.cyfry.length; i++) {
      if (i > 0) {
        total *= 10;
      }
      
      int digit = Character.getNumericValue(this.cyfry[i]);
      total += digit * number;
    }
    
    String newDigits = Long.toString(total);
    
    if (newDigits.length() > this.cyfry.length) {
      this.cyfry = new char[newDigits.length()];
    }
    
    for (int i = 0; i < newDigits.length(); i++) {
      this.cyfry[i] = newDigits.charAt(i);
    }
  }
  
  public static Liczba silnia(int n) {
    Liczba result = new Liczba("1");
    
    for (int i = 2; i <= n; i++) {
      result.multiply(i);
    }
    
    return result;
  }
}
