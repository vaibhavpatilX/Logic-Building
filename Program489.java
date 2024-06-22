import java.util.*;

class Program489
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
    public static int Rollno;

    static
    {
        Rollno = 0;
    }
    public Student(String str , int no)
    {
        this.Sname = str;
        this.Marks = no;
        Rollno++;
    }

    public void Display()
    {
        System.out.println("Roll No : "+Rollno+" Name : "+Sname+" Marks : "+Marks);
    }
}

