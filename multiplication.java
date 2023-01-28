import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class multiplication
{
    public static void main(String[] args) 
    {
        Scanner ml=new Scanner (System.in);
        int n;
        System.out.println("Enter number : ");
        n=ml.nextInt();
        for(int i=0; i<=10; i++) {
            System.out.println(n+ "X" +i+ "=" +(n*i));
        }


        
    }
}