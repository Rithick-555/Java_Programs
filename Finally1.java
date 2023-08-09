public class Finally1
{
    public static void main(String args[])
    {
        System.out.println(meth());
    }
    static int meth()
    {
        try{
            int i=Integer.parseInt("123");
           return 10;
        }
        catch (Exception ex)
        {
           return 20;
        }
        //finally{
           // return 30;
       // }
    }
}