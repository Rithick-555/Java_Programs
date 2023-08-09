import wibro.aws;
import wibro.azure;
import zoho.python;
import zoho.java;
class project
{
    public static void main(String args[])
    {
        aws a=new aws();
        a.display();
        azure b=new azure();
        b.display();
        python c=new python();
        c.display();
        java d=new java();
        d.display();
    }
}