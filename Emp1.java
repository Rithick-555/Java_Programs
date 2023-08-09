class Emp1
{
public Emp1()
{
this(10000);
System.out.println("Defalut constructor");
}
public Emp1(int sal)
{
this("Rithick","20bec4150");
System.out.println("Single constructor:"+sal);
}
public Emp1(String name,String rollno)
{
System.out.println("Two constructor:"+name+" " +rollno);
}
public static void main(String args[])
{
Emp1 e=new Emp1();
}
}
