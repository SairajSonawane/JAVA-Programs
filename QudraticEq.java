import java.lang.*;
import java.util.*;
class Equation
{public static void main(String[] args) 
    {
        int a,b,c;
        double r1,r2;
        System.out.println("Enter a b c :");
        Scanner sc=new Scanner (System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        r1=(-b+math.sqrt(b*b-4*a*c))/(2*a);
        r2=(-b-math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Roots are"+r1+" "+r2);

    }
}