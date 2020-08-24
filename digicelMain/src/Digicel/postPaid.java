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
public class postPaid extends Customer {
    protected double postpaid;
    double charges;
    
    postPaid (){
         postpaid=0.00;
         charges=0.00;
    }
    public postPaid(String cn,int ct,double post,double ch)
    {
        super(cn,ct);
        postpaid=post;
        charges=ch;
        
    }
@Override
    public void GetCustomInfo()
    {
       
     //Scanner input = new Scanner(System.in);
     ///System.out.println("Enter Customer Name :");
    //customname= input.nextLine();
    // System.out.println("Enter Customer Telephhone");
    // customtelenum= input.nextInt();
    //System.out.println("Enter Postpaid charges:");
   // postpaid=input.nextDouble();
 
   customname=JOptionPane.showInputDialog("Enter Customer Name :");
 customtelenum=Integer.parseInt(JOptionPane.showInputDialog("Enter Customer Number")); 
   //postpaid=Double.parseDouble(JOptionPane.showInputDialog("Enter Postpaid charges:"));
   
    }
 
   public double PostpaidCalculation(double postpaid){
       postpaid=Double.parseDouble(JOptionPane.showInputDialog("Enter Postpaid charges:"));
   
      charges = postpaid *2.99;
      return charges;    
     }
    @Override
    public  void  DisplayCustomInfo()
    {
       // System.out.println("Customer Name:"+customname+"\n"+"Customer Telephone Number:"+customtelenum+"\n"+"Total Prepaid Cost:"+charges);
     JOptionPane.showMessageDialog(null,"Customer Name:"+customname+"\n"+"Customer Telephone Number:"+customtelenum+"\n"+"Total Prepaid Cost:"+charges);  
    }
   @Override
   // OVER-RIDE OVER-RIDE A BLANK METHOD
     public void Display()
     {
        postPaid obj= new postPaid();
        obj.GetCustomInfo();
        obj.PostpaidCalculation(postpaid);
        obj.DisplayCustomInfo();
     }
}
