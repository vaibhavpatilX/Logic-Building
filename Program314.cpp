//NE*
#include<iostream>
using namespace std;

template <class T>
T Maximum(T Arr[], T iSize)
{
    int iCnt = 0;
    T Max;

    for(iCnt = 0;iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] > Max)
    }
    return Max;
}

int main()
{

    int Data[] = {10,20,30,40};
    int iRet = Maximum(Data,4);

    cout<<"Maximum of integers : "<<iRet<<"\n";

    float Dataf[] = {90.2f,20.2,30.5,50.4};
    float fRet = Maximum(Dataf,4);

    cout<<"Maximum of floats : "<<fRet<<"\n";

    return 0;
}