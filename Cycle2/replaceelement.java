import java.util.*;
class replaceelement
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
System.out.println("enter the element to be replaced");
int r = sc.nextInt();
System.out.println("enter the new number");
int ne = sc.nextInt();
for(i=0;i<n;i++)
 {
  if(a[i]==r)
   {
    a[i]=ne;
   }
 }
System.out.print("the array after replacing");
 for(i=0;i<n;i++)
 {
   System.out.print(a[i]+" ");
 }
}
} 