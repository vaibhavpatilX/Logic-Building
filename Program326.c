#include<stdio.h>

void DisplayBinary(unsigned int NO)
{
    int Digit = 0;

    while(NO != 0)
    {
        Digit = NO % 2;
        printf("%d",Digit);
        NO = NO / 2;
    }
    printf("\n");

}

int main()
{
    unsigned int Value = 11;

    DisplayBinary(Value);

    return 0;
}