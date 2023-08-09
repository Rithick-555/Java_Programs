import java.util.*;
public class Array8
{
    public static void main(String args[])
    {
        ArrayList<String> s=new ArrayList<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        System.out.println(s);
        ArrayList<Integer>i=new ArrayList<>();
        i.add(10);
        i.add(20);
        i.add(30);
        i.add(40);
        System.out.println(i);
        ArrayList<List> mix=new ArrayList<>();
        mix.addAll((List)s);
        mix.addAll((List)i);
        System.out.println(mix);
    }
}