package Chapter1;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println(modifiedCompressed(str));

	}
	static void compressed(String str)
	{
		StringBuilder sb=new StringBuilder();
		int count=1;
		String st="";
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1) && i+1<=str.length()-1)
			{
				count++;
				if(i+1==str.length()-1)
				{
					System.out.println(str.charAt(i)+""+count);
					
				}
				
			}
		
			else
			{
				
				st=str.charAt(i)+""+count;
				System.out.print(st);
				count=1;
				if(i+1==str.length()-1)
				{
					System.out.print(str.charAt(i+1)+"1");
				
				}
			}
			
		}
	}
	static String modifiedCompressed(String str)
	{
		StringBuilder sb=new StringBuilder();
		int count=1;
		String st="";
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1) && i+1<=str.length()-1)
			{
				count++;
				if(i+1==str.length()-1)
				{
					sb.append(str.charAt(i));
					sb.append(count);
					
				}
				
			}
		
			else
			{
				sb.append(str.charAt(i));
				sb.append(count);
				
				count=1;
				if(i+1==str.length()-1)
				{
					sb.append(str.charAt(i+1));
					sb.append("1");
				
				}
			}
			
		}
		return sb.toString();
	}
	static String bookMethod(String str)
	{
		StringBuilder sb=new StringBuilder();
		int consecutive=0;
		for(int i=0;i<str.length();i++)
		{
			consecutive++;
			if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1))
			{
				sb.append(str.charAt(i));
				sb.append(consecutive);
			}
			consecutive=0;
		}
		return str;
	}
}
