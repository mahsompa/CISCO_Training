public class Assignment2_9
{
	public static void main(String[] args) {
		int number=12345;
		int temp=number;
		int remain=0;
		int sum=0;
		while(temp!=0)
		{
			remain=temp%10;
			sum=sum+remain;
			temp=temp/10;
		}
		System.out.println("the sum of all digits of "+number+" is "+sum);
	}

}
