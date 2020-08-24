/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Digicel;

import java.util.Scanner;

/**
 *
 * @author RON TAYLOR
 */
public class DigicelMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Customer obj= new Customer();
      prePaid objj= new prePaid();
      postPaid objjj= new postPaid();
       Scanner  input = new Scanner( System.in);
      int num;
      System.out.println("New Customer=1, Prepaid Customer=2,PostPaid Customer=3 ");
      
       num=input.nextInt();
      switch (num){
          case 1:
      
     obj.Display();
     break;
          case 2:
    objj.Display();
    break;
          case 3:
     objjj.Display();
              break;
      }
     
    }
    
}
