import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class arithmeticprogression
{
    public static void main(String[] args)  
    {
        Scanner ap=new Scanner(System.in);
        System.out.println("Enter a, d, n :");
        int a=ap.nextInt();
        int d=ap.nextInt();
        int n=ap.nextInt();
        int term=a;
        for( int i=0; i < n; i++){
             term=term+d;
            System.out.println(term+",");
        }
        
    }
}