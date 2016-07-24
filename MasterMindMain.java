
import java.util.*;

public class MasterMindMain
{
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
}
