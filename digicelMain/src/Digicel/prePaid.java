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
public class prePaid extends Customer {
    protected double  prepaid;
    double charges;
 
prePaid()
{
    prepaid= 0.00;
    charges=0.00;
}
public prePaid(String cust,int custnum,double pre,double charg)
{
    super (cust,custnum);
    prepaid=pre;  
    charges=charg;
}
@Override
 public void GetCustomInfo()
 {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter Customer Name :");
     customname= input.nextLine();
     System.out.println("Enter Customer Telephhone");
     customtelenum= input.nextInt();
     System.out.println("Enter Prepaid charges");
     prepaid=input.nextDouble();
 
    //customname=JOptionPane.showInputDialog("Enter Customer Name :");
    //customtelenum=Integer.parseInt(JOptionPane.showInputDialog("Enter Customer Number"));
    //prepaid=Double.parseDouble(JOptionPane.showInputDialog("Enter Prepaid charges:"));
    charges=prepaid*1.50;
    
   
 }
 @Override 
 public  void  DisplayCustomInfo()
 {
     System.out.println("Customer Name:"+customname+"\n"+"Customer Telephone Number:"+customtelenum+"\n"+"Total Prepaid Cost:"+charges);
     
     //JOptionPane.showMessageDialog(null,"Customer Name:"+customname+"\n"+"Customer Telephone Number:"+customtelenum+"\n"+"Total Prepaid Cost:"+charges);
 }
@Override
//OVER-RIDE A BLANK METHOD
 public void Display()
 {
     prePaid obj= new prePaid();
     obj.GetCustomInfo();
     obj.DisplayCustomInfo();
     
 }
}
