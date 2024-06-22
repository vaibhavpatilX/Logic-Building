import java.util.*;

class Program479
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        System.out.println(str.length());
        System.out.println(Arr.length);
        //System.out.println(Arr);
        //System.out.println(str);

        int Count = 0;

        int i = 0;
        while(i<Arr.length)
        {
            if ((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Count++;    
            }
        }
        i++;
        System.out.println("Small character are : "+Count);
    }
}