class Student{
synchronized void printResult(String s){  
{
     for(int i=1;i<=5;i++){  
      System.out.println("Paper " + i + " - " + s);  
      try{  
       Thread.sleep(400);  
      }catch(Exception e){System.out.println(e);}  
     }  
   }  
 }
}   

class Exam extends Thread{  
Student s;  
Exam(Student s)
{  
this.s=s;  
}  
public void run()
{  
s.printResult("Exam");  
}    
}  
class Result extends Thread{  
Student s;  
Result(Student s){  
this.s=s;  
}  
public void run(){  
s.printResult("Result"); 
 
}  
}  
class Leave extends Thread{  
    Student s;  
    Leave(Student s){  
    this.s=s;  
    }  
    public void run(){  
    s.printResult("Leave"); 
     
    } 
}
public class thread1
{  
public static void main(String args[])
{  
Student obj = new Student();  //only one object  
Exam t1=new Exam(obj);  
Result t2=new Result(obj);  
Leave t3=new Leave(obj);
t1.start();  
t2.start();
t3.start();
}  
}  





