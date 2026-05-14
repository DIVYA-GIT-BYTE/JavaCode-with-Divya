

class Alpha9 
{
	public static void main(String[] args) 
	{
		int n=5;
		char ch='a';
		int st=0;
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				if (j%2==0)
				{
					System.out.print(st + " ");
					st++;
					
				}else{
					System.out.print(ch + " ");
					ch++;
				}
			}
			System.out.println();
		}
		
	}
}
