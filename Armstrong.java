import java.lang.*;
import java.uitl.*;
import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args) 
    {
        Scanner a=new Scanner(System.in);
        int n;
        System.out.println("Enter Number :");
        n=a.nextInt();
        int m=n;
        int r;
        
        int sum=0;
        while(n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        System.out.println(sum);
        if(m==sum){
            System.out.println("Its Armstrong Number");
        }
        else{
            System.out.println("Its Not Armstrong Number");
        }

        
    }
}