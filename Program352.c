#include<stdio.h>
//4
// 4 + 3 + 2 + 1 = 10

int Addition(int no)
{
    int Sum = 0;
    int iCnt = 1;

    while(iCnt <= no)
    {
        Sum = Sum + iCnt;
        iCnt++;
    }
    return Sum;
}
int main()
{
    int Value = 0;
    int iRet = 0;
    printf("Enter the number : \n");
    scanf("%d",&Value);

    iRet = Addition(Value); 
 
    printf("Addition is : %d\n",iRet);
    return 0;
}