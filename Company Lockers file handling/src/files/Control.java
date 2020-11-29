package files;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;


public class Control
{Scanner in=new Scanner(System.in);

public static void create()//Add a file to the existing directory list
 {  
   Scanner ind = new Scanner(System.in);
   File folder = new File("D:\\files");
    String fileNameFromUser;
    System.out.println("Enter the desired file name (without extension):\n");
    fileNameFromUser = ind.nextLine(); //variable name to store the file name 
    fileNameFromUser= fileNameFromUser.toLowerCase();//remove case sensitiviy
    try 
	  {
		File theFile = new File(folder, fileNameFromUser + ".txt");
		   /*If file gets created then the  method would return true or if the file is already present it would return false */
		  boolean flag = theFile.createNewFile();
		         if (flag)
		         {
		          System.out.println("File has been created successfully at the specified location");
		          }
		      else
	            {
		        System.out.println("File already present at the specified location");
		        }
		}
		    catch(IOException e)
	         {
		      System.out.println("Exception Occurred:");
		      e.printStackTrace();
		     }
	}		
	
	
	public static void Delete() //Delete a user specified file from the existing directory list
	{ String Sh;
	Scanner in=new Scanner(System.in);
		System.out.println("enter the name of file:");
		Sh=in.nextLine();
		File myObj = new File("D:\\files\\"+Sh+".txt"); 
	 if (myObj.delete())
	   { 
	      System.out.println("Deleted the file: " + myObj.getName());
	   } 
	    else
	    {
	      System.out.println("File not found:");
	    } 
	  } 
	
	
	public static void SortFileName() // returns current file names in ascending order.
	{	    	
	    	File dir = new File("D:\\files");//root directory
	        File[] files = dir.listFiles();
	        Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

	        for (File file : files) 
	        {
	           if (!file.isHidden())
	              {
	              if (file.isDirectory()) 
	               {
	                 System.out.println("DIR \t" + file.getName());
	               }
                  else 
	               {
	                 System.out.println("FILE\t" + file.getName());
	               }
	              }
	        }
	    
	  }
	public static int navigate()
	{ Scanner in=new Scanner(System.in);
		
		int a=0;
		boolean loop = true;
		
	    while (loop)//loop until user enters valid choice
         {
	       System.out.println("1.Continue\n2.Main menu:\nEnter your Choice(1/2):");
	       	       
	       if (!in.hasNextInt() || !in.hasNext()) 
	       {

	    	   System.out.println("Invalid input: ");
	    	   in.nextLine();
	       } 
	       else 
	       {
	    	   a = in.nextInt();
	    	   if (a <= 4 && a >= 1)
	    	   { 
	    		   loop = false;
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Invalid input: ");
	    		   in.nextLine();
	    	   }

	       }
         }

return a;

	}
	public static void Search() 
	{
		String Sh;
		
	
	Scanner in=new Scanner(System.in);
	System.out.println("enter the name of file:(without extension)");
	Sh=in.nextLine();
	File myObj = new File("D:\\files\\"+Sh+".txt"); 
	
	    if (myObj.exists()) 
	    {
	      System.out.println("File name: " + myObj.getName());
	      System.out.println("Absolute path: " + myObj.getAbsolutePath());
	      System.out.println("Writeable: " + myObj.canWrite());
	      System.out.println("Readable " + myObj.canRead());
	      System.out.println("File size in bytes " + myObj.length());
	    } 
	      else
	      {
	      System.out.println("The file does not exist.");
	      }
	}
	  public static void exit()
	  {
			System.out.print("Thank You");
			System.exit(0);
	  }
public static void main(String[] args) 
{
	int i=1;
	int Choice=1;
	int cont=1;
	int cont2=1;
	int Choice2;
	int a=0;
	boolean loop = true;
	try (Scanner in = new Scanner(System.in))
	{
		while(cont==1)   //user interface for main menu
		{loop = true;
		 while (loop)//loop until user enters valid choice
          {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("-----------<Developed by Prabhath kelkar for Company Lockers Pvt. Ltd>-----------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("-----------------------------Lockedme.com----------------------------------------");
			System.out.println("-----------------------------Main Menu-------------------------------------------");
			System.out.println("1.Sort FileName:\n2.File operations:\n3:exit ");
			System.out.println("Enter your Choice(1/2/3):");
	       if (!in.hasNextInt() || !in.hasNext()) 
	       {

	    	   System.out.println("Invalid input: ");
	    	   in.nextLine();
	       } 
	       else 
	       {
	    	   a = in.nextInt();
	    	   if (a <= 3 && a >= 1)
	    	   { 
	    		   loop = false;
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Invalid input: ");
	    		   in.nextLine();
	    	   }

	       }
        }
		Choice=a;//user choice for switch case
		switch (Choice)
			{
			case 1:
			{i=1;
			System.out.println("List of Files: ");
				SortFileName(); 
				break;
			}
			case 2:
			{
				do //while cont2
				{  
				a=0;
				loop=true;
			
			    while (loop)//loop until user enters valid choice
		         {
			       System.out.println("1.Create new file:\n2.Delete a file:\n3.Search the file:\n4:Main Menu:");
			       System.out.println("Enter your Choice(1/2/3/4):");
			       if (!in.hasNextInt() || !in.hasNext()) 
			       {

			    	   System.out.println("Invalid input: ");
			    	   in.nextLine();
			       } 
			       else 
			       {
			    	   a = in.nextInt();
			    	   if (a <= 4 && a >= 1)
			    	   { 
			    		   loop = false;
			    	   }
			    	   else
			    	   {
			    		   System.out.println("Invalid input: ");
			    		   in.nextLine();
			    	   }

			       }
		         }
			    Choice2=a;
			    switch (Choice2)
			    {
			
			    	case 1:
			    	{
			    		create();
			    		cont2=navigate();	
			    		break;
			    	}
			    	case 2:
			    	{
			    		Delete();
			    		cont2=navigate();
			    		break;
			    	}
			    	case 3:
			    	{
				
			    		Search();
			    		cont2=navigate();;	
			    		break;
			    	}
			    	case 4:
			    	{  
			    		cont2=2;
			    		 i=0;
			    		break;
			
			    	}
			    	default:
			    	{
			    			System.out.println("Invalid input");
			    			cont2=navigate();
			    			break;
			    	}
			
			    }//end of switch choice2
            		


				}
				while(cont2==1);//end of do while cont2
			    i=0;
			    cont=1;
				break;
			
			}//end of case 2
			case 3:
			{
				exit();
				break;
			}
		
			default:
			{
				i=0;
				System.out.println("Invalid input");
				cont=1;
				break;
			}
			
			}//end of switch choice
		 if (i==1)
           {

			 
			  a=0;
				 loop = true;
				
			    while (loop)//loop until user enters valid choice
		         {
			    	System.out.println("1.Main Menu\n2.Exit:\nEnter your Choice(1/2):");
			       if (!in.hasNextInt() || !in.hasNext()) 
			       {

			    	   System.out.println("Invalid input: ");
			    	   in.nextLine();
			       } 
			       else 
			       {
			    	   a = in.nextInt();
			    	   if (a <= 2 && a >= 1)
			    	   { 
			    		   loop = false;
			    	   }
			    	   else
			    	   {
			    		   System.out.println("Invalid input: ");
			    		   in.nextLine();
			    	   }

			       }
		         }

               cont=a;			
			
            }
		}
		exit();
		
	
	}
	
}
}
