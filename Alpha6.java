class Alpha6
{
	public static void main(String[] args) 
	{
		int n=7;
		int spaces=1;
		for (int i=n;i>=1;i--)
		{
			for (int j=1;j<=n-1;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				if (i==n || j==1 || j==i)
				{
					System.out.print("* ");
				}else{ 
					System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
