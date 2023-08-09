class Array5{
public static void main(String args[]){
int[][] Td = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
for(int[] od:Td){     //separate the row
System.out.print("[");
for(int i: od){      //separate the column
System.out.print(i+" ");
}
System.out.println("]");
}
}
}