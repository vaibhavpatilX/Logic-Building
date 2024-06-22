//Reverse order

#include<stdio.h>

    void DisplayReverse(int iNo)
    {
        int iCnt = 0;

        printf("_____________________________________________________\n");
        iCnt = iNo;
        while (iCnt >=1)
        {
            printf("%d\t",iCnt);

            iCnt--;
        }
        printf("\n_____________________________________________________\n");
    }
    int main()
    {
        int iValue = 0;

        printf("Enter the number\n");
        scanf("%d",&iValue);

        DisplayReverse(iValue);

        return 0;
    }