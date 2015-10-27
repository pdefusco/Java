
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.3f; //add f at the end to make a double into a float
		float floatValue2 =(float)99.3;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE); //every data type has a series of methods
		
		//intValue = longValue doesn't work because of conversion error; remedy is:
		intValue = (int)longValue; //longValue needs more storage memory to fir into intValue, thus the error
		
		System.out.println(intValue);
		
		doubleValue = intValue; //this works without casting because the intValue fits into the doubleValue comfortably
		System.out.println(doubleValue);
		
		intValue = (int)floatValue; //casting allows to get rid of decimal -- not rounding here, just chopping 
		System.out.println(intValue);
		
		//this will work but not the way we expect it to
		//128 is too big for a byte		
		byteValue = (byte)128;
		System.out.println(byteValue);
	}

}
