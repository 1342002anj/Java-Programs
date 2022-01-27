class Evenodd
{
 public static void main(String args[])
 {
   int a;
   Scanner obj = new Scanner(System.in);
   System.out.println("enter the numbers");
   a=obj.nextInt();
   if(a%2==0)
   {
    System.out.println("a+"is even");
   }
   else
   System.out.println("a+"is odd");
 }
}
