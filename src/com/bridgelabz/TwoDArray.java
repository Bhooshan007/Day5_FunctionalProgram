package com.bridgelabz;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TwoDArray 
{
	public static void main(String[] args) 
	{
		int row = 3;
		int column = 3;
		int [][] array = new int [row][column];
		
		OutputStreamWriter output = new OutputStreamWriter(System.out);
		PrintWriter printwriter = new PrintWriter(output);
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				printwriter.print(array[i][j]);
			}
		}
		
	}
	

}
