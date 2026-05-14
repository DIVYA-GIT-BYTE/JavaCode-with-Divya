class Alpha5 
{
	public static void main(String[] args) 
	{
		int n=7;
		int alpha=n-1;
		int spaces=n-1;
		for (int i=1;i<=n;i++)
		{
			char ch='A';
			/*for (int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}*/
			for (int j=1;j<=alpha;j++)
			{
				System.out.print(ch++ + " ");
			}
			alpha-=1; 
			System.out.println();
		}
		for (int i=2;i<=n;i++)
		{
			char ch='A';
			/*for (int j=1;j<=spaces;j++)
			{
				System.out.print("  ");
			}*/
			spaces-=1;
			for (int j=1;j<=i;j++)
			{
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		
	}
}
