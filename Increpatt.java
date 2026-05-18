/*
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
*/

/*class Increpatt 
{
	public static void main(String[] args) 
	{
		int n=10,c=1;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				if (c<=8)
				{
					System.out.print(c++ + "   ");
				}else if(c==9) {
					System.out.print(c++ + "   ");
				}else{
					System.out.print(c++ + "  ");
				}
			}
			System.out.println();
		}
	}
}
Syste.out.printf("%-2d ",c++);
*/
class Increpatt 
{
		public static int length1(int m){
			int length2=0;
			while(m!=0){
				m=m/10;
				length2=length2+1;
			}
			return length2;
		}
	public static void main(String[] args) 
	{
		int n=15,maxlength=0,m=n*n;
		maxlength=length1(m);
		int p=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.printf("%-2d ",p++);
			}
			System.out.println();
		}
	}
}
