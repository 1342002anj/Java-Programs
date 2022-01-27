import java.util.*;
class palindrome
{
 public static void main(String args[])
{ int num,digit,rev=0;
 Scanner obj = new Scanner(System.in);
System.out.println("enter the number");
num = obj.nextInt();
int a= num;
while(a!=0)
{
 digit=a%10;
 rev=(rev*10)+digit;
 a/=10;
}
if(rev==num)
{
 System.out.println(num+"is palindrome");
}
else
{
 System.out.println(num+"is not palindrome");
}
}
}