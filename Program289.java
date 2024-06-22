import java.util.*;

/*
    Row = 4
    Col = 4

    1   1   1   1
    1   1   1   1
    1   1   1   1
 */

class Program289
{
    public static void main(String a[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int i = sobj.nextInt();

        System.out.println("Enter number of Columns: ");
        int j = sobj.nextInt();

        pobj.Display(i,j);
    }
}

class Pattern 
{
    public void Display(int iRow, int iCol) 
    {
        int i = 0 , j = 0;
        int iCnt = 1;

        for(i = 1;i <= iRow; i++)
        {
            for(j = 1;j <= iCol; j++)
            {
                System.out.print(iCnt+"\t");
            }
            System.out.println();
        }
    }
}
