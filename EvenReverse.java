class EvenReverse
{
	public static void main(String[] args) 
	{
		int n=39627813;
		int rev=0;
		while (n!=0)
		{
	
			int r=n%10;
			if (r%2==0)
			{
				rev=rev*10+r;
			}
			n/=10;
		}
		System.out.println(rev);
	}
}



