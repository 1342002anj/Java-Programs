import java.util.*;
class matrixsum
{
 public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the size of matrix");
 int n= sc.nextInt();
 int c = sc.nextInt();
 int [][] a = new int[n][c];
 int [][] b = new int[n][c];
 int i,j;
 System.out.println("enter the elements of matrix 1");
 for(i=0;i<n;i++)
  {
   for(j=0;j<c;j++)
   {
    a[i][j] = sc.nextInt();
   }
  }
System.out.println("enter the elements of matrix 2");
 for(i=0;i<n;i++)
  {
   for(j=0;j<c;j++)
   {
    b[i][j] = sc.nextInt();
   }
  }
int [][] p = new int[n][c];
System.out.println("enter the elements of matrix 1");
 for(i=0;i<n;i++)
  {
   for(j=0;j<c;j++)
   {
    p[i][j] = a[i][j]+b[i][j];
    System.out.print(p[i][j]+" ");
   }
System.out.println();
  }
}
}