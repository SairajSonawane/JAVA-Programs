import java.lang.*;
import java.util.*;
import java.uitl.Scanner;
public class reversenumber
{
    public static void main(String[] args) 
    {
        Scanner rn=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n=rn.nextInt();
        int ans=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            ans=ans*10+r;

        }
        System.out.println(ans);
    }
}