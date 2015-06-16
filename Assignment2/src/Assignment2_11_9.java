public class Assignment2_11_9 
{
	public static void main(String[] args) {
		int n=11;
		int star=n;
		int space=0;
		if(n%2!=0)
		{
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print("*");
				
			}
			if(i<n/2)
			{
				star=star-2;
				space++;
			}
			else
			{
				star=star+2;
				space--;
			}
			System.out.println();
			
		}
		}
		else
		{
			System.out.println("This Pattern Can't Possible!!!!");
		}

	}
}
