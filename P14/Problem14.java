
public class Problem14 {
	public static void main(String[] agrgs){
		int i;
		int maxCount=0;
		int count=0;
		long n;
		int startingNum=0;
		
		for(i=2; i<1000000; i++)
		{
			n = i;
			count = 1;
			while(n!=1)
			{
				if(n % 2 == 1)
				{
					n = 3*n + 1;
				}
				else
				{
					n = n/2;
				}
				count++;
			}
			if(maxCount < count)
			{
				maxCount = count;
				startingNum = i;
			}
			System.out.println(i+" "+maxCount+" "+startingNum);
		}
		
		System.out.println("longest chain number:" + startingNum + " " + maxCount );
		
	}
}
