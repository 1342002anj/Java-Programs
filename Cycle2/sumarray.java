import java.util.*;
class sumarray
{
 public static void main(String args[])
{
 int arr[],i,sum=0;
 System.out.println("enter the size");
 Scanner obj = new Scanner(System.in);
 int n = obj.nextInt();
 System.out.println("enter the elements");
 arr = new int[50];
 for(i=0;i<n;i++)
 {
   arr[i] = obj.nextInt();
   sum+=arr[i];
 }
System.out.print("sum is"+sum);
}
}
