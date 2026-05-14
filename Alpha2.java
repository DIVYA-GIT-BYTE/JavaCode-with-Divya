/*
        A
      A B
    A B C
  A B C D
A B C D E
*/


class Alpha2  
{
	public static void main(String[] args) 
	{
		int n=5;
		int spaces=n-1;
		for (int i=1;i<=n;i++)
		{
			char ch='A';
			for (int j=1;j<=spaces;j++)
			{
				System.out.print("  ");
			}
			spaces-=1;
			for (int j=1;j<=i;j++)
			{
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		
	}
}