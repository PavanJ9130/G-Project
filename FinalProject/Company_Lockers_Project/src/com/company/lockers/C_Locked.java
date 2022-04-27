package com.company.lockers;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class C_Locked
{
	static final String projectPath="F:\\Project\\FinalProject\\Company_Lockers_Project\\Company";

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int ch;
		
		do
		{
			
		
			displayMenu();
			System.out.println("");
			System.out.println("Enter Your Choice:");
			ch=obj.nextInt();
			
			switch(ch)
			{
			case 1:getAllFiles();
				break;
			case 2:createFiles();
				break;
			case 3:deleteFiles();
				break;
			case 4:searchFiles();
				break;
			case 5:System.exit(0);
				break;
			default:System.out.println("Invalid Choice");
				break;
			
		}
		
	  }
		while(ch>0);

	}
	
	public static void displayMenu()
	{
		System.out.println("");
		System.out.println("*******************************************************");
		System.out.println("\tWelcome to Company Lockers-CLocked.com");
		System.out.println("\tDeveloper Name:-Pavan Nareshrao Jugnake.");
		System.out.println("*******************************************************");
		System.out.println("1.Display all the files");
		System.out.println("2.Add files to existing directory");
		System.out.println("3.Delete a file");
		System.out.println("4.Search a file");
		System.out.println("5.Exit");
		
	}
	
	public static void getAllFiles()
	{
		File[] listOfFiles =new File(projectPath).listFiles();
		if(listOfFiles.length==0)
			System.out.println("Files not Exits is Directory");
		else
		{
			for(var l:listOfFiles)
			{
				System.out.println(l.getName());
				
			}
		}
	}		
		public static void createFiles()
	{
		try
		{
			Scanner obj=new Scanner(System.in);
			String fileName;
			int linesCount;
			
			System.out.println("Enter File Name:");
			fileName=obj.nextLine();
			
			System.out.println("Enter how many lines you want to Create:");
			linesCount=Integer.parseInt(obj.nextLine());
			
			FileWriter fw=new FileWriter(projectPath+"\\"+fileName);
			
			for(int i=1;i<=linesCount;i++)
			{
				System.out.println("Enter file content :");
				fw.write(obj.nextLine()+"\n");
			}
			
			System.out.println("File Created Successfully");
			fw.close();
			
			
		}
		catch(Exception ex)
		{
			System.out.println("Error");
		}
	}
	
	public static void deleteFiles()
	{
		Scanner obj=new Scanner(System.in);
		try
		{
			String fileName;
			System.out.println("Which file you want to delete:");
			fileName=obj.nextLine();
			
			File fl=new File(projectPath+"\\"+fileName);
			
			if(fl.exists())
			{
				fl.delete();
				System.out.println("File deleted Successfully");
			}
			else
			{
				System.out.println("File Does not Exist");
			}
			
		}
		catch(Exception Ex)
		{
			System.out.println("Some error occured");
		}
	}
	
	public static void searchFiles()
	{
		Scanner obj=new Scanner(System.in);
		try
		{
			String fileName;
			System.out.println("Enter file Name to be Searched:");
			fileName=obj.nextLine();
			
			File fl=new File(projectPath+"\\"+fileName);
			
			if(fl.exists())
			{
				
				System.out.println("File is available");
			}
			else
			{
				System.out.println("File is not available");
			}
			
		}
		catch(Exception Ex)
		{
			System.out.println("Some error occured");
		}
	}
	
	
}
