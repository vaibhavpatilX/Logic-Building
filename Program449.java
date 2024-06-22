import java.util.*;

import javax.lang.model.util.ElementScanner14;


class Program449
{
    public static void main(String Arg[]) 
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(101);
        obj.InsertLast(111);

        obj.DeleteFirst();
        obj.DeleteLast();

        obj.Display();

        int ret = obj.CountNodes();

        System.out.println("Number of nodes are : "+ret);
    }
}

class Node      //alternative for Struct node
{
    public int Data;
    public Node Next;       //Node is Reference

    public Node (int No)
    {
        this.Data = No;
        this.Next = null;
    }
}

class SinglyLL
{
    private Node Head;
    private int Count;

    public SinglyLL()
    {
        Head = null;
        Count = 0;
    }

    protected void finalize()       //Memory Free
    {
        //Memory Free
    }

    public void InsertFirst(int No)
    {
        Node newn = new Node(No);
        //newn.Data = No;
        //newn.Next = null;

        if(this.Head == null)
        {
            this.Head = newn;
        }
        else
        {
            newn.Next = this.Head;
            this.Head = newn;
        }
        this.Count++;
    }

    public void Display()
    {
        Node temp = this.Head;
        
        while(temp != null)
        {
            System.out.print("| "+temp.Data+" |->");
            temp = temp.Next;
        }
        System.out.println("NULL");
    }

    public int CountNodes()
    {
        return this.Count;
    }

    public void InsertLast(int No)
    {
        Node newn = new Node(No);
        //newn.Data = No;
        //newn.Next = null;

        if(this.Head == null)
        {
            this.Head = newn;
        }
        else
        {
            Node temp = Head;
            while(temp.Next != null)
            {
                temp = temp.Next;
            }
            temp.Next = newn;
        }
        this.Count++;
    }

    public void DeleteFirst()
    {
        if (this.Count == 0)      //(this.Head == null) 
        {
            return;    
        }
        else if(this.Count == 1)
        {
            this.Head = null;
        }
        else
        {
            Head = Head.Next();
        }
        this.Count--;
    }

    public void DeleteLast()
    {
        if (this.Count == 0)      //(this.Head == null) 
        {
            return;    
        }
        else if(this.Count == 1)
        {
            this.Head = null;
        }
        else
        {
            Node temp = this.Head;

            while (temp.Next.Next != null) 
            {
                temp = temp.Next;
            }
            temp.Next = null;
        }
        this.Count--;
    }
}