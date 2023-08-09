import java.util.Scanner;
class Emp
{
Scanner in=new Scanner(System.in);
int empno;
String ename;
String project;
String location;
String hr;
String accounts;
void display()
{
System.out.println("Enter Emp no:");
empno=in.nextInt();
System.out.println("Enter Emp name:");
ename=in.next();
System.out.println("Enter project name:");
project=in.next();
System.out.println("Enter location name:");
location=in.next();
System.out.println("Enter hr name:");
hr=in.next();
System.out.println("Enter accounts name:");
accounts=in.next();
}
void display2()
{
System.out.println("Emp no:"+empno);
System.out.println("Emp name:"+ename);
System.out.println("Project:"+project);
System.out.println("location:"+location);
System.out.println("hr"+hr);
System.out.println("accounts:"+accounts);
}
}
class Manager extends Emp{
void display3()
{
System.out.println("This is manager class");
}
}
class hr extends Manager{
    void display7{
        System.out.println("This is hr class");
    }
}
class accounts extends manager{
    void display(){
        System.out.println("This is accounts class");
    }
}
class Client extends Emp{
void display4()
{
System.out.println("This is client class");
}
}
class location extends Client{
    void display5(){
       System.out.println("This is location class");
    }
}
class project extends Client{
    void display6(){
       System.out.println("This is project class");
    }
}
class prg14
{
public static void main(String args[])
{
Manager a=new Manager();
a.display();
a.display2();
a.display3();
Client b=new Client();
b.display();
b.display2();
b.display4();
}
}