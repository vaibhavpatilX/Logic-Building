import java.util.*;

class Program273
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your full name : ");
        String str = sobj.nextLine();
    
        MarvellousX obj = new MarvellousX();
        int iRet = obj.DigitsCount(str);
        System.out.println("Number of digits are : "+iRet);
    }
}

class MarvellousX
{
    public int DigitsCount(String s) 
    {
        int iCnt = 0;

        for(int i = 0; i < s.length();i++)
        {
            if((s.charAt(i) >= '0') && (s.charAt(i) <= '9'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}