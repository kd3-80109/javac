package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in);
				BufferedWriter bwr = new BufferedWriter(new FileWriter("Output.txt"))) 
		{
			for (int i = 1; i <= 4; i++) 
			
			{
				String line = sc.nextLine();
				bwr. write(line);
				bwr.newLine();
			}
		System.out.println("Lines have been written to the file Succesfully. ");

	}catch (IOException e) 
	{
		System.out.println("Error : "+e.getMessage());
	}

}
}

