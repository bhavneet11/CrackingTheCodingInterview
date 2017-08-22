package Chapter1;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) 
	{
		int arr[][]=new int[3][3];
		System.out.println("Enter the elements");
		initializematrix(arr,3);
		display(arr,3);
		rotate(arr);
		System.out.println();
		display(arr,3);       
		 
		
		
		

	}
	static void rotate(int arr[][])
	{
		if(arr.length==0||arr.length!=arr[0].length)
		{
			System.out.println("Not a nxn matrix");
		}
			
		int n=arr.length;
		for(int i=0;i<n/2;i++)
		{
			for(int j=i;j<n-i-1;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[n-1-j][i];
				arr[n-1-j][i]=arr[n-i-1][n-1-j];
				arr[n-i-1][n-1-j]=arr[j][n-1-i];
				arr[j][n-1-i]=temp;//rotate to right...can be asked to rotate left too
				
			}
		}
		
		
	}
	static void initializematrix(int arr[][],int n)
	{

		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
			System.out.print("\n");
		}
		
		
	}
	static void display(int arr[][],int n)
	{
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
			{
				
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
}
