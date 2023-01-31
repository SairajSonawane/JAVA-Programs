import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class fibonnaic
{
    public static void main(String[] args) 
    {
        Scanner fb=new Scanner (System.in);
        System.out.println("FIBONNAIC SERIES");
        System.out.println("Enter number of Terms : ");
        int n=fb.nextInt();
        int a=0, b=1, c;
        System.out.println(a+","+b+",");
        System.out.println();
        for(int i=1; i<n-2; i++){
            c=a+b;
            System.out.println(c+",");
            a=b;
            b=c;
        }
       
    }
}
