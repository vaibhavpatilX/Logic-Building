#include<stdio.h>
#include<stdbool.h>

//12th Bit

typedef unsigned int UINT;

//  0000    0000    0000    0000    0000    0000    0000    0000

//  1111    1111    1111    1111    1111    1111    1111    0111

//    F       F       F       F       F       F       F       F

//  FFFFFFFF7 
//  0XFFFFFFFF7      

UINT OffBit(UINT No)
{
   UINT iMask = 0XFFFFFFF7;

   return (No & iMask);
}

int main()
{
    UINT Value = 0;
    UINT iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&Value);

    iRet = OffBit(Value);

    printf("Updated number is : %d\n",iRet);

    return 0;
}