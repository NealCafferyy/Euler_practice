import java.math.BigInteger;


public class FACTORIAL {
	
	public BigInteger factorial(int num)
	{
		int i;
		BigInteger result = new BigInteger("1");
		for(i=num; i>1; i--)
		{
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		return result;
	}	
	
}
