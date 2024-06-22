import java.util.*;

class Program271
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your full name : ");
        String str = sobj.nextLine();
    
        MarvellousX obj = new MarvellousX();
        int iRet = obj.SmallCount(str);
        System.out.println("Number of small case letters are : "+iRet);
    }
}

class MarvellousX
{
    public int SmallCount(String s) 
    {
        int iCnt = 0;

        for(int i = 0; i < s.length();i++)
        {
            if((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}