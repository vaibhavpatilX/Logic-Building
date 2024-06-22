import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;  

class Program429
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = sobj.nextLine();
        
        System.out.println("Enter the world you want to search : ");
        String Word = sobj.nextLine();

        String Arr[] = str.split(" ");
        
        int iCount = 0;
        
        for(int i = 0; i< Arr.length; i++)
        {
            if(Arr[i].length())
            {
                iCount++;
            }
        }

        System.out.println("Freqency of Word is : "+iCount);
    } 
}   