import java.util.*;
class Array7 {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
ArrayList l=new ArrayList();
String obj;
System.out.println("Enter No : ");
int no=sc.nextInt();
for(int i=1;i<=no;i++){
System.out.println("Enter Element : ");
l.add(sc.next());
}
for(Object i:l)
{
    if(i.getClass().equals(Integer.class))
    {

    }
System.out.print(" "+i);
}}}