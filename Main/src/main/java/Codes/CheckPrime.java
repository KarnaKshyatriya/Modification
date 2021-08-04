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
public class CheckPrime {
    Scanner sc=new Scanner(System.in);
    private    int num;

    public CheckPrime() {
        System.out.println("pLease enter a number to Check Prime or Composite");
    int num=sc.nextInt();
    int flag=0;
    for(int i=2;i<num;i++)
    {
        if(num%i==0)
        {
            flag=1;
            break;
        }
        else
            flag=2;
    }
        
        if(flag==2)
            System.out.println("Prime Number");
        else
           System.out.println("Not Prime Number"); 
    }
    }

    

