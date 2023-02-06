import java.lang.*;
import java.util.Arrays;


public class rotatingarrays
{
    public static void main(String[] args) 
    {
        int[] A = {2, 23, 4, 5, 66, 33, 22, 98};
        System.out.println("Original Array: " + Arrays.toString(A));

        int temp = A[A.length - 1];
        for (int i = A.length - 1; i > 0; i--)
        {
            A[i] = A[i - 1];
        }
        A[0] = temp;

        System.out.println("Rotated Array: " + Arrays.toString(A));
    }
}
