import java.util.*;

class Program488
{
    public static void main(String Arg[])
    {
        Student obj1 = new Student("Vaibhav",89);
        Student obj2 = new Student("Arshu",89);

        obj1.Display();
        obj2.Display();
    }
}

class Student
{
    public String Sname;
    public int Marks;
    public int Rollno;

    public Student(String str , int no)
    {
        this.Sname = str;
        this.Marks = no;
    }

    public void Display()
    {
        System.out.println("Name : "+Sname+" Marks : "+Marks);
    }
}

