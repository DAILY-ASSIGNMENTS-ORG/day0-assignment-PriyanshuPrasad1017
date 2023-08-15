// Day 0 - Write a program to add two numbers in any programming language of your choice.

import java.util.*;
class day0Sol
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        System.out.println("The sum of the two numbers is " + (x+y));
        sc.close();
    }
}