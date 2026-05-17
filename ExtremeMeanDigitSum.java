/* 576438
57643*/
class ExtremeMeanDigitSum
{
	public static void main(String[] args) 
	{
		int n=576438;
		int ex=n%10;
		int pow=10,p=1,m=0;
		n=n/10;
		
		while (n!=0)
		{
			int r=n%10;
			if (n>10)
			{
				m=r*p+m;
				p*=10;
			}else{
				ex=r*pow+ex;
			}
		n/=10;
		}
		System.out.println(ex);
		System.out.println(m);
		System.out.println(ex+m);
	}
}
