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
public class PrintPattern {
    Scanner sc=new Scanner(System.in);
    private    int num;
    PrintPattern()
    {
    System.out.println("pLease enter the pattern row number");
    int num=sc.nextInt();
    for(int i=0;i<num;i++)
    {
        for(int j=0;j<num-i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    }
    
    
}
