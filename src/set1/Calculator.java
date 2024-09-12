/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set1;

/**
 *
 * @author ACER NITRO 5
 */
public class Calculator {
    
    public double num1;
    public double num2;
   

    public Calculator(double num1, double num2) {
        
        this.num1 = num1;
        this.num2 = num2;
        
       
        sum();
        minus();
        mult();
        div();
        
    }

    public void sum(){
        
        double sum = num1 + num2;
        System.out.println("The sum is "+ sum);
        
    }
    
    public void minus(){
        
        double minus = num1 - num2;
        System.out.println("The minus is " + minus);
        
    }
        
    public void mult(){
        
        double mult = num1 * num2;
        System.out.println("The multiplication is " + mult);
        
    }
    
    public void div (){
        
        double div = num1 / num2;
        System.out.println("The division is " + div);
        
    }
}