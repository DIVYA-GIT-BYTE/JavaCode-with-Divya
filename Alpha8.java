/*
a b c d e
f g h i a
b c d e f
g h i a b
c d e f g
*/
class Alpha8 
{
	public static void main(String[] args) 
	{
		int n=5;
		char ch='a';
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				System.out.print(ch + " ");
				ch++;
				
				if (ch>'i')
				{
					ch='a';
				}
			}
			System.out.println();
		}
	}
}
