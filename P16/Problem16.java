import java.math.BigInteger;


public class Problem16 {
	public static void main(String[] args)
	{
		BigInteger square = new BigInteger("1");
		String numString;
		int sum=0;
		for(int i=0; i<1000; i++)
		{
			square = square.multiply(BigInteger.valueOf(2));
		}
		numString = square.toString();
		
		System.out.println(numString);
		for(int i=0; i<numString.length(); i++)
		{
			sum += numString.charAt(i) - '0';
			System.out.println(numString.charAt(i));
		}
		
		System.out.println(sum);
	}
	
	
}
