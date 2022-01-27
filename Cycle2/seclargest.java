import java.util.*;
class seclargest
{
 public static void main(String args[])
 {
   int i,a,large=0,seclarge=0;
   int []A=new int[100];
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter the size of array: ");
   a=obj.nextInt();
   System.out.println("Enetr the elements into array: ");
   for(i=0;i<a;i++)
   {
     A[i]=obj.nextInt();
   }
   large=A[0];
   for(i=1;i<a;i++)
   {
     if(A[i]>large)
     {
       large=A[i];
       c=i;
     }
   }
   seclarge=A[0];
  for(i=1;i<a;i++)
  {
   if(i!=c)
   {
     if(A[i]>seclarge && A[i]<large)
     {
       seclarge=A[i];
     }
   }
   System.out.println("The second largest element is"+seclarge)
 }
}