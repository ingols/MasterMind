//Menu.java
import java.util.*;

 
class ShowRules
 
{
    
  public ShowRules()
    
  {
       
    System.out.println("ShowRules not implemented");
    
  }
 
}

 
class StartGame
 
{
    
    public StartGame()
    
    {
       
      System.out.println("StartGame not implemented");
    
    }
 
}

 
class ShowResult
 
{
    
    public ShowResult()
    
    {
      
      System.out.println("ShowResult not implemented");
    
    }
 
}

public class Menu 
 
{
    
    public static void main(String[] args) throws Exception 
    
    {
       
      Scanner scan = new Scanner(System.in);
       
      int menu = 0;
       
      boolean quit = false;
       
       
      do 
       
      {
	    
        menu();        
	    
        System.out.println();
          
        System.out.print("Please enter your choice: ");
         
        menu = scan.nextInt();
          
        System.out.println();
          
        switch(menu) 
          
        {
             
          case 1:

            ShowRules showRules = new ShowRules();
                
            break;
	           
          case 2:
                
            StartGame startGame = new StartGame();
                
            break;
	           
          case 3:
                
            ShowResult showResult = new ShowResult();
                
            break;
             
             
          case 9:
                
            quit = true;
                
            break;
             
          default:
                
            System.out.println("Invalid Entry!");
          
        }

      }
       
      while (!quit);
    
    }


    
    public static void menu()
    
    {
         
         System.out.println();
	       
         System.out.println("Menu");
         
         System.out.println();
	       
         System.out.println("1. Show rules");
	       
         System.out.println("2. Start game");
	       
         System.out.println("3. Show result");
	       
         System.out.println("9. Exit");
	       
         System.out.println();
     
    } 
}