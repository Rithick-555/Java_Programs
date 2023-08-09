import java.util.Scanner;
class Emp
{
int empno;
String ename;
public void Emp(int empno,String ename)
{
this.empno=empno;
this.ename=ename;
}}
class Manager extends Emp
{
    String Nmae;
    public Manager(int empno,String ename,String Managername)
    {super(empno,ename);
    Mname=Managername;
    }
    void display2()
    {
System.out.println("Emp no:"+empno);
System.out.println("Emp name:"+ename);
System.out.println("Manager name:"+Mname);
}
}
class Test16
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter Emp no:");
int empno=in.nextInt();
System.out.println("Enter Emp name:");
String ename =in.next();
System.out.println("Enter Man name:");
String Mname =in.next();
Manager a=new Manager(empno,ename,Mname);
a.display2();
}
}