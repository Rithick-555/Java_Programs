final class manager
{
    void display()
    {
        System.out.println("This is manager class");
    }
}
class admin extends manager{

}
class prg9
{
    public static void main(String args[]){
        admin a=new admin();
        a.display();
    }
}