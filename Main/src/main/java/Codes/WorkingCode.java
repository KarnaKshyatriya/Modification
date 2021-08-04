package Codes;

import static java.lang.System.exit;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toast
 */
public class WorkingCode {
    
    private CheckPalidrome var1;
            private PrintPattern var2;
            private Fibonacci var3;
            private CheckPrime var4;
            Scanner sc=new Scanner(System.in);
            private int choice;
   public WorkingCode()
    {
        System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
        
        choice=sc.nextInt();
        switch (choice) {
case 0: {

exit(0);

break;

}

case 1: {

var1=new CheckPalidrome();
break;

}



 

case 2: {

 

var2=new PrintPattern();
break;

}



 

case 3: {

var4=new CheckPrime();
break;

}


 

case 4: {

 var3=new Fibonacci();


break;

}

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}
        var1=new CheckPalidrome();
        var2=new PrintPattern();
        var3=new Fibonacci();
        var4=new CheckPrime();
        
    }
    
}
