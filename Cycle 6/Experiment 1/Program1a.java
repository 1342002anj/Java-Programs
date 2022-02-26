class Program1a
{
	public static void main(String[] args)
	{
		try
			{
		int b, a = 10;
		b = a/0;
		System.out.println(b);
			}
		catch(ArithmeticException e)
			{
				System.out.println(e);
			}
	}	
}	
