/*1 1 1 1 1
 *0 0 0 0
 *1 1 1
 *0 0
 *1
 */ 
package com.assignment;

public class Pattern11{

	public static void main(String[] args) {
		int n =5;
		for (int i =0;i<n;i++)
		{
			for (int j =0;j<n;j++)
			{
				if (i+j<=(n-1))
					if (i%2==0)
						System.out.print(1);
					else
						System.out.print(0);
			}
			System.out.println();
		}

	}

}