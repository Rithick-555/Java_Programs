class Array4
{
    public static void main(String args[])
    {
        int[] myArray={1,2,3,4,5,6};
        int[] hold={10,9,8,7,6,5,4,3,2,1};
        int i;
        System.arraycopy(myArray,0,hold,0,myArray.length);
        for(i=0;i<hold.length;i++)
        {
            System.out.print(hold[i]);
            System.out.print(" ");
        }
            }
}