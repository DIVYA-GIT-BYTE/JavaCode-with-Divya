class DivisionWO
{
	public static void main(String[] args) 
	{
		int a=18,b=4;
		int c=0;
		while (a>=b)
		{
			a=a-b;
			c++;
		}
		System.out.println("Remainder" + a);
		System.out.println("Quotient" + c);
	}
}
