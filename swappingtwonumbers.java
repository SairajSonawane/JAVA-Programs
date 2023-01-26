import java.lang.*;
import java.util.*;
import java.util.Scanner;
class Data
{
    public static void main(String[] args) 
    {
        Scanner sa=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers :");
        a=sa.nextInt();
        b=sa.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
        
    }
}