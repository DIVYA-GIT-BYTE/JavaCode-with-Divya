class Up2
{
	public static void main(String[] args) 
	{
		int n=5,m=(n*2)-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(n-i);j++){
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
				System.out.print("*");
			for(int j=2;j<=i;j++)
				System.out.print("*");
		System.out.println();
		}
		for(int i=1;i<=(n+1);i++){
			System.out.print("  ");
			for(int j=1;j<=(m-4);j++)
				System.out.print("*");
			System.out.println();
		}
		int dec=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<i;j++)
			System.out.print(" ");
			for(int j=(m-dec);j>=1;j--){
			System.out.print("*");
			}
			dec+=2;
			System.out.println();
		}
	}
}
