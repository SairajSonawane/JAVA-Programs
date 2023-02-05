import java.lang.*;
public class reversearrays
{
    public static void main(String[] args) 
    {
        int A[]={1,2,3,4,5,6,7,8,9};
        for(int i= A.length-1; i>=0; i--) {
            System.out.println(A[i]);
        }
    }
}