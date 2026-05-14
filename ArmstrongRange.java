class ArmstrongRange 
{
	public static int count(int a)
	{
		int c=0;
		while (a!=0)
		{
			c++;
			a/=10;
		}
		return c;
	}
	public static int Power(int b,int c)
	{
		int prod=1;
		for (int i=1;i<=c;i++)
		{
			prod*=b;
		}
		return prod;
	}	
	public static void main(String[] args) 
	{
		int m=10,n=200;
		for (int i=m;i<=n;i++)
		{
			int c1=count(i);
			int sum=0;
			while (i!=0)
			{
				int r=i%10;
				sum=sum+Power(r,c1);
				i/=10;
			}
			if (sum==i)
				System.out.println(i);
		}
	}
}
