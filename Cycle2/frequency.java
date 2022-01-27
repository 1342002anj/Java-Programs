import java.util.*;
class frequency
{
 public static void main(String args[])
{int i,count=0;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the string");
 String a = sc.nextLine();
 int len = a.length();
 a=a.toLowerCase();
 System.out.println("enter the charatcer that need to search in the string");
char s =sc.next().charAt(0);
 for(i=0;i<len;i++)
 {
  if(a.charAt(i)==s)
  {
   count++;
  }
}
System.out.println(count);
}
}