import java.util.*;
class matrixlarge
{
 public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the size of matrix");
 int n= sc.nextInt();
 int c = sc.nextInt();
 int [][] a = new int[n][c];
 int i,j;
 System.out.println("enter the elements of matrix 1");
 for(i=0;i<n;i++)
  {
   for(j=0;j<c;j++)
   {
    a[i][j] = sc.nextInt();
   }
  }
int large = a[0][0];
for(i=0;i<n;i++)
  {
   for(j=0;j<c;j++)
   {
    if(large<a[i][j])
{
 large = a[i][j];
   }
  }System.out.println();
}
System.out.println(large);
}
}
