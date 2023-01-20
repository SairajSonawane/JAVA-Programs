import java.util.Scanner;
class triangle
{public static void main(String[] args) 
    {
    Float base,height,area;
    System.out.println("Enter base and height :");
    Scanner sc=new Scanner (System.in);
    base=sc.nextFloat();
    height=sc.nextFloat();
    area=(base*height)/2;
    System.out.println("Area of triangle :"+area);

    }
}