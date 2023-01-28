import java.lang.*;
import java.util.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class grade
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.println("Enter your marks :");
        marks=sc.nextInt();
        if (marks>=85);
        {System.out.println("A");}
        else if (marks<=85 && marks>=50)
        {System.out.println("B");}
        else if (marks<=50 && marks>=35)
        {System.out.println("C");}
        else if (marks>35)
        {System.out.println("F");}
        else{System.out.println("Invalid");}
        
    }
}