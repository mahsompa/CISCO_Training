public class Assignment2_2 {

	public static void main(String[] args)
	{
		float totalChildFare,totalAdultFare,totalFare;
		float adultBaseFare= 250.06f;
		float childBaseFare=(float) ((0.7)*adultBaseFare);
		int totalAdult=12, totalChild=8;//try changing the values
		int totalPass=totalAdult+totalChild;
		float totalAdultBaseFare= totalAdult*adultBaseFare;
		float totalChildBaseFare = totalChild*childBaseFare;
		totalAdultFare =totalAdultBaseFare+((totalAdultBaseFare*14)/100);
		totalChildFare =totalChildBaseFare+((totalChildBaseFare*14)/100);
		float totalBaseFare = totalAdultBaseFare+totalChildBaseFare;
		totalFare=totalAdultFare+totalChildFare;
        System.out.println("Total no. of Adults = "+totalAdult+", Total Base Fare of Adults ="+totalAdultBaseFare+", TAX = 14% , Total fare of Adults ="+totalAdultFare);
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Total no. of Child = "+totalChild+", Total Base Fare of Childs ="+totalChildBaseFare+", TAX = 14% , Total fare of Childs ="+totalChildFare);
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Total no. of Passenger = "+totalPass+", Total Base Fare ="+totalBaseFare+", TAX = 14% , Total fare ="+totalFare);
        System.out.println("-------------------------------------------------------------------------------------------------------");
		
	}

}