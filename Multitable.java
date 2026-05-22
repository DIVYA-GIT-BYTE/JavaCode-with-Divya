class MultiTable 
{
	public static void Table(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+" x "+i+" = "+(a*i));
	}
	}
	public static void main(String[] args) 
	{
		int m=2,n=6;
		for(int i=m;i<=n;i++)
		{
			Table(i);
		}
	}
}
