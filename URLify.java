package Chapter1;

import java.util.Scanner;

public class URLify {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println(url(str));
		char[]str1=str.toCharArray();
		urlBook(str1,15);
	}
	public static String url(String str)
	{
		String add="%20";
		for(int i=0;i<str.length();i++)
		{
			if((int)str.charAt(i)==32)
			{
				str=str.substring(0, i).trim()+add+str.substring(i,str.length()).trim();
			}
		}
		return new String(str);
	}
	public static void 	urlBook(char[]str,int truelength)
	{
		int spacecount=0;
		int i=0;
		for(i=0;i<str.length;i++)
		{
			if(str[i]==' ')
			{
				spacecount++;
			}
		}
		int newlength=truelength-1+2*spacecount;
		if(truelength<str.length)
			str[truelength]='\0';
		
		for(i=truelength-1;i>=0;i--)
		{
			if(str[i]==' ')
			{
				str[newlength-1]='0';
				str[newlength-2]='2';
				str[newlength-3]='%';
				newlength=newlength-3;
			}
			else
			{
				str[newlength]=str[i];
				newlength--;
			}
			if(newlength==0)
			{
				break;
			}
		}
		
	}
}
