class  SunnyNumber
{
	public static void main(String[] args) 
	{
		int n=25;
		int s=25+1;
		for (int i=1;i*i<=s;i++)
		{
			if (i*i==s)
			{
				System.out.println(n +" is a Sunny number");
				break;
			}else if (i*i>s)
			{
				System.out.println(n + " is a not Sunny Number");
				break;
			}
			
		}
		System.out.println(n + "is not");
	}
}
