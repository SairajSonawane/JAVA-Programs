import java.lang.*;
import java.util.*;
import java.util.Scanner;
class geometricprogression
{
    public static void main(String[] args) 
    {
        Scanner g=new Scanner (System.in);
        int a=g.nextInt();
        int r=g.nextInt();
        int n=g.nextInt();
        int term=a;
        System.out.println("Enter a, r, n :");
        for(int i=0; i<n; i++){
            term=term*a;
            System.out.println(term+",");
        }

        
    }
}
