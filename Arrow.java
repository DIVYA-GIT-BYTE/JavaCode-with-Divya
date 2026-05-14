class Arrow
{
	public static void main(String[] args) 
	{
	int sp=4,st=1,str=1;
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
	
	for(int j=1;j<=st;j++){
		System.out.print("*");
	}
	System.out.println();
	if(i<=3)
		{
		st++;
		sp-=2;
		}else{
			sp=2;
			st=3;
}
}
	}
	}
