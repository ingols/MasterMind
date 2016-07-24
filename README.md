# MasterMind
MasterMind remote repository


This is the game Master Mind in a simplified  textual version.  
1) Implement a method  static void secretDigits(int f[]) that create a “secret” four-digit integer, f[], with all digits different, that is between 1023 and 9876.

Use 
    Random r = new Random();
and generate random numbers between 0 and 9 with
    Math.abs(r.nextInt()) % 10;
            
2) The player (user of the program) shall guess this four-digit number by getting the following help from the program:
- every digit with correct value and correct place is notated with a C(orrect). 
- every digit with correct value but on wrong place is notated with a D(igit).

Example: 
Generated “secret” number: 	3 6 1 4
Player is answered:				5 3 1 8
Help from the program:			- D C -

Implement a method static void guessDigits(int g[]) for the guessed number g[]
Hints for this method are given separate!

3) Implement a method  static boolean controlOfDigits(int f[], int g[]) that handles the player’s guess and print out helpmessages according to the rules in 2).
4) The method static void play() is a proposal to a method that handles the guessing in the game.
    public static void play()
    {
        int i;
        int fourDigits[] = new int[4]; 
        int guessDigits[] = new int[4];
        secretDigits(fourDigits);
        i = 0;
        do
        {
            guessDigits(guessDigits);
            i++;
        } while (controlOfDigits(fourDigits, guessDigits));
        System.out.println("Correct! " +  i + " try/tries");
    }

5) This is a proposal to a main() method that starts the game  and is an interface to the player, play()

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char c;
        do
        {
            play();
            System.out.print("Once more? (Y/N): ");
            String s = scan.next();
            c = s.charAt(0);
        } while (c == 'y' || c == 'Y');
    }

Implement  an object-oriented class version MasterMind of the earlier prepared example of the MasterMind game.
Implement  the datastructure in the earlier code as private datamembers in the class MasterMind. Implement  a default constructor MasterMind()  to call the same code as in earlier method play().
Change the classification for the other static methods to class member methods.
Use the below proposal as a main() method.

public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    char c;
    do
    {
        MasterMind mastermind = new MasterMind();
        System.out.print("Once more? (Y/N): ");
        String s = scan.next();
        c = s.charAt(0);
    } while (c == 'y' || c == 'Y');
 }

