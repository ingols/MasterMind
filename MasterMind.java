import java.util.*;
import java.io.*;

public class MasterMind
{   
    
    private int i;
    private int fourDigits[] = new int[4]; 
    private int guessedDigits[] = new int[4];
    
    //public static void secretDigits(int f[])
    public void secretDigits(int f[])
    {
	   Random r = new Random();
       
	   for (int i = 0; i < 4; i++) 
	   {
	       //Generate random number between 0 - 9
	       f[i] = Math.abs(r.nextInt()) % 10;
            
	       for (int j = 0; j < i; j++)
		   //Check that the last digit not has been selected before
		   if (f[i] == f[j])
		   {
			   i--;
			   break;
		   }
       }
        for (int k = 0;k<4;k++)
	       System.out.print(f[k] + " ");
        //System.out.println();
    }
    
    
    /*
    public MasterMind(int f[])
    {
       	Random r = new Random();
       
	for (int i = 0; i < 4; i++) 
	{
	    //Generate random number between 0 - 9
	    f[i] = Math.abs(r.nextInt()) % 10;
            
	    for (int j = 0; j < i; j++)
		//Check that the last digit not has been selected before
		if (f[i] == f[j])
		    {
			i--;
			break;
		    }
        }
        //for (int k = 0;k<4;k++)
	//    System.out.print(f[k] + " ");
        //System.out.println();
    }
    */

    //public static void guessDigits(int g[])
    public void guessDigits(int g[])
    {
       int i;
       char inputChar[] = new char[5];
       Scanner input = new Scanner(System.in);
       String s = "";
	   do
	   {
	      System.out.print("Guess (4 digits in sequence): ");
          s = input.nextLine();
          for (int j = 0; j < 4; j++)
		     inputChar[j] = s.charAt(j);
                        
	      for (i = 0; i < 4; i++)
	      {
		     g[i] = inputChar[i] - '0';
		     //Check that only figures have been input
		     if (g[i] < 0 ||  g[i] > 9)
		     {
		       System.out.println("Wrong input");
		       break;
		     }
	      }
	   } while (i < 4);
    }

    //public static boolean controlOfDigits(int f[], int g[])
    public boolean controlOfDigits(int f[], int g[])
    {
	   int i;
       int r = 0;
	   char answer;
	   for (i = 0; i < 4; i++)
	   {
	      answer = '-';
	      //Check "Correct figure and correct place"
	      if (g[i] == f[i])
	      {
		     answer = 'R';
		     r++;
	      }
	      else
	      {
		     //Check  "Only correct figure"
		     for (int j = 0; j < 4; j++)
		       if (g[i] == f[j])
		       {
			      answer = 'S';
                  break;
		       }
	       }
	       System.out.print(answer);
	   }
	   System.out.println();
	   return (r != 4);
    }

    
    public MasterMind()
    {
	   //int i;
	   //int fourDigits[] = new int[4]; 
       //int guessDigits[] = new int[4];
       play();
       /*
	   secretDigits(fourDigits);
	   i = 0;
	   do
	   {
	      guessDigits(guessDigits);
	      i++;
	   } while (controlOfDigits(fourDigits, guessDigits));
	   System.out.println("Correct! " +  i + " try/tries");
       */
    }
    
    //public static void play()
    public void play()
    {
	   //int i;
	   //int fourDigits[] = new int[4]; 
       //int guessDigits[] = new int[4];
	   secretDigits(fourDigits);
	   i = 0;
	   do
	   {
	      guessDigits(guessedDigits);
	      i++;
	   } while (controlOfDigits(fourDigits, guessedDigits));
	   System.out.println("Correct! " +  i + " try/tries");
    }

    /*
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
	    char c;
	  do
	  {
	    MasterMind mastermind = new MasterMind();
            //play();
	    System.out.print("Once more? (Y/N): ");
        String s = scan.next();
	    c = s.charAt(0);

	  } while (c == 'y' || c == 'Y');
    }
    */
}