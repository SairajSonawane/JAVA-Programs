import java.lang.*;
import java.util.*;
import java.util.Scanner;
class numbers
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter n number : ");
        int n=sc.nextInt();
        int sum=0;
        
        for (int i=0; i<=n; i++) {
            sum= sum+i;
        }
        
        System.out.println(Sum);
        
    }
}
