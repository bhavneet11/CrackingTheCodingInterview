package Chapter1;
import java.util.Scanner;
public class UniqueString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		if(isUniqueString(str))
		{
			System.out.println("The string is unique");
		}
		else
		{
			System.out.println("Not unique");
		}

	}
	public static boolean isUniqueString(String str)
	{
		boolean arr[]=new boolean [128];
		for(int i=0;i<str.length();i++)
		{
			int val=(int)str.charAt(i);
			if(arr[val])
			{
				return false;
			}
			arr[val]=true;
		}
		return true;
	}
}
