import java.lang.*;
class number
{
    public static void main(String[] args) 
    {
        int a=10010;
        
        String str=String.valueOf (a);
        System.out.println(str.matches("[01]+"));
        
    }
}