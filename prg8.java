class Emp
{
    int salary,bonus,total;
    public Emp(int sal,int bon)
    {
        salary=sal;
        bonus=bon;
    }
    public Emp(Emp obj)
    {
        obj.total=obj.salary+obj.bonus;
    }
    public Emp(Emp obj,int inc){
        System.out.println(obj.total+inc);
    }
    void showData()
    {
        System.out.println("Total salary:" +total);
    }
}
public class prg8
{
    public static void main(String args[])
    {
        Emp e= new Emp(100000,10000);
        e.showData();
        Emp e1=new Emp(e);
        e.showData();
        Emp e2=new Emp(e,5000);
    }
}