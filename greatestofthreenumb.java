import java.lang.*;
import java.util.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class greatest
{ 
    public static void main(String[] args) 
    {
        Scanner g=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter numbers: ");
        a=g.nextInt();
        b=g.nextInt();
        c=g.nextInt();
        if(a>b && a>c)
        {System.out.println("a");}
        else if(b>c)
        {System.out.println("b");}
        else
        {System.out.println("c");}


        
        
    }
}