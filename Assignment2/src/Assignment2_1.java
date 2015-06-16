
public class Assignment2_1 {

	public static void main(String[] args)
	{
		String name= "sanjay";
		float f = name;//Type mismatch: cannot convert from String to float.both are in different hierarchy.
		
		//Widening
		
		byte b = 11;
		System.out.println("The value is ="+b);
		short s = b;//converting byte to short.
		System.out.println("The value is ="+s);
		int i = s;//converting short to int.
		System.out.println("The value is ="+i);
		long l = s;//converting from short to long.
		System.out.println("The value is ="+l);
		f = l;//converting long to float
		System.out.println("The value is ="+f);
		double d = f;// converting from float to double.
		System.out.println("The value is ="+d);

		//narrowing
		
		double d2 =12312.12119d;
		System.out.println("The value is ="+d2);
		
		float f2 = (float) d2;//Explicitly casting
		System.out.println("The value is ="+f2);
		f2= 10.1f;
		System.out.println("The value is ="+f2);
		
		long l2 = (long) f2;//Explicitly casting
		System.out.println("The value is ="+l2);
		l2 = 102;
		System.out.println("The value is ="+l2);
		
		int i2 = (int) l2;//Explicitly casting
		System.out.println("The value is ="+i2);
		i2 = 12;
		System.out.println("The value is ="+i2);
		
		short s2 = (short) i2;//Explicitly casting
		System.out.println("The value is ="+s2);
		s2 = 112;
		System.out.println("The value is ="+s2);
		
		byte b2= (byte) s2;//Explicitly casting
		System.out.println("The value is ="+b2);
		b2 = 11;
		System.out.println("The value is ="+b2);
	}

}
