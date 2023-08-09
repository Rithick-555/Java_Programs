import java.util.*;
class Array2 {
public static void main(String args[]){
int m[][][]=new int[2][2][2];
int i,j,k,no=1;
for(i=0;i<2;i++)
{
for(j=0;j<2;j++){
for(k=0;k<2;k++){
m[i][j][k]=no;
System.out.print(m[i][j][k] +" ");
no++;
}
System.out.println("\n");
}
System.out.println("\n\n");
}
}
}