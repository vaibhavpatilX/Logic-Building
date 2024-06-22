#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>

// O_RDONLY     Open for reading
// O_WRONLY     Open for writing
// O_RDWR       Open for reading and writing
int main()
{
    char Fname[20];
    int fd = 0;

    printf("Enter the file name you want to open : \n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);
    
    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File is succcessfuly opened with FD %d\n",fd);
    }

    return 0;
}