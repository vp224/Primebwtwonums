/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author user
 */
import java.util.Scanner;

    public class Test
    {
        public static void main(String args[]) 
        {
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
            if (a >=1&&b<=1000000000 && b - a <= 100000) 
            {
                int count=0;
                 for (int i= a; i<= b; i++) 
                    {
                        boolean flag= true;
                        if(i==1)
                            flag=false;
                        for(int j= 2;j<=(int)Math.sqrt(i); j++) {
                            if (i%j==0) 
                            {
                                flag= false;
                            }
                        }
                        if (flag) 
                        {
                            count++;
                            System.out.println(i);
                        }
                    }
                 if(count==0)
                     System.out.println("No prime found");
              }
        }
    }