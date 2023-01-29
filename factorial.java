import java.lang.*;
import java.util.*;
import java.util.Scanner;
class factorial
{
    public static void main(String[] args) 
    {
        Scanner f=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n;
        long product=1;
        n=f.nextInt();
        for(int i=1; i<=n; i++){
            product=product*i;
        }
        System.out.println(product);
        
        
    }
}