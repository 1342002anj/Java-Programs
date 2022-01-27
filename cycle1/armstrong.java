import java.util.*;
class armstrong
{
 public static void main(String args[])
{
 int num,digit,sum=0,a;
 Scanner obj = new Scanner(System.in);
 System.out.println("enter the number");
 num = obj.nextInt();
 a = num;
 while(a!=0)
{
 digit = a % 10;
 sum+=digit*digit*digit;
 a/=10;
}
if(num==sum)
{ 
 System.out.println(num+"is armstrong");
}
else
{
 System.out.println(num+"is not armstrong");
}
}
}