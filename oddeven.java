import java.lang.*;
import jaba.util.*;
import java.util.Scanner;
class oddeven
{
    public static void main(String[] args) 
    {

        Scanner oe=new Scanner(System.in);
        int n;
        System.out.println("Enter number :");
        n=oe.nextInt();
        if(n%2==0)
        {System.out.println("ITS EVEN NUMBER");}
        else
        {System.out.println("ITS ODD NUMBER");}

        
    }
}
