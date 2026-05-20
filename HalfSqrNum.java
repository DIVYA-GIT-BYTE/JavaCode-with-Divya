class HalfSqrNum 
{
	public static void main(String[] args) 
	{
		int n=2025;
		int t1=n;
		int c=0;
		while (t1!=0)
		{
			c++;
			t1/=10;
		}
		int div=1;
		for (int i=1;i<=c/2;i++)
		{
			div=div*10;
		}
		int firstpart=n/div;
		int secondpart=n%div;
		int res=firstpart+secondpart;
		if (res*res==n)
		{
			System.out.print("VALID");
		}else{
			System.out.print("INVALID");
		}
	}
}
