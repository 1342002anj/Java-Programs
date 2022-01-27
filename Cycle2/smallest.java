import java.util.*;
class smallest
{
 public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.print("how many elemnts");
 int n = sc.nextInt();
 int i;
 System.out.println("enter the elements");
 int []a=new int[50];
 for(i=0;i<n;i++)
 {
  a[i] = sc.nextInt();
 }
 int small = a[0];
 for(i=1;i<n;i++)
 { if(a[i]<small)
   {
    small = a[i];
   }
 }
 System.out.println(small);
}
}
  