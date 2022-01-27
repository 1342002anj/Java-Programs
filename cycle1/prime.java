import java.util.*;
class Prime
{
 public static void main(String args[])
 {
  int a,flag=0;
  System.out.println("Enter the number");
  Scanner obj = new Scanner(System.in);
  a=obj.nextInt();
  for(int i=2;i<=a/2;i++)
 {
  if(a%i==0)
    {
      flag=1;
      break;
    }
 }
 if(flag==0)
 {
  System.out.println(a+"is prime");
 }
 else
 System.out.println(a+"is not prime");
 }
 }