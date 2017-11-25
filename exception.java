class abc
{
	public static void main(String args[])
	{
		int i=1;
		try
		{
			if(i<5)
			{
				throw new Myexception("error occured");

			}
		}
		catch(Myexception e)
		{
			System.out.println(e);

		}
	}
}

class Myexception extends Exception
{
	public Myexception(String msg)
	{
		super(msg);
	}
}
