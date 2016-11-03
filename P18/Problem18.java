import java.io.*;
import java.util.*;


public class Problem18 {

	public static void main(String[] args) throws Exception {
		String path = "D:/eclipse-java-neon-1a-win32-x86_64/javaProject/ProjectEuler/src/Problem18.txt";
		FileReader fr = new FileReader(path);
		int c;
		int i, j, count;
		ArrayList<Integer> colList;
		ArrayList<ArrayList<Integer>> rowList = new ArrayList<ArrayList<Integer>>();
		
		StringBuffer totalString = new StringBuffer();
		
				
		while( (c = fr.read()) != -1)
		{
			if( c>='0' && c<='9')
			{
				totalString.append(c-'0');
			}
			else if(c == ' ')
			{
				totalString.append(' ');
			}
			else if( c == '\r')
			{
				totalString.append(' ');
			}
		}
		fr.close();
		
		String s = new String(totalString);
		StringTokenizer st1 = new StringTokenizer(s," ");
		System.out.println(s);

		i=0;
		while(st1.hasMoreTokens())
		{
			colList = new ArrayList<Integer>();
			for(count=0; count<i+1; count++)
			{
				colList.add(Integer.parseInt(st1.nextToken()));
			}
			rowList.add(colList);
			i++;
		}
		System.out.println(rowList);
		
		for(i=13;i>=0;i--)
		{
			for(j=0; j<i+1; j++)
			{
				int leftSum, rightSum;
				leftSum = rowList.get(i).get(j) + rowList.get(i+1).get(j);
				rightSum = rowList.get(i).get(j) + rowList.get(i+1).get(j+1);
				if(leftSum >= rightSum)
				{
					rowList.get(i).set(j, leftSum);
				}
				else
				{
					rowList.get(i).set(j, rightSum);
				}
			}
		}
		System.out.println(rowList);
	}
}
