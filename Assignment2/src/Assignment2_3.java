public class Assignment2_3
{
	public static void main(String[] args) {
		int totalTravelers=11;
		double evngCharge=100;
		double passCost=150;
		boolean nonStop=true;
		boolean travelType=false;//true for Day traveling
		if(travelType)
		{
			System.out.println("Hello Travelerrs you are traveling between 9 am to 5 pm");
			System.out.println("You don't have to pay additional charges");
			if(nonStop)
			{
				System.out.println("Total Charges are ="+ (passCost*3.5)*totalTravelers);
			}
			else
			{
				System.out.println("Total Charges are ="+passCost*totalTravelers);
			}
		}
		else
		{
			System.out.println("Hello Travelerrs you are traveling between 5 pm to 9 pm");
			System.out.println("You have to pay additional charges!!!!...");
			if(nonStop)
			{
				System.out.println("Total Charges are ="+ ((passCost*3.5)*totalTravelers+(evngCharge*totalTravelers)));
			}
			else
			{
				System.out.println("Total Charges are ="+passCost*totalTravelers);
			}
			
		}
	}

}
