#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *lchild;
    struct node *rchild;
};
typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void Insert(PPNODE Root, int No)
{
    PNODE newn = (PNODE)malloc(sizeof(NODE));

    newn->data = No;
    newn->lchild = NULL;
    newn->rchild = NULL;

    PNODE temp = *Root;

    if(*Root == NULL)
    {
        *Root = newn;        
    }
    else
    {
        while(1)
        {
            if(No > temp ->data)
            {
                temp = temp->rchild;

                if(temp->rchild == NULL)
                {
                    temp->rchild = newn;
                    break;
                }
            }
            else if(No < temp->data)
            {
                temp = temp->lchild;

                if(temp->lchild == NULL)
                {
                    temp->lchild = newn;
                    break;
                }
            }
            else if(No == temp ->data)
            {
                free(newn);
                printf("Duplicate elements not allowed!!");
                break;
            }
        }
    }
}

int main()
{
    PNODE Head = NULL;

    Insert(&Head,11);
    Insert(&Head,7);
    Insert(&Head,21);

    return 0;
}