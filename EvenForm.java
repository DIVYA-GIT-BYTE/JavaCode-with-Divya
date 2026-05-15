class EvenForm 
{
	public static void main(String[] args) 
	{
		int n=143678;
		int p=1;
		int res=0;
		while (n!=0)
		{
			int r=n%10;
			if (r%2==0)
			{
				res=r*p+res;
				p=p*10;
			}
			n/=10;
		}
		System.out.println(res);
	}
}
