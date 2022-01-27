import java.util.*;
class naturalsum
{
 public static void main(String args[])
  {
    int n,sum=0;
    System.out.println("Enter the number");
    Scanner obj = new Scanner(System.in);
    n= obj.nextInt();
    for(int i=1;i<=n;i++)
    {
       sum+=i;
    }
   System.out.println("the sum of first"+n+"natural numbers is;"+sum);
 }
}  
      