class Perfectnum
{
	public static boolean isPerfect(int a)
	{
		int sum=0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==a)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int n=576;
		if(isPerfect(n))
			System.out.println(n+"is a perfect number");
		else
			System.out.println(n+"is not a perfect number");
}
}
