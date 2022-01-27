class Factor
{
  public static void main(String args[])
  {
     int n;
    System.out.println("enter the number");
    Scanner obj = new Scanner(System.in);
    n=obj.nextInt();
    System.out.print("the factors of n are"+n);
    for(int i=1;i<=n;i++)
    {
       if(n%i==0)
       { System.out.print(i+" ");
       }
    }
  }
} 