class Program1b
{
	public static void main(String[] args)
	{
		try
		{
			
			int a[] = {10,11,12};
			System.out.println(a[9]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
