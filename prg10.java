class Manager
{
    public class Emp
    {
        public void print(){
            System.out.println("This is an inner class");
        }
    }
    void display_Emp()
    {
        Emp e=new Emp();
        e.print();
    }
}
public class prg10
{
    public static void main(String args[])
    {
        Manager m = new Manager();
        m.display_Emp();
    }
}