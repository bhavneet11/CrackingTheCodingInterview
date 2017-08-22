package Chapter1;

import java.util.Scanner;

public class ZeroMatrix {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		System.out.println("Enter the elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		display(arr);
		System.out.println("New matrix");
		//zero(arr);
		secondzero(arr);
		display(arr);
	}
	static void display(int arr[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	static void zero(int arr[][])
	{
		boolean row[]=new boolean[arr.length];
		boolean column[]=new boolean[arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==0)
				{
					row[i]=true;
					column[j]=true;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(row[i])
			{
				nullifyrow(arr,i);
			}
		}
		for(int j=0;j<arr[0].length;j++)
		{
			if(column[j])
			{
				nullifycolumn(arr,j);
			}
		}
	}
	static void nullifyrow(int arr[][],int row)
	{
		for(int i=0;i<arr[0].length;i++)
		{
			arr[row][i]=0;
		}
	}
	static void nullifycolumn(int arr[][],int col)
	{
		for(int j=0;j<arr.length;j++)
		{
			arr[j][col]=0;
		}
	}
	static void secondzero(int arr[][])
	{
		boolean colzero=false;
		boolean rowzero=false;
		for(int j=0;j<arr[0].length;j++)
		{
			if(arr[0][j]==0)
			{
				rowzero=true;
				break;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[0][i]==0)
			{
				colzero=true;
				break;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==0)
				{
					arr[0][j]=0;
					arr[i][0]=0;
				}
			}
		}
		for(int i=0;i<arr[0].length;i++)
		{
			if(arr[0][i]==0)
			{
				nullifycolumn(arr,i);
			}
		}
		for(int j=0;j<arr[0].length;j++)
		{
			if(arr[0][j]==0)
			{
				nullifyrow(arr,j);
			}
		}
		if(colzero)nullifycolumn(arr,0);
		if(rowzero)nullifyrow(arr,0);
	}
}
