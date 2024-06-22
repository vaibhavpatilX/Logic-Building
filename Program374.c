#include<stdio.h>

void DisplayR(int Arr[], int iSize)
{
    static int iSum = 0;
    static int iCnt = 0;

    if(iCnt < iSize)
    {
        printf("%d\n",Arr[iCnt]);
        iSum = Arr[]
        iCnt++;
        DisplayR(Arr,iSize);
    }
}
int main()
{
    int Brr[5] = {10,20,30,40,50};
    int Ret = 0;
    
    Ret= DisplayR(Brr,5);

    return 0;
}