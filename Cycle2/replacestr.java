import java.util.*;
class replacestr
{
 public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the string");
  String p = sc.nextLine();
  System.out.println("enter the character that need to be replaced");
  char s = sc.next().charAt(0);
  System.out.println("enter the character that replaces the existing character");
  char r = sc.next().charAt(0);
  p = p.replace(s,r);
  System.out.println(p);
}
}