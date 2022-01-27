import java.util.*;
class matrixtranspose
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the size of matrix");
 int m = sc.nextInt();
 int n = sc.nextInt();
 int [][] a = new int[m][n];
 int [][] c = new int[n][m];
 int i,j;
 System.out.println("enter the elements of array");
 for(i=0;i<m;i++)
 {
  for(j=0;j<n;j++)
  { a[i][j]=sc.nextInt();
  }
 }
for(i=0;i<m;i++)
 {
  for(j=0;j<n;j++)
  { c[i][j]=a[j][i];
  }
 }
System.out.println("transpos of entered matrix is");
for(i=0;i<n;i++)
 {
  for(j=0;j<m;j++)
  {
    System.out.print(c[i][j]+" ");
  }
System.out.println();
}
}
}