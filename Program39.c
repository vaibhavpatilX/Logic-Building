//Reverse order

#include<stdio.h>

void DisplayReverse(int iNo)
{
    int iCnt = 0;

    printf("____________________________________________________________________________________\n");
    for (iCnt = iNo; iCnt >=1; iCnt--)
    {
        printf("%d\t",iCnt);
    }
    printf("\n____________________________________________________________________________________\n");
}
int main()
{
    int iValue = 0;

    printf("Enter the number\n");
    scanf("%d",&iValue);

    DisplayReverse(iValue);

    return 0;
}