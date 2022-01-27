import java.util.*;
class trace
{
 public static void main(String args[])
  {
   int i,j,sum=0;
   int a[][] = new int[20][20];
   Scanner obj = new Scanner(System.in);
   System.out.println("enter the size of row");
   int n = obj.nextInt();
   System.out.println("enter the size of coloumn");
   int c = obj.nextInt();
   System.out.println("enter the array elemnts");
   for(i=0;i<n;i++)
   {
    for(j=0;j<c;j++)
     {
       a[i][j] = obj.nextInt();
     }
   }
System.out.println("the trace is ");
for(i=0;i<n;i++)
   {
    for(j=0;j<c;j++)
     { if(i==j)
       sum+=a[i][j];
     }
   }
System.out.println(sum);
}
}