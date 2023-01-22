import java.util.Scanner;
class Expressionn
{public static void main(String[] args) 
    {
        int l,b,h;
        int totalarea, volume;
        Scanner sa=new Scanner (System.in);
        l=sa.nextInt();
        b=sa.nextInt();
        h=sa.nextInt();
        totalarea=2*(l*b+b*h+l*h);
        volume=l*b*h;
        System.out.println("Total area " +totalarea);
        System.out.println("Volume " +volume);

    }
}