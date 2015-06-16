public class Assignment2_10 
{
	public static void main(String[] args) {
		int number=12345;
		int temp=number;
		int reverse=0;
		while(temp!=0)
		{
			reverse=reverse*10+temp%10;
			temp=temp/10;
		}
		System.out.println("the reversed number is "+reverse);
	}

}
