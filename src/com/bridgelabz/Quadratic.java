package com.bridgelabz;

import java.util.Scanner;

public class Quadratic 
{
	public static void QuadraticRoots()
    {
        System.out.println("Enter the values of a,b & c : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double delta =  ((Math.pow(b, 2)) - (4*a*c));
        System.out.println(delta);
        if(delta>0)
        {
           double root1 =  (double)((-b + Math.sqrt(delta))/(2*a));
           double root2 =  (double)((-b + Math.sqrt(delta))/(2*a));
            System.out.println(" Roots of the Equation ax^2+bx+c : " );
            System.out.println("Root1 = "+root1+" Root2 = "+root2);
        }
        else
            System.out.println("Imaginary roots have entered");
        sc.close();
    }

    public static void main(String[] args)
    {
        QuadraticRoots(); 
    }

}
