import java.util.Scanner;
public class calareaoftriangleusingthreesides
{/**
 * @param args
 */
public static void main(String[] args) 
    {
        System.out.println("Enter a,b,c");
        Scanner tr=new Scanner (System.in);
        int a,b,c;
        float s;
        double area;
        
        a=tr.nextInt();
        b=tr.nextInt();
        c=tr.nextInt();
        s=(a+b+c)/2f;
        area=math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is :"+area); 
    
    }


}