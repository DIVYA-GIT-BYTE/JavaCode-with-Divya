class LastDigitoFront 
{
	public static void main(String[] args) 
	{
		int n=142857;
		int t=n;
		int r1=n%10;
		n=n/10;
		int res=0;
		int p=1;
		while (n!=0)
		{
			int r2=n%10;
			res=r2*p+res;
			n/=10;
			p*=10;
		}
		res=r1*p+res;
		if (res*2 == t)
		{
			System.out.print(res + "VALID");
		}else{
			System.out.print(res+ "INALID");
		}
	}
}
