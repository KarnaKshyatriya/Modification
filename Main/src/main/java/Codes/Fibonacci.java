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
public class Fibonacci {
    Scanner sc=new Scanner(System.in);
    private    int num;

    public Fibonacci() {
        System.out.println("Please enter the limit of Fibonacci series");
        int num=sc.nextInt();
        int first=0,second=1,sum;
        System.out.print(first+ " "+second+" ");
        for(int i=2;i<num;i++)
        {
            sum=first+second;
            System.out.print(sum+" ");
            first=second;
            second=sum;
            
        }
        System.err.println("");
    }
    }
    
    

