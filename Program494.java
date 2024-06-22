import java.util.*;

class Program494
{
    public static void main(String Arg[])
    {
        DBMS dobj = new DBMS();

        dobj.StartDBMS();

        dobj.Insert("Vaibhav",90);
        dobj.Insert("Madhuri",96);
        dobj.Insert("Khushal",80);
        dobj.Insert("Virat",67);

    }
}

class Student
{
    public String Sname;
    public int Marks;
    public int Rollno;

    public static int Generator;

    static
    {
        Generator = 0;
    }

    public Student(String str, int no)
    {
        this.Sname = str;
        this.Marks = no;
        Generator++;
        this.Rollno = Generator;
    }

    public void Display()
    {
        System.out.println("Roll No : "+Rollno+" Name : "+Sname+" Marks : "+Marks);
    } 
}

class DBMS
{
    public LinkedList <Student> lobj;

    public DBMS()
    {
        lobj = new LinkedList();
    }

    public void StartDBMS()
    {
        System.out.println("Marvellous Customised DBMS started succesfully...");
    }

    public void Insert(String str, int no)
    {
        Student sobj = new Student(str, no);
        lobj.add(sobj);
    }
}