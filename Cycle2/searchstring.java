import java.util.*;
class searchstring
{
 public static void main(String args[])
{
 int i;
Scanner sc = new Scanner (System.in);
System.out.println("enter the string");
String a = sc.nextLine();
int len = a.length();
System.out.println("enter the charater that need to search in the string");
char s =sc.next().charAt(0);
for(i=0;i<len;i++)
{ if(a.charAt(i)==s)
 {
  System.out.println("element found");
 }
else
System.out.println("element not found");
}}
}