import java.io.*;
class Program1c
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			FileInputStream fin = new FileInputStream("good.txt");
			int i;
			while((i=fin.read())!=-1)
				System.out.println((char)i);
			fin.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
}
