import java.lang.*;
class paattern
{
    public static void main(String[] args) 
    {
        int count=0;
        for (int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.println(++count+" ");
                System.out.println("%02d"+count);
            }
            System.out.println(" ");
        }
        
    }
}