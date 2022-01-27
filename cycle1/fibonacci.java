import java.util.*;
class fibonacci
{
  public static void main(String args[])
  {
    int first=0;second=1,third;
    int n;
    Scanner obj = new Scanner(System.in);
    n = obj.nextInt();
    System.out.println("The fibonacci series:"+first+" "+second);
    for(int i=2;i<=n;i++)
    {
       third = first+second;
       System.out.print(" "+third+" ");
       first=second;
       second=third;
    }
  }
} 