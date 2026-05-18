class DigitAscending 
{
	public static void main(String[] args) 
	{
		int n=5361793;
		int r1=n%10; 
		n=n/10;
		p=1;
		int res=r1*p;
		p=p*10;
		while (n!=0)
		{
			int r2=n%10; 
			if (r1<=r2)
			{
			   res=r2*p+res;
			   p*=10;
			}else{
				res=res*10+r2;
			}
			n=n/10;
		}
	}
}
