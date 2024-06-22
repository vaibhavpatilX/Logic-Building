import java.util.*;

class Program269
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your full name : ");
        String str = sobj.nextLine();
    
        for(int i = 0; i < str.length();i++)    //loop 5 time will run if we run "Hello"
        {
            System.out.println(str.charAt(i));
        }

    }
}