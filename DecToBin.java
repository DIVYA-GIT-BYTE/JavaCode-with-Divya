class DecToBin 
{
	public static void main(String[] args) 
	{
		int n=77;
		String res="";
		while (n!=0)
		{
			int r=n%2;
			res=r+res;
			n/=2;
		}
		System.out.println(res);
	}
}
