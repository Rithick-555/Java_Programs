class Youtube extends Thread   //new born
{
    public void run()  //runnable
    {
        for(int i=1;i<=5;i++)
        {
            if(i==3)
            {
                stop();
            }else
            {
            System.out.println("i: "+i);
            }
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
            if(j==3)
            {
                yield();
            }
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
            try{
                sleep(1000);
            }
            catch(Exception e){
                
            }
            System.out.println("k: "+k);
        
        }
        System.out.println("exit from Filetransfer:");
    }
}
class prg18
{
    public static void main(String args[])
    {
        new Youtube().start();  //running
        new Movie().start();
        new Filetransfer().start();
    }
}