class Youtube extends Thread
{
    public void run()  //runnable
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("i: "+i);
        }
        System.out.println("exit from Youtube:");
    }
}
class Movie extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("j: "+j);
        }
        System.out.println("exit from Movie:");
    }
}
class Filetransfer extends Thread
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.println("k: "+k);
        }
        System.out.println("exit from Filetransfer:");
    }
}
class prg17
{
    public static void main(String args[])
    {
        new Youtube().start();  //running
        new Movie().start();
        new Filetransfer().start();
    }
}