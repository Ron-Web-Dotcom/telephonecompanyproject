/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Digicel;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author RON TAYLOR
 */
public class Customer {
    String customname;
  protected  int customtelenum;
    
    Customer (){
        customname="No Info Entered";
        customtelenum=000-0000;
    }
   public Customer (String custnam , int custtele)
   {
      customname=custnam;
      customtelenum=custtele;
      
   }
   public void GetCustomInfo()
   {
       Scanner  input = new Scanner( System.in);
       System.out.println("Enter Customer Name");
       customname=input.nextLine();
       System.out.println("Enter  Customer  Telephone");
       customtelenum=input.nextInt();
       
     //  customname=(JOptionPane.showInputDialog("Enter Customer Name"));
   //    customtelenum=Integer.parseInt(JOptionPane.showInputDialog("Enter Customer Phone Number"));
       
   }
   public void DisplayCustomInfo()
   {
       System.out.println("Customer Name:"+customname+"\n"+"Customer Number:"+customtelenum);
       
       //JOptionPane.showMessageDialog(null,"Customer Name:"+customname+"\n"+"CustomerTelephone number:"+customtelenum);
   }
   
   //BlankMethod
   public void Display()
   {
      Customer objj= new Customer();
      objj.GetCustomInfo();
      objj.DisplayCustomInfo();
   }
}
