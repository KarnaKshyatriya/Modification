/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codes;

import java.util.Scanner;

/**
 *
 * @author toast
 */
public class CheckPalidrome {
    Scanner sc=new Scanner(System.in);
    private    int num;
    CheckPalidrome()
    {
        System.out.println("Please Enter Number to check");
     num=sc.nextInt();
        String str=Integer.toString(num);
        String str2="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str2+=str.charAt(i);
            
        }
        if(str.equals(str2))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    
}
