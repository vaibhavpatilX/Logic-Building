#include<stdio.h>
//4
// 4 + 3 + 2 + 1 = 24

int Factorial(int no)
{
    static int Sum = 1;
    static int iCnt = 1;

    if(iCnt <= no)
    {
        Sum = Sum * iCnt;
        iCnt++;
        Factorial(no);
    }
    return Sum;
}
int main()
{
    int Value = 0;
    int iRet = 0;
    printf("Enter the number : \n");
    scanf("%d",&Value);

    iRet = Factorial(Value); 
 
    printf("Factorial is : %d\n",iRet);
    return 0;
}