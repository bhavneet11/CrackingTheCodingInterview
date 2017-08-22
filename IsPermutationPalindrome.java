package Chapter1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsPermutationPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		if(canPermutePalindrome(str))
		{
			System.out.println("Is palindrom permutation");
		}
		
		else
		{
			System.out.println("Not a palindrom permutation");
		}
	}
	static boolean isPP(String str)
	{
		int count=0;
		int []table=new int[128];
		for(int i=0;i<str.length();i++)
		{
			table[str.charAt(i)]++;
		}
		for(int k=0;k<table.length && count<=1;k++)
		{
			if(table[k]%2==1)
			{
				count++;
			}
		}
		return count<=1;
	}
	static boolean adddeductcount(String str)
	{
		int count=0;
		int []table=new int[128];
		for(int i=0;i<str.length();i++)
		{
			table[str.charAt(i)]++;
			if(table[str.charAt(i)]%2==0)
			{
				count--;
			}
			else
			{
				count++;
			}
			
		}
		return count<=1;
		
	}
	static boolean usinghashmap(String str)
	{
		int count=0;
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i), 0)+1);
		}
		for(char c:hm.keySet())
		{
			if(hm.get(c)%2!=0)
			{
				count++;
			}
		}
		
		return count<=1;
	}
	
	   static boolean canPermutePalindrome(String s) {
	        HashSet < Character > set = new HashSet < > ();
	        for (int i = 0; i < s.length(); i++) {
	            if (!set.add(s.charAt(i)))
	                set.remove(s.charAt(i));
	        }
	        return set.size() <= 1;
	    }
	}

