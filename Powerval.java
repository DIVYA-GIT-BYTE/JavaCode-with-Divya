class Powerval 
{
	public static int pow(int a ,int b)
	{
		int pro=1;
		while (b>0)
		{
			pro=pro*a;
			b--;
		}
	return pro;
	}
	public static void main(String[] args) 
	{
		System.out.println(pow(2,3));
	}
}
