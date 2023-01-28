import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args) 
    {
        Scanner p=new Scanner(System.in);
        int n;
        System.out.println("Enter Number :");
         n=p.nextInt();
        int m=n;
        int rev=0;
        while(n>0) {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(m==rev){
            System.out.println("Its Palindrome Number");
        }
        else {
            System.out.println("Its Not Palindrome Number");
        }
    }
}