import java.util.*;
class Exception2{
public static void main(String[] args){

try{
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();

if(age>120){
throw new MkceDivisionException("Out of range");
}
else if(age<0){
throw new MkceArrayException("Age is in minus value");
}}

catch (MkceDivisionException e){
System.out.println(e.getMessage());
}
catch(MkceArrayException e){
System.out.println(e.getMessage());
}
catch(Exception e){
System.out.println(e.getMessage());
}
}}