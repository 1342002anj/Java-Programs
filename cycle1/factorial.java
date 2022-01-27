import java.util.*;
class factorial
{
  public static void main(String args[])
  {
    int num,i,j;
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the factorial number");
    num = obj.nextInt();
    for(i=1;i<=num;i++)
    { 
      int fact=1;
      for(j=1;j<=i;j++)
      { 
        fact*=j;
      }
      System.out.println("Factorial of "+i+"is"+fact);
    }
  }
} 
      