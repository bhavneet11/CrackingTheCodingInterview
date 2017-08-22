package Chapter1;

import java.util.Scanner;

public class isPermutation {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1=sc.nextLine();
		System.out.println("Enter the Second string");
		String str2=sc.nextLine();
		
		if(isPermutaionString(str1,str2))
		{
			System.out.println("Str1 is permutation of second");
		}
		else
		{
			System.out.println("Not permutation");
		}
	}
	public static boolean isPermutaionString(String str1,String str2)
	{
		
		
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		return sort(str1).equals(sort(str2));
	}
	public static String sort(String s)
	{
		char[]c1=s.toCharArray();
		java.util.Arrays.sort(c1);
		//String s1=new String(c1);//the way to create string from a char array//toString is a different thing
		//return s1;
		//or
		return new String(c1);
	}
	 boolean isPermutationNoSort(String str1,String str2)
	 {
		 if(str1.length()!=str2.length())
			 return false;
		 
		 int letter[]=new int[128];
		 char []c=str1.toCharArray();
		for(char s:c)
		{
			letter[s]++;
			System.out.print(letter[s]);
			
		} 
		for(int i=0;i<str2.length();i++)
		{
			int s=(int)str2.charAt(i);
			letter[s]--;
			if(letter[s]<0)
			{
				return false;
			}
			
		}
		 return true;
	 }
}
