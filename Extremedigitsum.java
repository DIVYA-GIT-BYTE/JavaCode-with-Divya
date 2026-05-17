class Extremedigitsum 
{
	public static void main(String[] args) 
	{
		int n=387416;
		int r1=n%10;
		int r2=0;
		while(n!=0)
		{
			r2=n%10;
			n=n/10;
		}
		System.out.println(r1+r2);
	}
}
