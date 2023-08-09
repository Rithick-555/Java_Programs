class Array3
{
public static void main(String args[])
{
int[] a={12,21,0,5,7};
int[] b=a;
int[] c=b.clone();
for(int i1:a)
{
System.out.print(i1+" ");
}
System.out.println();
for(int i2:b)
{
System.out.print(i2+" ");
}
System.out.println();
for(int i3:c)
{
System.out.print(i3+" ");
}
}
}