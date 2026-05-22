class MaxMinDigit 
{
	public static void main(String[] args) 
	{
		int n=5384627;
		int max=0,min=9;
		while (n!=0)
		{
			int r=n%10;
			if (r>max)
			{
				max=r;
			}
			if (r<min)
			{
				min=r;
			}
			n=n/10;
		}
		System.out.println(max);
		System.out.println(min);
	}
}
