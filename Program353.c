#include<stdio.h>
//4
// 4 + 3 + 2 + 1 = 10

int AdditionR(int no)
{
    static int Sum = 0;
    static int iCnt = 1;

    if(iCnt <= no)
    {
        Sum = Sum + iCnt;
        iCnt++;
        AdditionR(no);
    }
    return Sum;
}
int main()
{
    int Value = 0;
    int iRet = 0;
    printf("Enter the number : \n");
    scanf("%d",&Value);

    iRet = AdditionR(Value); 
 
    printf("Addition is : %d\n",iRet);
    return 0;
}