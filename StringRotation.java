package Chapter1;
import java.util.Arrays;
public class StringRotation {

	public static void main(String[] args) 
	{
		String st="asdasdiii";
		isSubstring(st,"");
		
		
	}
	static void isSubstring(String str1,String str2)
	{
		int count=0;
		if(sortcheck(str1).equals(sortcheck(str2))==false)
				{
					System.out.println("Not equal");
				}
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Not equal");
		}
		for(int i=0;i<str1.length();i++)
		{
			String st=str2.substring(i, str2.length())+str2.substring(0, i);
			
			if(str1.equals(st))
			{
				System.out.println("Yes");
				break;
			}
			else
			{
				count++;
			}
		}
		if(count==str1.length()-1)
		{
			System.out.println("Not equal");
		}
	}
	static String sortcheck(String str1)
	{
		char st1[]=new char[str1.length()];
		st1=str1.toCharArray();
		String s2=new String(st1);
		return s2;
		
	}
}
