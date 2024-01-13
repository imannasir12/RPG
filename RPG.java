//Name:Iman Nasir
//Date:December 17,2020
//Purpose:RPG Assignment
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import java.util.*;
import java.text.*;

public class RPG
{

    Date now, end;
    public static void main (String args[])
    {
	new RPG ();
    }


    //Task 1 file variables
    char filea = 'A';
    char fileb = 'B';
    char filec = 'C';
    char filed = 'D';
    char filee = 'E';
    char filef = 'F';
    char fileg = 'G';
    char fileh = 'H';
    char filei = 'I';
    char filej = 'J';
    char filek = 'K';
    char filel = 'L';
    char filem = 'M';
    char filen = 'N';
    char fileo = 'O';
    char filep = 'P';
    char fileq = 'Q';
    char filer = 'R';
    char files = 'S';
    char filet = 'T';
    char fileu = 'U';
    char filev = 'V';
    char filew = 'W';
    char filex = 'X';


    //Task 3 peg variables
    char one = 'A';
    char two = 'B';
    char three = '_';
    char four = 'C';
    char five = 'D';
    char n = 'n';

    //Task 5 tictactoe variables
    char a = ' ';
    char b = ' ';
    char c = ' ';
    char d = ' ';
    char e = ' ';
    char f = ' ';
    char g = ' ';
    char h = ' ';
    char i = ' ';
    char j = ' ';
    char k = ' ';
    char l = ' ';
    char m = ' ';
    char n1 = ' ';
    char o = ' ';
    char p = ' ';
    char q = ' ';
    char r = ' ';
    char s = ' ';
    char t = ' ';
    char u = ' ';
    char v = ' ';
    char w = ' ';
    char x1 = ' ';
    char y1 = ' ';
    char turn = 'X';

    //play again variable
    char again = 'y';

    public RPG ()
    {
	//the game runs while the user wants to play
	while (again != 'n')
	{
	    introduction ();
	    again = IO.inputChar ("\nThank you for playing Murder Mystery. Would you like to play again? (y/n) > ");
	}
    }


    //creats dialog box picture
    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = RPG.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }


    //Adding pauses to the game
    public void pause ()
    {
	System.out.println ("");
	char c = IO.inputChar ("<press any key to continue> ");
	System.out.println ("");
    }


    //introduces the game title and details
    public void introduction ()
    {
	//creates dialog box with picture
	JOptionPane.showMessageDialog (null, createImageIcon ("bottle.jpg"), "Murder Mystery", JOptionPane.INFORMATION_MESSAGE);
	IO.printSlow ("\n            \u00B0************ YOU'RE PLAYING ************\u00B0\n");
	System.out.println ("           ##     ## ##     ## ########  ########  ######## ########  ");
	System.out.println ("           ###   ### ##     ## ##     ## ##     ## ##       ##     ## ");
	System.out.println ("           #### #### ##     ## ##     ## ##     ## ##       ##     ## ");
	System.out.println ("           ## ### ## ##     ## ########  ##     ## ######   ########  ");
	System.out.println ("           ##     ## ##     ## ##   ##   ##     ## ##       ##   ##   ");
	System.out.println ("           ##     ## ##     ## ##    ##  ##     ## ##       ##    ##  ");
	System.out.println ("           ##     ##  #######  ##     ## ########  ######## ##     ## \n");
	System.out.println ("\n                               ##     ## ##    ##  ######  ######## ######## ########  ##    ## ");
	System.out.println ("                               ###   ###  ##  ##  ##    ##    ##    ##       ##     ##  ##  ##  ");
	System.out.println ("                               #### ####   ####   ##          ##    ##       ##     ##   ####   ");
	System.out.println ("                               ## ### ##    ##     ######     ##    ######   ########     ##    ");
	System.out.println ("                               ##     ##    ##          ##    ##    ##       ##   ##      ##    ");
	System.out.println ("                               ##     ##    ##    ##    ##    ##    ##       ##    ##     ##    ");
	System.out.println ("                               ##     ##    ##     ######     ##    ######## ##     ##    ##    \n");
	System.out.println ("Murder Mystery is an intriguing escape room developed by Iman Nasir, in collaboration with Toronto Comicon.");
	System.out.println ("This game is like no game you've ever played before... your abilities will be put to test and you'll be tested");
	System.out.println ("as you've never been before. People will be depending on you, so you must make sure you succeed.\n");
	System.out.println ("Are you up for the challenge? ");
	System.out.println ("\nType in (b), to begin");
	System.out.println ("Type in (q), to quit\n");
	//allows the user to decide if they wish to play
	char start = IO.inputChar ("Please choose an option (b/q) > ");
	if (start == 'b' || start == 'B')
	{
	    System.out.println ("\nNote: You'll be given multiple options throughout the game. If you don't choose one, a default one will be chosen for you.");
	    IO.printSlow ("\n\n     \u00B0****THE GAME HAS OFFICIALLY BEGUN!****\u00B0");
	    backstory ();
	}
	else
	    again = 'n';
    }


    //game backstory
    public void backstory ()
    {
	Vivian ();
	System.out.println ("There are 3 main suspects...\n");
	System.out.println ("1)Eric \n2)Mya\n3)Mr.Smtith");
	//allows user to navigate between suspects
	for (int i = 1 ; i <= 3 ; i++)
	{
	    int suspect = IO.inputInt ("\nWhich suspect would you like to see? (1/2/3) > ");
	    //swtich used to navigate between suspects
	    switch (suspect)
	    {
		case 1:
		    Eric ();
		    break;
		case 2:
		    Mya ();
		    break;
		case 3:
		    MrSmith ();
		    break;
	    }
	}
	pause ();
	phoneCall ();
	System.out.println ("\nAnonymous> \"Hello, I have a very special task for you. This is about the murder of Vivian Darkbloom. An inside source has ");
	System.out.println ("asked me to contact you to deliver some important information. Before Vivian's murder, she suspected someone was trying to hurt");
	System.out.println ("her and so she decided to leave a letter to her parents and the police in case something happened to her. The letter is located ");
	System.out.println ("in a secret safe in her closet. To unlock the safe, you must complete a series of tasks that she has left for you. Every time you  ");
	System.out.println ("complete a task, you will be given a number. Once you find all the numbers you will be able to unlock the safe. You must start now ");
	System.out.println ("because there isn't much time. Are you willing to help solve the case of Vivian's murder?\"");
	System.out.println ("\nYou think for a few seconds and consider what this man is asking of you. After careful consideration, you decide that you are going to ");
	System.out.println ("help out in any way possible.");
	System.out.println ("\nYou> \"Yes I am willing to help...but I can't promise I'll succeed\"");
	System.out.println ("Anonymous> \"Very well. Thank you for your help. You must start by looking at Vivian's computer. Get started right away... you don't ");
	System.out.println ("have much time. Remember, no one should suspect anything. Call me back once you're done.\"");
	task1 ();
    }


    //user gets a phone call
    public void phoneCall ()
    {
	System.out.println ("The police are still working on the case but don't have a lot of hope because they don't have many leads.\n");
	System.out.println ("              _.===========================._");
	System.out.println ("            .'`  .-  - __- - - -- --__--- -.  `'.");
	System.out.println ("        __ / ,'`     _|--|_________|--|_     `'. \\");
	System.out.println ("      /'--| ;    _.'\\ |  '         '  | /'._    ; |");
	System.out.println ("     //   | |_.-' .-'.'      ___      '.'-. '-._| |");
	System.out.println ("    (\\)   \\\"` _.-` /     .-'`_ `'-.     \\ `-._ `\"/");
	System.out.println ("    (\\)    `-'    |    .' .-'\" \"'-. '.    |    `-`");
	System.out.println ("   (\\)            |   / .'(3)(2)(1)'. \\   |");
	System.out.println ("   (\\)            |  / / (4) .-.     \\ \\  |");
	System.out.println ("   (\\)            |  | |(5) (   )'==,J |  |");
	System.out.println ("  (\\)             |  \\ \\ (6) '-' (0) / /  |");
	System.out.println (" (\\)              |   \\ '.(7)(8)(9).' /   |");
	System.out.println (" (\\)           ___|    '. '-.._..-' .'    |");
	System.out.println (" (\\)          /.--|      '-._____.-'      |");
	System.out.println ("  (\\)        (\\)  |\\_  _  __   _   __  __/|");
	System.out.println (" (\\)        (\\)   |                       |");
	System.out.println ("(\\)_._._.__(\\)    |                       |");
	System.out.println (" (\\\\\\\\   \\\\\\)      '.___________________.'");
	System.out.println ("  '-'-'-'--'");
	System.out.println ("");
	char phoneCall = IO.inputChar ("Oh wait... look at that...it looks like your getting a phone call. Would you like to pick up? (y/n)> ");
	if (phoneCall == 'n' || phoneCall == 'N')
	{
	    System.out.println ("\nIt seems urgent. You should atleast pick up and see who's calling");
	    phoneCall = IO.inputChar ("Would you like to pick up? (y)> ");
	}
	else
	    System.out.println ("\nAlright, let's see who it is.\n");
    }


    //information about Vivian
    public void Vivian ()
    {
	System.out.println ("\nLet's start by looking at some background information. This is Vivian Darkbloom:");
	System.out.println ("");
	System.out.println ("         ,{{}}}}}}.");
	System.out.println ("       {{{{{}}}}}}}.");
	System.out.println ("      {{{{  {{{{{}}}}");
	System.out.println ("     }}}}} _   _ {{{{{");
	System.out.println ("     }}}}  m   m  }}}}}");
	System.out.println ("    {{{{C    ^    {{{{{");
	System.out.println ("   }}}}}}\\  '='  /}}}}}}");
	System.out.println ("  {{{{{{{{;.___.;{{{{{{{{");
	System.out.println ("  }}}}}}}}})   (}}}}}}}}}}");
	System.out.println (" {{{{}}}}}':   :{{{{{{{{{{");
	System.out.println (" {{{}}}}}}  `@` {{{}}}}}}}");
	System.out.println ("  {{{{{{{{{    }}}}}}}}}");
	System.out.println ("    }}}}}}}}  {{{{{{{{{");
	System.out.println ("     {{{{{{{{  }}}}}}");
	System.out.println ("        }}}}}  {{{{");
	System.out.println ("         {{{    }}");
	pause ();
	System.out.println ("She was an 18-year-old-girl whose dead body was found last Friday, November 18th. Her parents had been out");
	System.out.println ("the entire night, and when they returned home they found her body and called the police right away.");
	System.out.println ("\nSince then, the police and private investigators have been working on the case and have been able to conclude");
	System.out.println ("that she was poisoned.");
    }


    //information about Eric
    public void Eric ()
    {

	System.out.println ("");
	System.out.println ("       ***         ");
	System.out.println ("     *******       ");
	System.out.println ("    *********      ");
	System.out.println (" /\\* ### ### */\\   ");
	System.out.println (" |    @ / @    |   ");
	System.out.println (" \\/\\    ^    /\\/   ");
	System.out.println ("    \\  ===  /     ");
	System.out.println ("     \\_____/        ");
	System.out.println ("      _|_|_         ");
	System.out.println ("   *$$$$$$$$$*      ");
	System.out.println ("\nEric is Vivian's ex-boyfriend. Vivian and Eric broke up last month and since then there had been many rumours");
	System.out.println ("that Eric was going to get revenge on her. Many students from Vivian's school have also claimed that Eric's ");
	System.out.println ("behaviour towards Vivian was very threatening after the breakup.");

    }


    //information about Mya
    public void Mya ()
    {
	System.out.println ("");
	System.out.println ("      ,)(8)).");
	System.out.println ("    (()))())()).");
	System.out.println ("   (()\"````\"::= )");
	System.out.println ("   )| _    _ ::= )");
	System.out.println ("  (()(o)/ (o) ?(/)");
	System.out.println ("   )(::c ::.( :(/)");
	System.out.println ("  (( \\ .__. ;,/(/)");
	System.out.println ("    ) `.___,'/ (/)");
	System.out.println ("       |    | (/)");
	System.out.println ("     _.'    ,\\(/)__");
	System.out.println (" _.-\"   ` u    (/) \".");
	System.out.println ("\nMya and Vivan have always been very competitive with one another. Last week, there was a debate competition at Vivian's school ");
	System.out.println ("in which Vivan placed 1st, and Mya placed 2nd. The two were seen arguing after the competition and a very hostile text");
	System.out.println ("message was also found on Mya's phone in which she claimed she would kill Vivian if she won the debate competition. ");
	System.out.println ("This message was sent one day before the debate, which was also one day before Vivian was murdered.");
    }


    //information about Mr.Smith
    public void MrSmith ()
    {
	System.out.println ("");
	System.out.println ("         / .-  ");
	System.out.println ("         |/,-'`");
	System.out.println ("      _.-'''-._");
	System.out.println ("   _.;.--._.--.;._ ");
	System.out.println (" .` /(  o/ \\o  )\\ `.");
	System.out.println ("   ;  '-'   '-'  ;");
	System.out.println ("   |     (_)     |");
	System.out.println ("   | .         . |");
	System.out.println ("   |  `-.___.-'  |");
	System.out.println ("   ;    | : |    ;");
	System.out.println ("    \\   | : |   /");
	System.out.println ("     '._| : |_.'");
	System.out.println ("        '._.'");
	System.out.println ("");
	System.out.println ("Mr.Smith is Vivian's creepy neighbour whose been caught looking into her bedroom multiple times. Vivian has also made many ");
	System.out.println ("complaints to the police about Mr. Smith but without any real evidence, the police were never able to do anything about it.");
	System.out.println ("Some people in Vivian's neighbourhood have claimed that Mr.Smith was roaming around Vivian's house the day she was murdered.");

    }


    //story leading up to task 1
    public void task1 ()
    {
	System.out.println ("\nHe gives you his number and the address and hangs up right after. You sit there for a few minutes trying to decide what to do next. ");
	pause ();
	System.out.println ("If you're caught, you could get in a lot of trouble. If you do nothing, Vivian's killer may never be found.");
	System.out.println ("\nYou think for a few minutes and decide too...\n");
	System.out.println ("1)Walk over to her house");
	System.out.println ("2)Eat a snack first to calm yourself down");
	int a = IO.inputInt ("\nWhat would you like to do? (1/2) > ");
	if (a == 2)
	    apple ();
	houses ();
	System.out.println ("Oh no...you never prepared for this. You mutter out the first excuse that comes into your head.");
	System.out.println ("You> \"Hello, I'm a friend of Vivian's. I came to return a book of hers. May I come inside?\"");
	System.out.println ("\nVivian's mother> \"Yes yes of course. A friend of Vivian's is always welcome.\"");
	System.out.println ("\nYou walk inside and she leads you to a sofa where you both sit down.\n");
	System.out.println ("              ___.--------'``````:``````'--------.___");
	System.out.println ("             (   |               :               |   )");
	System.out.println ("              \\ ,;,,,            :               |  /");
	System.out.println ("               |\\%%%%\\___________:__________/~~~~~/|");
	System.out.println ("              / ,\\%%%%\\          |         / @*@ /, \\");
	System.out.println ("             /_ / `````          |         ~~~~~~ \\ _\\");
	System.out.println ("            (@l)                 |                 (@l)");
	System.out.println ("             ||__________________|__________________||");
	System.out.println ("             ||_____________________________________||");
	System.out.println ("            /_|_____________________________________|_\\");
	pause ();
	System.out.println ("Vivian's mother> \"It's so good to see you here. It's just... it's been so hard after...\"");
	System.out.println ("\nShe starts to cry and you look around uncomfortably. You want to console her but you also want to get to Vivian's computer");
	System.out.println ("in time. You decide too...\n");
	System.out.println ("1)Console her");
	System.out.println ("2)Ask to see Vivian's room");
	int b = IO.inputInt ("\nWhat would you like to do? (1/2) > ");
	if (b == 1)
	{
	    System.out.println ("\nYou> \"I'm very sorry for your loss Mrs.Darkbloom. Vivian was a very great friend of mine and it's very sad that she isn't with us anymore.");
	    System.out.println ("If it's okay with you, may I see Vivian's room please? I'd like to return her book.\"");
	}
	else
	{
	    System.out.println ("\nYou> \"Um...may I see Vivian's room please. I'd like to return her book.\"");
	    System.out.println ("She looks very hurt but she gives you the directions anyway.  ");
	}
	pause ();
	System.out.println ("Mrs.Darkbloom> \"Yes you may. Just head up the stairs. It's the first door on your right\".");
	System.out.println ("\nYou head up the stairs and enter her bedroom...\n");
	bed ();
	System.out.println ("You look around for a few seconds amazed at how huge her bedroom is. Then you remember that you only have a few minutes before Vivian's mother");
	System.out.println ("comes up. You head over to her computer table.\n");
	System.out.println ("\nYou sit down in the chair and turn on the computer. Right away, you see something pop up on the screen:\n");
	startTask1 ();
    }


    //prints out apple
    public void apple ()
    {
	System.out.println ("");
	System.out.println ("     ,--./,-.");
	System.out.println ("    / #      \\");
	System.out.println ("   |          |");
	System.out.println ("    \\        /    ");
	System.out.println ("     `._,._,'");
	System.out.println ("");
	System.out.println ("You spend a few minutes eating your apple and once you feel calm again you decide to walk over to her house.\n");
    }


    //Vivian's mother
    public void VivianMom ()
    {
	System.out.println ("\nAfter walking around in circles for a long time you're finally able to find her house. You lightly knock on the door hoping");
	System.out.println ("that no one's at home, but after a few seconds a young woman answers. ");
	System.out.println ("She looks a lot like Vivian and you realize that this is Vivian's mom. \n");
	System.out.println ("         ,{{}}}}}}.");
	System.out.println ("       {{{{{}}}}}}}.");
	System.out.println ("      {{{{  {{{{{}}}}");
	System.out.println ("     }}}}} _   _ {{{{{");
	System.out.println ("     }}}}  m   m  }}}}}");
	System.out.println ("    {{{{C    ^    {{{{{");
	System.out.println ("   }}}}}}\\  ---  /}}}}}}");
	System.out.println ("  {{{{{{{{;.___.;{{{{{{{{");
	System.out.println ("  }}}}}}}}})   (}}}}}}}}}}");
	System.out.println (" {{{{}}}}}':   :{{{{{{{{{{");
	System.out.println (" {{{}}}}}}  `@` {{{}}}}}}}");
	System.out.println ("  {{{{{{{{{    }}}}}}}}}");
	System.out.println ("    }}}}}}}}  {{{{{{{{{");
	System.out.println ("     {{{{{{{{  }}}}}}");
	System.out.println ("        }}}}}  {{{{ ");
	System.out.println ("         {{{    }}      ");
	System.out.println ("\nVivian's mothther> \"Hi, can I help you?\" ");
	pause ();
    }


    //Vivian's bedroom
    public void bed ()
    {
	System.out.println ("  o(=(=(=(=)=)=)=)o");
	System.out.println ("   !!!!!!}!{!!!!!!                                                ___ ");
	System.out.println ("   !!!!!} | {!!!!!                                               /   \\");
	System.out.println ("   !!!!}  |  {!!!!     _!_     ()              ()     _!_       | //  |");
	System.out.println ("   !!!'   |   '!!!    |~@~|    ||______________||    |~@~|      |     |");
	System.out.println ("   ~@~----+----~@~    |___|    |                |    |___|       \\___/");
	System.out.println ("   !!!    |    !!!      |      |      ~@@~      |      |       _________");
	System.out.println ("   !!!    |    !!!     ( )     |_______  _______|     ( )     |____-____|");
	System.out.println ("   !!!____|____!!!  __(___)__  {__~@~__}{__~@~__}  __(___)__  |____-____|");
	System.out.println ("   !!!=========!!!   |__-__|   %%%%%%%%%%%%%%%%%%   |__-__|   |____-____|");
	System.out.println ("  _!!!_________!!!___|_____|_ %%%%%%%%%%%%%%%%%%%% _|_____|___|____-____|_");
	System.out.println ("                     |     | %%%%%%%%%%%%%%%%%%%%%% |     |   |/       \\|");
	System.out.println ("                            %%%%%%%%%%%%%%%%%%%%%%%%");
	System.out.println ("                           %%%%%%%%%%%%%%%%%%%%%%%%%%");
	System.out.println ("                          %%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	System.out.println ("                         /!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\");
	System.out.println ("                         !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ");
	System.out.println ("                        !!!!!!!!!!!!!!!!!!!!!!!!!!lc!!");
	System.out.println ("                         `======~@~==========~@~======`");
	System.out.println ("                        `==============================`");
	System.out.println ("                       `====~@~==================~@~====`");
	System.out.println ("                      `==================================`");
	System.out.println ("                     `==~@~==========================~@~==`");
	System.out.println ("\n  ~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.<>.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~.:.~ ");
	pause ();
    }


    //houses
    public void houses ()
    {

	System.out.println ("             )                               (  ");
	System.out.println ("             (                                 )");
	System.out.println ("     ________[]_                              []");
	System.out.println ("    /^=^-^-^=^-^\\                   /^~^~^~^~^~^~\\");
	System.out.println ("   /^-^-^-^-^-^-^\\                 /^ ^ ^  ^ ^ ^ ^\\");
	System.out.println ("  /__^_^_^_^^_^_^_\\               /_^_^_^^_^_^_^_^_\\");
	System.out.println ("   |  .==.       |       ___       |        .--.  |");
	System.out.println (" ^^|  |LI|  [}{] |^^^^^ /___\\ ^^^^^|  [}{]  |[]|  |^^^^^");
	System.out.println (" &&|__|__|_______|&&   .\" | \".   88|________|__|__|888");
	System.out.println ("                 ====             (o_|_o)              ====");
	System.out.println ("                  ====             u   u              ==== \n");
	System.out.println ("             )                              (");
	System.out.println ("             (                                 )");
	System.out.println ("     ________[]_                              []");
	System.out.println ("    /^=^-^-^=^-^\\                   /^~^~^~^~^~^~\\");
	System.out.println ("   /^-^-^-^-^-^-^\\                 /^ ^ ^  ^ ^ ^ ^\\");
	System.out.println ("  /__^_^_^_^^_^_^_\\               /_^_^_^^_^_^_^_^_\\");
	System.out.println ("   |  .==.       |       ___       |        .--.  |");
	System.out.println (" ^^|  |LI|  [}{] |^^^^^ /___\\ ^^^^^|  [}{]  |[]|  |^^^^^");
	System.out.println (" &&|__|__|_______|&&   .\" | \".   88|________|__|__|888");
	System.out.println ("                 ====             (o_|_o)              ====");
	System.out.println ("                  ====             u   u              ====    ");
	pause ();
	VivianMom ();
    }


    //task1 starts here
    public void startTask1 ()
    {
	System.out.println ("\n  ######   #######  ########  ########  ##     ## ########  ########          ######## #### ##       ########  ######  ");
	System.out.println (" ##    ## ##     ## ##     ## ##     ## ##     ## ##     ##    ##             ##        ##  ##       ##       ##    ##    ");
	System.out.println (" ##       ##     ## ##     ## ##     ## ##     ## ##     ##    ##             ##        ##  ##       ##       ##       ");
	System.out.println (" ##       ##     ## ########  ########  ##     ## ########     ##             ######    ##  ##       ######    ######  ");
	System.out.println (" ##       ##     ## ##   ##   ##   ##   ##     ## ##           ##             ##        ##  ##       ##             ## ");
	System.out.println (" ##    ## ##     ## ##    ##  ##    ##  ##     ## ##           ##             ##        ##  ##       ##       ##    ## ");
	System.out.println ("  ######   #######  ##     ## ##     ##  #######  ##           ##             ##       #### ######## ########  ###### \n");
	pause ();
	//instructions to play the game are printed on a dialog box
	JOptionPane.showMessageDialog (null, "* * *C O R R U P T  F I L E  I N S T R U C T I O N S*  * * \n \n"
		+ "This is your first task. The rules are very simple. \n"
		+ "There are 24 files, some of them are corrupt. \n"
		+ "You must choose 5 non-corrupt files to unlock a number \n"
		+ "If you choose up to 3 corrupt files, you will have to start again. \n "
		+ "Every time you pick a corrupt file, a '-' will appear in its place. \n "
		+ "Every time you pick a non-corrupt file, a '+' will appear in its place. \n"
		+ "You may not pick the same file more than once... \n\n"
		+ "Good luck!", "Instructions", JOptionPane.INFORMATION_MESSAGE);
	laptopscreen ();
	System.out.println ("\nThe harder the level, the more corrupt files there will be. Choose a level below:\n");
	System.out.println ("(e)asy ~ 7 corrupt files");
	System.out.println ("(h)ard ~ 12 corrupt files");
	//user chooses level on dialog box
	String[] possibleValues = {"Easy", "Hard"};
	String selectedValue = (String) JOptionPane.showInputDialog (null,
		"Which level would you like to play?", "Input", JOptionPane.INFORMATION_MESSAGE, null,
		possibleValues, possibleValues [0]);
	if (selectedValue == "Hard")
	    level2 ();
	else
	    level1 ();

    }


    //easy level
    public void level1 ()
    {
	int corruptfiles = 0;
	int filepoints = 0;
	//while the user has less than five points, and has chosen less than 3 corrupt files
	while (filepoints < 5 && corruptfiles < 3)
	{
	    char choosefile = IO.inputChar ("\nChoose a file (A-X)> ");
	    //while user input is not valid
	    while (!task1Valid (choosefile))
	    {
		choosefile = IO.inputChar ("\nThat isn't a valid file. Choose a file (A-X)> ");
	    }
	    fileChosen1 (choosefile);
	    //use chooses a corrupt file
	    if (choosefile == 'A' || choosefile == 'H' || choosefile == 'M' || choosefile == 'R' || choosefile == 'U' || choosefile == 'G' || choosefile == 'X' || choosefile == 'a' || choosefile == 'h' || choosefile == 'm' || choosefile == 'r' || choosefile == 'u' || choosefile == 'g' || choosefile == 'x')
	    {
		corruptfiles++;
		laptopscreen ();
		System.out.println ("\nYou picked a corrupt file.");
		System.out.println ("\nPoints: " + filepoints + "  Corrupt files: " + corruptfiles);
	    }
	    //user chooses a non-corrupt file
	    else
	    {
		filepoints++;
		laptopscreen ();
		System.out.println ("\n" + message ());
		System.out.println ("\nPoints: " + filepoints + "  Corrupt files: " + corruptfiles);
	    }
	}
	//user wins if they have 5 points or more
	if (filepoints >= 5)
	    win ();
	//user looses if they have less than 5 points
	else
	    lose ();
    }


    //hard level
    public void level2 ()
    {
	int corruptfiles = 0;
	int filepoints = 0;
	//while the user has less than five points, and has chosen less than 3 corrupt files
	while (filepoints < 5 && corruptfiles < 3)
	{
	    char choosefile = IO.inputChar ("\nChoose a file (A-X)> ");
	    //while user input isn't valid
	    while (!task1Valid (choosefile))
	    {
		choosefile = IO.inputChar ("\nThat isn't a valid file. Choose a file (A-X)> ");
	    }
	    fileChosen2 (choosefile);
	    //user chooses a corrupt file
	    if (choosefile == 'A' || choosefile == 'H' || choosefile == 'M' || choosefile == 'R' || choosefile == 'U' || choosefile == 'G' || choosefile == 'X' || choosefile == 'B' || choosefile == 'D' || choosefile == 'O' || choosefile == 'P' || choosefile == 'W' || choosefile == 'a' || choosefile == 'h' || choosefile == 'm' || choosefile == 'r' || choosefile == 'u' || choosefile == 'g' || choosefile == 'x' || choosefile == 'b' || choosefile == 'd' || choosefile == 'o' || choosefile == 'p' || choosefile == 'w')
	    {
		corruptfiles++;
		laptopscreen ();
		System.out.println ("\nYou picked a corrupt file.");
		System.out.println ("\nPoints: " + filepoints + "  Corrupt files: " + corruptfiles);
	    }
	    //user chooses a non-corrupt file
	    else
	    {
		filepoints++;
		laptopscreen ();
		System.out.println ("\n" + message ());
		System.out.println ("\nPoints: " + filepoints + "  Corrupt files: " + corruptfiles);
	    }
	}
	//user wins if they have 5 points or more
	if (filepoints >= 5)
	    win ();
	//user looses if they have less than 5 points
	else
	    lose ();

    }


    //prints a random message if they choose a non-corrupt file
    public String message ()
    {
	int c = (int) (Math.random () * 4) + 1;
	if (c == 1)
	    return "\u00A8That was a non-corrupt one. Good job!\u00A8 ";
	else if (c == 2)
	    return "Look at you go! You chose a non-corrupt file.";
	else if (c == 3)
	    return "You're on a roll. That was a non-corrupt one!";
	else
	    return "Point for you!";
    }


    //if user looses task 1 they play again and variables are reset
    public void lose ()
    {

	System.out.println ("You selected 3 non-corrupt files. You will have to try again.");
	pause ();
	fileReset ();
	startTask1 ();
    }


    //user wins task 1, moves forward to task 2
    public void win ()
    {
	pause ();
	IO.printSlow ("You were successfully able to find the hidden number within the files. The number is...7");
	task2 ();
    }


    //screen outputs for the easy level
    public void fileChosen1 (char choosefile)
    {
	if (choosefile == 'A' || choosefile == 'a')
	    filea = '-';
	else if (choosefile == 'G' || choosefile == 'g')
	    fileg = '-';
	else if (choosefile == 'H' || choosefile == 'h')
	    fileh = '-';
	else if (choosefile == 'M' || choosefile == 'm')
	    filem = '-';
	else if (choosefile == 'R' || choosefile == 'r')
	    filer = '-';
	else if (choosefile == 'U' || choosefile == 'u')
	    fileu = '-';
	else if (choosefile == 'X' || choosefile == 'x')
	    filex = '-';
	else if (choosefile == 'B' || choosefile == 'b')
	    fileb = '+';
	else if (choosefile == 'C' || choosefile == 'c')
	    filec = '+';
	else if (choosefile == 'D' || choosefile == 'd')
	    filed = '+';
	else if (choosefile == 'E' || choosefile == 'e')
	    filee = '+';
	else if (choosefile == 'F' || choosefile == 'f')
	    filef = '+';
	else if (choosefile == 'I' || choosefile == 'i')
	    filei = '+';
	else if (choosefile == 'J' || choosefile == 'j')
	    filej = '+';
	else if (choosefile == 'K' || choosefile == 'k')
	    filek = '+';
	else if (choosefile == 'L' || choosefile == 'l')
	    filel = '+';
	else if (choosefile == 'N' || choosefile == 'n')
	    filen = '+';
	else if (choosefile == 'O' || choosefile == 'o')
	    fileo = '+';
	else if (choosefile == 'P' || choosefile == 'p')
	    filep = '+';
	else if (choosefile == 'Q' || choosefile == 'q')
	    fileq = '+';
	else if (choosefile == 'S' || choosefile == 's')
	    files = '+';
	else if (choosefile == 'T' || choosefile == 't')
	    filet = '+';
	else if (choosefile == 'V' || choosefile == 'v')
	    filev = '+';
	else if (choosefile == 'W' || choosefile == 'w')
	    filew = '+';
    }


    //screen outputs for the hard level
    public void fileChosen2 (char choosefile)
    {
	if (choosefile == 'A' || choosefile == 'a')
	    filea = '-';
	else if (choosefile == 'G' || choosefile == 'g')
	    fileg = '-';
	else if (choosefile == 'H' || choosefile == 'h')
	    fileh = '-';
	else if (choosefile == 'M' || choosefile == 'm')
	    filem = '-';
	else if (choosefile == 'R' || choosefile == 'r')
	    filer = '-';
	else if (choosefile == 'U' || choosefile == 'u')
	    fileu = '-';
	else if (choosefile == 'X' || choosefile == 'x')
	    filex = '-';
	else if (choosefile == 'B' || choosefile == 'b')
	    fileb = '-';
	else if (choosefile == 'C' || choosefile == 'c')
	    filec = '+';
	else if (choosefile == 'D' || choosefile == 'd')
	    filed = '-';
	else if (choosefile == 'E' || choosefile == 'e')
	    filee = '+';
	else if (choosefile == 'F' || choosefile == 'f')
	    filef = '+';
	else if (choosefile == 'I' || choosefile == 'i')
	    filei = '+';
	else if (choosefile == 'J' || choosefile == 'j')
	    filej = '+';
	else if (choosefile == 'K' || choosefile == 'k')
	    filek = '+';
	else if (choosefile == 'L' || choosefile == 'l')
	    filel = '+';
	else if (choosefile == 'N' || choosefile == 'n')
	    filen = '+';
	else if (choosefile == 'O' || choosefile == 'o')
	    fileo = '-';
	else if (choosefile == 'P' || choosefile == 'p')
	    filep = '-';
	else if (choosefile == 'Q' || choosefile == 'q')
	    fileq = '+';
	else if (choosefile == 'S' || choosefile == 's')
	    files = '+';
	else if (choosefile == 'T' || choosefile == 't')
	    filet = '+';
	else if (choosefile == 'V' || choosefile == 'v')
	    filev = '+';
	else if (choosefile == 'W' || choosefile == 'w')
	    filew = '-';
    }


    //laptop screen
    public void laptopscreen ()
    {
	System.out.println ("                         ________________________________________________  ");
	System.out.println ("                        /                                                \\    ");
	System.out.println ("                       |    _________________________________________     |    ");
	System.out.println ("                       |   |                                         |    |    ");
	System.out.println ("                       |   | " + "  " + filea + "      " + fileb + "      " + filec + "      " + filed + "      " + filee + "     " + filef + "   |    |    ");
	System.out.println ("                       |   |                                         |    |    ");
	System.out.println ("                       |   |                                         |    |    ");
	System.out.println ("                       |   | " + "  " + fileg + "      " + fileh + "      " + filei + "      " + filej + "      " + filek + "     " + filel + "   |    |    ");
	System.out.println ("                       |   |                                         |    |    ");
	System.out.println ("                       |   |                                         |    |    ");
	System.out.println ("                       |   | " + "  " + filem + "      " + filen + "      " + fileo + "      " + filep + "      " + fileq + "     " + filer + "   |    |    ");
	System.out.println ("                       |   |                                         |    |    ");
	System.out.println ("                       |   |                                         |    |    ");
	System.out.println ("                       |   | " + "  " + files + "      " + filet + "      " + fileu + "      " + filev + "      " + filew + "     " + filex + "   |    |    ");
	System.out.println ("                       |   |                                         |    |    ");
	System.out.println ("                       |   |                                         |    |    ");
	System.out.println ("                       |   |_________________________________________|    |    ");
	System.out.println ("                       |                                                  |    ");
	System.out.println ("                        \\_________________________________________________/   ");
	System.out.println ("                               \\___________________________________/  ");
	System.out.println ("                            ___________________________________________    ");
	System.out.println ("                          -'    .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.  --- `-_ ");
	System.out.println ("                      _-'.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.  .-.-.`-_  ");
	System.out.println ("                   _-'.-.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-`__`. .-.-.-.`-_   ");
	System.out.println ("                _-'.-.-.-.-. .-----.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-----. .-.-.-.-.`-_    ");
	System.out.println ("           _-'.-.-.-.-.-. .---.-. .-------------------------. .-.---. .---.-.-.-.`-_ ");
	System.out.println ("         :-------------------------------------------------------------------------:    ");
	System.out.println ("          `---._.-------------------------------------------------------------._.---'    ");
    }


    //check if user input for task 1 is valid
    public boolean task1Valid (char choosefile)
    {
	//checks to see if user entered a letter between A-X
	if (choosefile != 'A' && choosefile != 'B' && choosefile != 'C' && choosefile != 'D' && choosefile != 'E' && choosefile != 'F' && choosefile != 'G' && choosefile != 'H' && choosefile != 'I'
		&& choosefile != 'J' && choosefile != 'K' && choosefile != 'L' && choosefile != 'M' && choosefile != 'N' && choosefile != 'O' && choosefile != 'P' && choosefile != 'Q' && choosefile != 'R'
		&& choosefile != 'S' && choosefile != 'T' && choosefile != 'U' && choosefile != 'V' && choosefile != 'W' && choosefile != 'X' && choosefile != 'a' && choosefile != 'b' && choosefile != 'c' && choosefile != 'd' && choosefile != 'e' && choosefile != 'f' && choosefile != 'g' && choosefile != 'h' && choosefile != 'i'
		&& choosefile != 'j' && choosefile != 'k' && choosefile != 'l' && choosefile != 'm' && choosefile != 'n' && choosefile != 'o' && choosefile != 'p' && choosefile != 'q' && choosefile != 'r'
		&& choosefile != 's' && choosefile != 't' && choosefile != 'u' && choosefile != 'v' && choosefile != 'w' && choosefile != 'x')
	    return false;
	//checks to see if user has already selected the file before
	if ((choosefile == 'A' || choosefile == 'a') && filea != 'A')
	    return false;
	if ((choosefile == 'B' || choosefile == 'b') && fileb != 'B')
	    return false;
	if ((choosefile == 'C' || choosefile == 'c') && filec != 'C')
	    return false;
	if ((choosefile == 'D' || choosefile == 'd') && filed != 'D')
	    return false;
	if ((choosefile == 'E' || choosefile == 'e') && filee != 'E')
	    return false;
	if ((choosefile == 'F' || choosefile == 'f') && filef != 'F')
	    return false;
	if ((choosefile == 'G' || choosefile == 'g') && fileg != 'G')
	    return false;
	if ((choosefile == 'H' || choosefile == 'h') && fileh != 'H')
	    return false;
	if ((choosefile == 'I' || choosefile == 'i') && filei != 'I')
	    return false;
	if ((choosefile == 'J' || choosefile == 'j') && filej != 'J')
	    return false;
	if ((choosefile == 'K' || choosefile == 'k') && filek != 'K')
	    return false;
	if ((choosefile == 'L' || choosefile == 'l') && filel != 'L')
	    return false;
	if ((choosefile == 'M' || choosefile == 'm') && filem != 'M')
	    return false;
	if ((choosefile == 'N' || choosefile == 'n') && filen != 'N')
	    return false;
	if ((choosefile == 'O' || choosefile == 'o') && fileo != 'O')
	    return false;
	if ((choosefile == 'P' || choosefile == 'p') && filep != 'P')
	    return false;
	if ((choosefile == 'Q' || choosefile == 'q') && fileq != 'Q')
	    return false;
	if ((choosefile == 'R' || choosefile == 'r') && filer != 'R')
	    return false;
	if ((choosefile == 'S' || choosefile == 's') && files != 'S')
	    return false;
	if ((choosefile == 'T' || choosefile == 't') && filet != 'T')
	    return false;
	if ((choosefile == 'U' || choosefile == 'u') && fileu != 'U')
	    return false;
	if ((choosefile == 'V' || choosefile == 'v') && filev != 'V')
	    return false;
	if ((choosefile == 'W' || choosefile == 'w') && filew != 'W')
	    return false;
	if ((choosefile == 'X' || choosefile == 'x') && filex != 'X')
	    return false;
	//move is valid
	else
	    return true;
    }


    //storyline leading up to task 2
    public void task2 ()
    {

	System.out.println ("\nYou find yourself smiling, thankful that everything worked out. You decide to call the anonymous man to let him know that");
	System.out.println ("you've completed the first task. He answers on the third ring.\n");
	System.out.println ("Anonymous> \"Hello, who is this?\"");
	System.out.println ("You> \"It's me. I just completed the first task. I got to her computer just in time.\"");
	pause ();
	System.out.println ("Anonymous> \"WHAT'S THE FIRST NUMBER?! TELL ME THE FIRST NUMBER!\"");
	System.out.println ("\nYou don't understand why he's shouting at you when you're the one who's doing all the hard work. You decide too...\n");
	System.out.println ("1)Shout back!");
	System.out.println ("2)Swallow down your anger and give him the number");
	int phone = IO.inputInt ("\nWhat would you like to do? (1/2) > ");
	if (phone == 1)
	{
	    System.out.println ("\nYou> \"I'M THE ONE WHO JUST DID ALL THE HARD WORK. YOU DON'T GET TO TALK TO ME LIKE THAT. I'M NOT GIVING YOU THE NUMBER ");
	    System.out.println ("UNTIL I DON'T FIND THE REST OF THEM MYSELF. EITHER TELL ME WHAT TO DO NEXT OR FIND SOMEONE ELSE TO DO YOUR DIRTY WORK!\"");
	    System.out.println ("\nYou take a few breaths afterwards to calm yourself down... After a few seconds he replies");
	    System.out.println ("\nAnonymous> \"Very well. But make sure you don't give the numbers to anyone else. She hid the next number inside a book in her");
	    System.out.println ("backpack. You'll have to take her backpack with you and make a run for it. Make sure no one sees you on the way out. The book ");
	    System.out.println ("is called tricky riddles. I repeat, don't tell ANYONE.\"");
	    pause ();
	}
	else
	{
	    System.out.println ("\nYou> \"Fine. It told me that the first number was 7. What do I do next?\"");
	    System.out.println ("\nAnonymous> \"She hid the next number inside a book in her backpack. You'll have to take her backpack with you and make a run for it. ");
	    System.out.println ("Make sure no one sees you on the way out. The book is called tricky riddles. I repeat, don't tell ANYONE.\"");
	    pause ();
	}
	System.out.println ("He hangs up before you get a chance to say something. You're mad that he treats you so poorly when you're the one doing all the work");
	System.out.println ("for him. You promise yourself you're not going to give him any of the numbers and that you'll open the safe yourself.");
	System.out.println ("\nYou look downstairs and see Mrs.Darkbloom still sitting on the sofa with her head in her hands. You look around for Vivian's backpack");
	System.out.println ("and see it's been tossed underneath her bed.");
	backpack ();
	System.out.println ("\nYou take a split-second decision and decide to make a run for it. You run down the stairs and shut the door on the way out. You take a few seconds to");
	System.out.println ("catch your breath, and then you realize that someone is watching you.\n");
	mrSmith ();
	System.out.println ("\nAfter a few seconds, you realize it's Mr. Smith. He starts to smile at you and you realize he looks even creepier in person. You continue to run past his ");
	System.out.println ("house and don't stop until he's nowhere in sight. Once you're sure you're all alone you decide to open her backpack.");
	System.out.println ("\nYou find lots of folders and loose papers in her bag, as well as the book Tricky Riddles, just as the man had promised.");
	pause ();
	book ();
	library ();
	System.out.println ("Make sure to act very natural in front of Mr. Fisher. He shouldn't find out you're investigating!");
	pause ();
	System.out.println ("Mr.Fisher> \"Hello, what can I do for you today?\"");
	System.out.println ("\n1)I'm here to renew a book");
	System.out.println ("2)I'm trying to solve a murder mystery and I need you to renew my book\n");
	int speak = IO.inputInt ("Say something (1/2)> ");
	if (speak == 1)
	{
	    System.out.println ("\nYou> \"I'm here to renew a book\"");
	    System.out.println ("\nMr.Fisher> \"Ah, I can help you with that\"");
	}
	else
	{
	    System.out.println ("\nYou> \"I'm trying to solve a murdery mystery and I need to renew a book to do so\"\n");
	    System.out.println ("Mr.Fisher> \"Haha! Kids these days are living in their own little world. Let me see your book that you'd like to renew\"");
	    System.out.println ("\nPhewww.. that was a close one...");
	}
	pause ();
	System.out.println ("Once your book has been renewed you sit down at one of the tables and open up the book...\n\n");
	System.out.println ("######## ########  ####  ######  ##    ## ##    ##      ########  #### ########  ########  ##       ########  ######   ");
	System.out.println ("   ##    ##     ##  ##  ##    ## ##   ##   ##  ##       ##     ##  ##  ##     ## ##     ## ##       ##       ##    ##    ");
	System.out.println ("   ##    ##     ##  ##  ##       ##  ##     ####        ##     ##  ##  ##     ## ##     ## ##       ##       ##          ");
	System.out.println ("   ##    ########   ##  ##       #####       ##         ########   ##  ##     ## ##     ## ##       ######    ######     ");
	System.out.println ("   ##    ##   ##    ##  ##       ##  ##      ##         ##   ##    ##  ##     ## ##     ## ##       ##             ##    ");
	System.out.println ("   ##    ##    ##   ##  ##    ## ##   ##     ##         ##    ##   ##  ##     ## ##     ## ##       ##       ##    ##    ");
	System.out.println ("   ##    ##     ## ####  ######  ##    ##    ##         ##     ## #### ########  ########  ######## ########  ######   ");
	pause ();
	System.out.println ("Rumour has it, Vivian loved to solve riddles. You will be given 6 riddles to solve. You must solve at least 3 of them to receive a number.");
	riddles ();

    }


    //user goes to library
    public void library ()
    {
	System.out.println ("It looks like Vivian's library book is due today. You'll have to go to the library and renew it");
	System.out.println ("\nHurry up before the library closes!");
	pause ();
	//dialog box to go to library
	JOptionPane.showMessageDialog (null, "Go to the library?", "Input",
		JOptionPane.QUESTION_MESSAGE);
	System.out.println ("\n                  \\  |  /         ___________                         ");
	System.out.println ("     ____________  \\ \\_# /         |  ___      |       _________       ");
	System.out.println ("    |            |  \\  #/          | |   |     |      | = = = = |       ");
	System.out.println ("    | |   |   |  |   \\\\#           | |`v'|     |      |         |      ");
	System.out.println ("    |            |    \\#  //       |  --- ___  |      | |  || | |       ");
	System.out.println ("    | |   |   |  |     #_//        |     |   | |      |         |        ");
	System.out.println ("    |            |  \\\\ #_/_______  |     |   | |      | |  || | |      ");
	System.out.println ("    | |   |   |  |   \\\\# /_____/ \\ |      ---  |      |         |     ");
	System.out.println ("    |            |    \\# |+ ++|  | |  |^^^^^^| |      | |  || | |       ");
	System.out.println ("    |            |    \\# |+ ++|  | |  |^^^^^^| |      | |  || | |       ");
	System.out.println (" ^^^|    (^^^^^) |^^^^^#^| H  |_ |^|  | |||| | |^^^^^^|         |        ");
	System.out.println ("    |    ( ||| ) |     # ^^^^^^    |  | |||| | |      | ||||||| |        ");
	System.out.println ("    ^^^^^^^^^^^^^________/  /_____ |  | |||| | |      | ||||||| |        ");
	System.out.println ("         `v'-                      ^^^^^^^^^^^^^      | ||||||| |        ");
	System.out.println ("          || |`.      (__)    (__)                          ( )          ");
	System.out.println ("                      (oo)    (oo)                       /---V          ");
	System.out.println ("               /-------\\/      \\/ --------\\             * |  |    ");
	System.out.println ("              / |     ||        ||_______| \\            ");
	System.out.println ("             *  ||W---||        ||      ||  *            ");
	System.out.println ("                ^^    ^^        ^^      ^^           \n");
	System.out.println ("\nLooks like you made it just in time. Let's head inside and speak to Mr. Fisher, he's the librarian");
	pause ();
	librarian ();
    }


    //ibrarian
    public void librarian ()
    {
	System.out.println ("        ____________________________________________________  ");
	System.out.println ("       |____________________________________________________|    ");
	System.out.println ("       | __     __   ____   ___ ||  ____    ____     _  __  |    ");
	System.out.println ("       ||  |__ |--|_| || |_|   |||_|**|*|__|+|+||___| ||  | |    ");
	System.out.println ("       ||==|^^||--| |=||=| |=*=||| |~~|~|  |=|=|| | |~||==| |    ");
	System.out.println ("       ||  |##||  | | || | |JRO|||-|  | |==|+|+||-|-|~||__| |    ");
	System.out.println ("       ||__|__||__|_|_||_|_|___|||_|__|_|__|_|_||_|_|_||__|_|    ");
	System.out.println ("       ||_______________________||__________________________|    ");
	System.out.println ("       | _____________________  ||      __   __  _  __    _ |    ");
	System.out.println ("       ||=|=|=|=|=|=|=|=|=|=|=| __..\\/ |  |_|  ||#||==|  / /|   ");
	System.out.println ("       || | | | | | | | | | | |/\\ \\  \\\\|++|=|  || ||==| / / |    ");
	System.out.println ("       ||_|_|_|_|_|_|_|_|_|_|_/_/\\_.___\\__|_|__||_||__|/_/__|  ");
	System.out.println ("       |____________________ /\\~()/()~//\\ __________________|  ");
	System.out.println ("       | __   __    _  _     \\_  (_ .  _/ _    ___     _____|   ");
	System.out.println ("       ||~~|_|..|__| || |_ _   \\ //\\\\ /  |=|__|~|~|___| | | | ");
	System.out.println ("       ||--|+|^^|==|1||2| | |__/\\ __ /\\__| |==|x|x|+|+|=|=|=|  ");
	System.out.println ("       ||__|_|__|__|_||_|_| /  \\ \\  / /  \\_|__|_|_|_|_|_|_|_| ");
	System.out.println ("       |_________________ _/    \\/\\/\\/    \\_ _______________|    ");
	System.out.println ("       | _____   _   __  |/      \\../      \\|  __   __   ___|  ");
	System.out.println ("       ||_____|_| |_|##|_||   |   \\/ __|   ||_|==|_|++|_|-|||   ");
	System.out.println ("       ||______||=|#|--| |\\   \\   o    /   /| |  |~|  | | |||  ");
	System.out.println ("       ||______||_|_|__|_|_\\   \\  o   /   /_|_|__|_|__|_|_|||  ");
	System.out.println ("       |_________ __________\\___\\____/___/___________ ______|  ");
	System.out.println ("       |__    _  /    ________     ______           /| _ _ _|    ");
	System.out.println ("       |\\ \\  |=|/   //    /| //   /  /  / |        / ||%|%|%|  ");
	System.out.println ("       | \\/\\ |*/  .//____//.//   /__/__/ (_)      /  ||=|=|=|  ");
	System.out.println ("     __|  \\/\\|/   /(____|/ //                    /  /||~|~|~|__    ");
	System.out.println ("       |___\\_/   /________//   ________         /  / ||_|_|_|   ");
	System.out.println ("       |___ /   (|________/   |\\_______\\       /  /| |______|  ");
	System.out.println ("           /                  \\|________)     /  / | |      \n");
    }


    //prints out riddle book
    public void book ()
    {
	System.out.println ("         _.-\"\\");
	System.out.println ("     _.-\"     \\");
	System.out.println ("  ,-\"          \\");
	System.out.println (" ( \\   Tricky   \\");
	System.out.println ("  \\ \\   Riddles  \\");
	System.out.println ("   \\ \\            \\");
	System.out.println ("    \\ \\         _.-;");
	System.out.println ("     \\ \\    _.-\"   :");
	System.out.println ("      \\ \\,-\"    _.-\"");
	System.out.println ("       \\(   _.-\"  ");
	System.out.println ("        `--\"                               ");
	System.out.println ("\nYou flip to the first page of the book and you see a date has been printed on the book");
	//prints out today's date on the book
	SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy");
	Date todaysdate = new Date ();
	pause ();
	System.out.println ("      __________________   __________________");
	System.out.println ("  .-/|                  \\ /                  |\\-.");
	System.out.println ("  ||||                   |                   ||||");
	System.out.println ("  ||||                   |                   ||||");
	System.out.println ("  ||||                   |                   ||||");
	System.out.println ("  ||||   Your book       |                   ||||");
	System.out.println ("  ||||   is due by:      |                   ||||");
	System.out.println ("  ||||                   |                   ||||");
	System.out.println ("  ||||  " + formatter.format (todaysdate) + "       |                   ||||");
	System.out.println ("  ||||                   |                   ||||");
	System.out.println ("  ||||                   |                   ||||");
	System.out.println ("  ||||                   |                   ||||");
	System.out.println ("  ||||__________________ | __________________||||");
	System.out.println ("  ||/===================\\|/===================\\||");
	System.out.println (" ` --------------------~___~-------------------''");
    }


    //Mr Smith
    public void mrSmith ()
    {
	System.out.println ("          / .-  ");
	System.out.println ("          |/,-'`");
	System.out.println ("       _.-'''-._");
	System.out.println ("    _.;.--._.--.;._ ");
	System.out.println ("  .` /(  o/ \\o  )\\ `.");
	System.out.println ("    ;  '-'   '-'  ;");
	System.out.println ("    |     (_)     |");
	System.out.println ("    | .         . |");
	System.out.println ("    |  `-.___.-'  |");
	System.out.println ("    ;    | : |    ;");
	System.out.println ("     \\   | : |   /");
	System.out.println ("      '._| : |_.'");
	System.out.println ("         '._.'               ");
    }


    //prints out backpack
    public void backpack ()
    {
	pause ();
	System.out.println ("      .eec.              .e$$$c                                ");
	System.out.println ("      z$*\"*$$eec..       zP  .3$c                   ");
	System.out.println ("     .$\"  d$\"  \"\"\"****bee*=*\"\" *$                               ");
	System.out.println ("     $%  d$$                   ^$%                              ");
	System.out.println ("    .$  z$%$bc.                 $%                              ");
	System.out.println ("    4F 4$\" $\"^$*ec..  .ee.    ./\" b                             ");
	System.out.println ("    dF $P  P  F   \"\"\"\"\"3F\"\"\"\"\"\"   4                             ");
	System.out.println ("    3b4$   \"           $F         4                             ");
	System.out.println ("    4$$$  -            $F         4                             ");
	System.out.println ("     $$$               $F         4                             ");
	System.out.println ("     *$$               $F         @                             ");
	System.out.println ("     4$$               $F         F                             ");
	System.out.println ("     ^$F   .......     $F        .F                             ");
	System.out.println ("      $\"  z\"     ^\"\"\"\"\"$F\"\"\"\"\"\"\"\"\"%.                            ");
	System.out.println ("     4$  4F     e      $L          \".                           ");
	System.out.println ("     4F  ^L    4$     z%\"c    *.    b                           ");
	System.out.println ("     d    ^$*=e$$eer=$\"  \"be..JL..ee*                           ");
	System.out.println ("     $     $   $F    $   zP   4P   F                            ");
	System.out.println ("     F     F   $F    4. .P    d%  J                             ");
	System.out.println ("    4%     F   $F     F $\"   zP   P                             ");
	System.out.println ("    J      F   '%     Fd\"   4P   4\"                             ");
	System.out.println ("    $      F          $F         P                              ");
	System.out.println ("    $      L         .$         4%                              ");
	System.out.println ("    *      '.       .$$.       .$                               ");
	System.out.println ("    '       ^\"****\"\"\"  \"*******$\"                               ");
	System.out.println ("    %                        .P                                ");
	System.out.println ("    *c                     .@                                 ");
	System.out.println ("       ^\"%4c...        ...                          ");
	System.out.println ("             ^\"\"\"\"\"\"\"\"");
	pause ();
    }


    //asks the user riddles and calculates points
    public void riddles ()
    {
	//6 riddles are asked
	IO.printSlow ("\n\u00a8****RIDDLE NUMBER 1****\u00a8");
	String r1 = IO.inputString ("\n1)I am not alive, but I grow; I don't have lungs, but I need air; I don't have a mouth, but water kills me. What am I? ");
	IO.printSlow ("\n\u00A8****RIDDLE NUMBER 2****\u00A8");
	System.out.println ("Hint: This can be found in your backyard");
	String r2 = IO.inputString ("\n2)What runs around the whole yard without moving? ");
	IO.printSlow ("\n\u00a8****RIDDLE NUMBER 3****\u00a8");
	String r3 = IO.inputString ("\n3)What can you catch but never throw? ");
	IO.printSlow ("\n\u00a8****RIDDLE NUMBER 4****\u00a8");
	System.out.println ("Hint: This is circular and very shiny");
	String r4 = IO.inputString ("\n4)What has a head and a tail, but no body? ");
	IO.printSlow ("\n\u00a8****RIDDLE NUMBER 5****\u00a8");
	String r5 = IO.inputString ("\n5)What is full of holes but still holds water? ");
	IO.printSlow ("\n\u00a8****RIDDLE NUMBER 6****\u00a8");
	System.out.println ("Hint: Read the riddle again");
	String r6 = IO.inputString ("\n6)Rachel's parents have 3 daughters: Julia, Lisa, and what's the third daughter's name? ");
	//sees if riddles answers are correct
	int rpoints = 0;
	if (r1.equalsIgnoreCase ("Fire"))
	    rpoints++;
	if (r2.equalsIgnoreCase ("Fence"))
	    rpoints++;
	if (r3.equalsIgnoreCase ("Cold"))
	    rpoints++;
	if (r4.equalsIgnoreCase ("Coin"))
	    rpoints++;
	if (r5.equalsIgnoreCase ("Sponge"))
	    rpoints++;
	if (r6.equalsIgnoreCase ("Rachel"))
	    rpoints++;
	task2results (rpoints);

    }


    //calculates user results
    public void task2results (int rpoints)
    {
	System.out.println ("\n\nYou got " + rpoints + " riddle(s) right, and " + (6 - rpoints) + " riddle(s) wrong.");
	//the user solved enough riddles
	if (rpoints >= 3)
	{
	    IO.printSlow ("You solved enough riddles to unlock a number! The number is... 5\n");
	    task3 ();
	}


	//the user didn't solve enough riddles
	else
	{
	    System.out.println ("You didn't solve enough riddles. You'll have to try again...");
	    riddles ();
	}
    }


    //storyline leading up to task 3
    public void task3 ()
    {
	System.out.println ("Just as you finish answering all the riddles, Mr. Fisher tells you that the library's closing in 5 minutes. ");
	System.out.println ("You pack up your things and decide to return the book on the way out.");
	pause ();
	System.out.println ("Once you're outside, you call the anonymous man again and ask him what to do next.\n");
	System.out.println ("Anonymous> \"You must go to the toy store and ask to play the peg game. Once you finish playing, show the toy store owner and he'll give you the next number.\"");
	System.out.println ("\nAs always, he hangs up right after and you're left standing there, very confused.");
	System.out.println ("You decide to head over to the store anyway because you don't have any other options.\n");
	town ();
	System.out.println ("Store owner> \"Hello. We were actually just closing so you'll have to come back tomorrow. Sorry kid\"");
	System.out.println ("You> \"No, please... I really need to play the peg game. If I don't play it...I won't be able to...to...sleep at night!\"");
	System.out.println ("\nThe store owner looks at you with a strange expression on his face, but after a few seconds, he hands you the game anyway.");
	pause ();
	System.out.println ("Store owner> \"I'll let you play... but I'm only going to give you one minute. The rules are very simple. There are 4 pegs, and a hole in the");
	System.out.println ("middle. To move, you must take a peg and jump an adjacent peg into a hole which will remove the jumped peg. You may also move to an adjacent spot");
	System.out.println ("if there is a hole there. To win, you must end up with one peg in the centre. Good luck and your time starts now....\"");
	pause ();
	startTask3 ();
    }


    //outputs town
    public void town ()
    {
	System.out.println ("                                    +              #####");
	System.out.println ("                                   / \\");
	System.out.println (" _____        _____     __________/ o \\/\\_________      _________");
	System.out.println ("|o o o|_______|    |___|               | | # # #  |____|  T O Y  | /\\");
	System.out.println ("|o o o|  * * *|: ::|. .|               |o| # # #  |. . |o o o o  |//\\\\");
	System.out.println ("|o o o|* * *  |::  |. .| []  []  []  []|o| # # #  |. . |S T O R E|((|))");
	System.out.println ("|o o o|**  ** |:  :|. .| []  []  []    |o| # # #  |. . |o o o o  |((|))");
	System.out.println ("|_[]__|__[]___|_||_|__<|____________;;_|_|___/\\___|_.|_|____[]___|  |");
	pause ();
	System.out.println ("By the time you find the toy store, it's 6:55 and the store closes at 7:00. You hurry inside and look for the owner of the store.\n");
	owner ();
    }


    //outputs store owner
    public void owner ()
    {
	System.out.println ("                  _,,,_");
	System.out.println ("                  //_\\\\\\\\");
	System.out.println ("                  ;/ \\\\\\\\;");
	System.out.println ("                 (  '7'  )");
	System.out.println ("                  ;  _  ;");
	System.out.println ("                   \\ _ /");
	System.out.println ("                .---)_(---.");
	System.out.println ("               /\\\\  <_>  //\\ ");
	System.out.println ("              ;   > / \\ <' _;");
	System.out.println ("              |   | | | |   |");
	System.out.println ("         _____|  |\\_|_|_/_  |_______");
	System.out.println ("        /    /  /        /  /      /|");
	System.out.println ("       /   \\/==/------, /==/      //|");
	System.out.println ("      /    (\\( -     /  \\\\(      //||");
	System.out.println ("     /       / ~~~~ /           // ||");
	System.out.println ("    /       '------'           //  ||");
	System.out.println ("   /__________________________//   ||");
	System.out.println ("   |-------------------------;;    ||");
	System.out.println ("   ||   ||     |  ||  |==||  ||    ||");
	System.out.println ("   ||   ||     |==||==|  ||  ||    ||");
	System.out.println ("   ||   |/    /  / /  /      ||    |/");
	System.out.println ("   ||        (__/ (__/       ||");
	System.out.println ("   ||                        || ");
	System.out.println ("   ||                        ||");
	System.out.println ("   |/                        |/");
	pause ();
    }


    //task 3 starts here
    public void startTask3 ()
    {
	System.out.println ("########  ########  ######       ######      ###    ##     ## ######## ");
	System.out.println ("##     ## ##       ##    ##     ##    ##    ## ##   ###   ### ##       ");
	System.out.println ("##     ## ##       ##           ##         ##   ##  #### #### ##       ");
	System.out.println ("########  ######   ##   ####    ##   #### ##     ## ## ### ## ######   ");
	System.out.println ("##        ##       ##    ##     ##    ##  ######### ##     ## ##       ");
	System.out.println ("##        ##       ##    ##     ##    ##  ##     ## ##     ## ##       ");
	System.out.println ("##        ########  ######       ######   ##     ## ##     ## ######## \n");
	System.out.println ("                   A  B  _  C  D ");
	System.out.println ("                   1  2  3  4  5 ");
	//timer is started
	now = new Date ();
	int sec1 = now.getSeconds ();
	int min1 = now.getMinutes ();
	//while the game isn't over and time isn't up the game continues
	while (!task3isDone () && !time (min1, sec1))
	{
	    int which = IO.inputInt ("\n                  Move which peg? ");
	    int position = IO.inputInt ("                     Move to? ");
	    task3move (which, position);
	    //if user move isn't valid
	    while (!task3isValid (which, position))
	    {
		System.out.println ("\n                 *** Invalid Move ***");
		board ();
		n = 'n';
		which = IO.inputInt ("\n                  Move which peg? ");
		position = IO.inputInt ("                     Move to? ");
		task3move (which, position);
	    }
	    board ();
	}


	task3results (min1, sec1);

    }


    //prints out peg board
    public void board ()
    {
	System.out.println ("                   " + one + "  " + two + "  " + three + "  " + four + "  " + five);
	System.out.println ("                   1  2  3  4  5");
    }


    //tracks peg movement
    public void task3move (int which, int position)
    { //valid options for moving peg 1
	if (which == 1 && one != '_' && position == 2 && two == '_')
	{
	    two = one;
	    one = '_';
	}


	else if (which == 1 && one != '_' && position == 3 && three == '_' && two != '_')
	{
	    three = one;
	    one = '_';
	    two = '_';
	}


	//valid options for moving peg 2
	else if (which == 2 && two != '_' && position == 1 && one == '_')
	{
	    one = two;
	    two = '_';
	}


	else if (which == 2 && two != '_' && position == 3 && three == '_')
	{
	    three = two;
	    two = '_';
	}


	else if (which == 2 && two != '_' && position == 4 && three != '_' && four == '_')
	{
	    four = two;
	    two = '_';
	    three = '_';
	}


	//valid options for moving peg 3
	else if (which == 3 && three != '_' && position == 2 && two == '_')
	{
	    two = three;
	    three = '_';
	}


	else if (which == 3 && three != '_' && position == 4 && four == '_')
	{
	    four = three;
	    three = '_';
	}


	else if (which == 3 && three != '_' && position == 1 && two != '_' && one == '_')
	{
	    one = three;
	    three = '_';
	    two = '_';
	}


	else if (which == 3 && three != '_' && position == 5 && four != '_' && five == '_')
	{
	    five = three;
	    three = '_';
	    four = '_';
	}


	//valid options for moving peg 4
	else if (which == 4 && four != '_' && position == 5 && five == '_')
	{
	    five = four;
	    four = '_';
	}


	else if (which == 4 && four != '_' && position == 3 && three == '_')
	{
	    three = four;
	    four = '_';
	}


	else if (which == 4 && four != '_' && position == 2 && three != '_' && two == '_')
	{
	    two = four;
	    four = '_';
	    three = '_';
	}


	//valid options for moving peg 5
	else if (which == 5 && five != '_' && position == 4 && four == '_')
	{
	    four = five;
	    five = '_';
	}


	else if (which == 5 && five != '_' && position == 3 && three == '_' && four != '_')
	{
	    three = five;
	    five = '_';
	    four = '_';
	}


	else
	    n = 'y';
    }


    //checks to make sure input is valid
    public boolean task3isValid (int which, int position)
    {
	if ((which < 1 || which > 5) || (position < 1 || position > 5))
	    return false;
	else if (n == 'y')
	    return false;
	else
	    return true;
    }


    //decides if user finished game
    public boolean task3isDone ()
    {
	if (one == '_' && two == '_' && four == '_' && five == '_' && three != '_')
	    return true;
	else
	    return false;
    }


    //gives user their results based on time
    public void task3results (int min1, int sec1)
    {
	//user finishes in less than a minute
	if (!time (min1, sec1))
	{
	    System.out.println ("\nYou finished in time!");
	    System.out.println ("You go up to the owner again and let him know that you've finished the game.");
	    System.out.println ("\nYou> \"I finished the game in under a minute. I was told that you'd give me a number once I played the game\"");
	    IO.printSlow ("Store owner> \"Ahh yes...the number is 6.\"");
	    System.out.println ("\nYou thank him and leave the store with a smile on your face. 3 down, 2 to go!");
	    task4 ();
	}


	//user doesn't finish in time
	else
	{
	    System.out.println ("\nYou ran out of time. You lose.");
	    System.out.println ("You're frustrated that you didn't finish in time. You look up and see that the store owner is busy doing something.");
	    System.out.println ("You decide to try again.\n");
	    pause ();
	    pegReset ();
	    startTask3 ();
	}
    }


    //Tracks time during peg game
    public boolean time (int min1, int sec1)
    {
	//timer ends
	end = new Date ();
	int sec2 = end.getSeconds ();
	int min2 = end.getMinutes ();

	//time elapsed
	int elapsed_sec = (min2 * 60 + sec2) - (min1 * 60 + sec1);
	System.out.println ("Seconds left: " + (60 - elapsed_sec));

	//if more than 60 seconds have passed
	if (elapsed_sec > 60)
	    return true;
	//if less than a minute has passed
	else
	    return false;
    }


    //storyline leading up to task 4
    public void task4 ()
    {
	pause ();
	System.out.println ("For what seems like the tenth time that day, you call the anonymous man once again. ");
	System.out.println ("\nAnonymous> \"The day is coming to an end. You must work quickly with your last two tasks. The next one");
	System.out.println ("is fairly simple. All you have to do is complete Vivian's math homework. In her backpack, you'll find a math");
	System.out.println ("worksheet with math problems on it. Complete as many as you can and you'll be given a number. Remember to work quickly\"\n");
	town1 ();
	System.out.println ("You start walking back, looking for a place to sit to get started on the worksheet.");
	System.out.println ("You notice that it's getting dark and you start to walk faster.");
	System.out.println ("Finally, after 5 minutes you're able to find a bench to do your work.");
	bench ();
	System.out.println ("You check to make sure no one's around you and then you pull out the worksheet...\n");
	startTask4 ();
    }


    //outputs town
    public void town1 ()
    {
	System.out.println ("                                    +              #####");
	System.out.println ("                                   / \\");
	System.out.println (" _____        _____     __________/ o \\/\\_________      _________");
	System.out.println ("|o o o|_______|    |___|               | | # # #  |____|o o o o  | /\\");
	System.out.println ("|o o o|  * * *|: ::|. .|               |o| # # #  |. . |o o o o  |//\\\\");
	System.out.println ("|o o o|* * *  |::  |. .| []  []  []  []|o| # # #  |. . |o o o o  |((|))");
	System.out.println ("|o o o|**  ** |:  :|. .| []  []  []    |o| # # #  |. . |o o o o  |((|))");
	System.out.println ("|_[]__|__[]___|_||_|__<|____________;;_|_|___/\\___|_.|_|____[]___|  |");
	pause ();
    }


    //outputs bench
    public void bench ()
    {
	System.out.println ("      _                     _");
	System.out.println ("    _|_|___________________|_|_");
	System.out.println ("   |__:_____________________:__|");
	System.out.println ("   |___________________________|");
	System.out.println ("   |__:_____________________:__|");
	System.out.println ("   |___________________________|");
	System.out.println ("     |_|___________________|_|");
	System.out.println ("    /__.___________________.__\\");
	System.out.println ("   /__._____________________.__\\");
	System.out.println ("  /_____________________________\\");
	System.out.println ("     | |_|               |_| |");
	System.out.println ("     | |                   | |");
	System.out.println ("     | |                   | |");
	System.out.println ("     |_|                   |_|  ");
	pause ();
    }


    //task 4 starts here
    public void startTask4 ()
    {
	System.out.println ("\n   ##     ##    ###    ######## ##     ##            ########  ########   #######  ########  ##       ######## ##     ##  ######                                          ");
	System.out.println ("   ###   ###   ## ##      ##    ##     ##            ##     ## ##     ## ##     ## ##     ## ##       ##       ###   ### ##    ##                                       ");
	System.out.println ("   #### ####  ##   ##     ##    ##     ##            ##     ## ##     ## ##     ## ##     ## ##       ##       #### #### ##                                       ");
	System.out.println ("   ## ### ## ##     ##    ##    #########            ########  ########  ##     ## ########  ##       ######   ## ### ##  ######                                       ");
	System.out.println ("   ##     ## #########    ##    ##     ##            ##        ##   ##   ##     ## ##     ## ##       ##       ##     ##       ##                                       ");
	System.out.println ("   ##     ## ##     ##    ##    ##     ##            ##        ##    ##  ##     ## ##     ## ##       ##       ##     ## ##    ##                                       ");
	System.out.println ("   ##     ## ##     ##    ##    ##     ##            ##        ##     ##  #######  ########  ######## ######## ##     ##  ###### ");
	System.out.println ("\nThe rules are very simple. You'll be given a series of math problems. You must solve at least half of them to ");
	System.out.println ("receive the next number. Good luck!");
	mathProblems ();
    }


    //user solves math problems
    public void mathProblems ()
    {
	int points = 0;
	int howMany = IO.inputInt ("\nHow many math problems do you wish to solve> ");
	//asks the user to choose a different amount
	while (howMany > 10 || howMany < 1)
	    howMany = IO.inputInt ("\nTry choosing a number between 1 and 10 > ");
	//asks as many quesetions as the user asked
	for (int i = 1 ; i <= howMany ; i++)
	{
	    int type = (int) (Math.random () * 4) + 1;
	    IO.printSlow ("\n***QUESTION NUMBER " + i + "***");
	    if (type == 1)
		points += addition ();
	    else if (type == 2)
		points += subtraction ();
	    else if (type == 3)
		points += multiplication ();
	    else if (type == 4)
		points += division ();
	    System.out.println ("Score: " + points + "/" + howMany + "\n");
	}


	//user percentage
	percent (points, howMany);
	//user results
	task4results (points, howMany);
    }


    //checks user results
    public void task4results (int points, int howMany)
    {
	//if user gets at least half the questions correct
	if ((points * 2) >= howMany)
	{
	    IO.printSlow ("You solved at least half the questions. The next number is...3\n");
	    task5 ();
	}


	//if user gets less than half the questions correct
	else
	{
	    System.out.println ("You didn't solve enough problems. You'll have to try again.\n");
	    startTask4 ();
	}
    }


    //calculates user percentage
    public void percent (int points, int howMany)
    {
	double ptotal = points;
	double amount = howMany;
	double total = (ptotal / amount) * 100;
	//rounds total to 2 places
	System.out.println ("Your final score is " + round (total, 2) + "%");
    }


    //method to round doubles
    public double round (double num, int digit)

    {
	double num2 = num * Math.pow (10, digit);
	double num3 = (num2 - ((int) num2)) * 10;
	num2 = ((int) num2);
	if (num3 >= 5)
	    num2++;
	return num2 /= Math.pow (10, digit);
    }


    //addition problems
    public int addition ()
    {
	int a = (int) (Math.random () * 100) + 1;
	int b = (int) (Math.random () * 100) + 1;
	int guess = 0;
	int ans = a + b;
	guess = IO.inputInt (a + " + " + b + " = ");
	if (guess == ans)
	{
	    System.out.print ("\nThat is correct!\n");
	    return 1;
	}


	else
	{
	    System.out.print ("\nThat was incorrect. It was " + ans + ".\n");
	    return 0;
	}
    }


    //subtraction problems
    public int subtraction ()
    {
	int a = (int) (Math.random () * 100) + 1;
	int b = (int) (Math.random () * 50) + 1;
	int guess = 0;
	int ans = a - b;
	//loop to make sure answer is positive
	do
	{
	    a = (int) (Math.random () * 100) + 1;
	    b = (int) (Math.random () * 50) + 1;
	    ans = a - b;
	}


	while (ans < 0);
	guess = IO.inputInt (a + " - " + b + " = ");
	if (guess == ans)
	{
	    System.out.print ("\nYou're one smart cookie...\n");
	    return 1;
	}


	else
	{
	    System.out.print ("\nThat was incorrect. It was " + ans + ".\n");
	    return 0;
	}
    }


    //multiplication problems
    public int multiplication ()
    {
	int a = (int) (Math.random () * 15) + 1;
	int b = (int) (Math.random () * 10) + 1;
	int guess = 0;
	int ans = a * b;
	guess = IO.inputInt (a + " * " + b + " = ");
	if (guess == ans)
	{
	    System.out.print ("\nThat is correct!\n");
	    return 1;
	}


	else
	{
	    System.out.println ("\nThat was incorrect. It was " + ans + ".\n");
	    return 0;
	}
    }


    //division problems
    public int division ()
    {
	int a = (int) (Math.random () * 80) + 1;
	int b = (int) (Math.random () * 40) + 1;
	int guess = 0;
	int ans = a / b;
	//loop to make sure there is no remainder
	do
	{
	    a = (int) (Math.random () * 80) + 1;
	    b = (int) (Math.random () * 40) + 1;
	    ans = a / b;
	}


	while (a % b != 0);
	guess = IO.inputInt (a + " / " + b + " = ");
	if (guess == ans)
	{
	    System.out.print ("\nYou're one intelligent kid...\n");
	    return 1;
	}


	else
	{
	    System.out.print ("\nThat was incorrect. It was " + ans + ".\n");
	    return 0;
	}
    }


    //storyline leading up to task 5)
    public void task5 ()
    {
	System.out.println ("\nYou find yourself smiling like crazy once again.");
	System.out.println ("This entire day has been so busy and you can't wait for it to be over.");
	pause ();
	System.out.println ("There's only more task left to do and so you take your phone out to call the anonymous man for the last time.");
	System.out.println ("That's when you notice that you have a new text message from the anonymous man himself.\n");
	System.out.println ("        _______________________________________________________  ");
	System.out.println ("       /                                                       \\");
	System.out.println ("      | For your final task, you must download the TicTacToe    |");
	System.out.println ("      | app on your phone and win the first game that you play. |");
	System.out.println ("      | Time is running out so you only get one chance.         |");
	System.out.println ("       \\______  _______________________________________________/");
	System.out.println ("              \\/                                                 ");
	pause ();
	System.out.println ("You look around helplessly unsure of what to do next. For the millionth time that day, you find yourself frustrated");
	System.out.println ("with the anonymous man. He expects you to do all the work but doesn't help you at all in return.");
	System.out.println ("You decide to install the app on your phone anyway but you realize that you have no service. Ughhh!");
	System.out.println ("\nYou start walking back towards the library, hoping that you'll be able to access their wifi even when the library's closed.\n");
	System.out.println ("IIIIIIIIIIIII| |IIIIIIIIIIIIIIIII| |IIIIIIIIIIIII");
	System.out.println ("|_|___|___|__| |__|___|___|___|__| |__|___|___|_|");
	System.out.println ("|___|___|___|| ||___|___|___|___|| ||___|___|___|");
	System.out.println ("|_|       |__| |__|           |__| |__|       |_|");
	System.out.println ("|_|_______|_|| ||_|___________|_|| ||_|_______|_|");
	System.out.println ("|_|___|___|__| |__|___|___|___|__| |__|___|___|_|");
	System.out.println ("|___|___|___|| ||___|___|___|___|| ||___|___|___|");
	System.out.println ("|_|___|___|__| |_Public_Library__| |__|___|___|_|");
	System.out.println ("|___|___|___|| ||___|___|___|___|| ||___|___|___|");
	System.out.println ("|_|       |__| |__|___|___|___|__| |__|  ScS  |_|");
	System.out.println ("|_|_______|_|| ||___|   |   |___|| ||_|_______|_|");
	System.out.println ("|_|___|___|__| |__@ |   |   |_@__| |__|___|___|_|");
	System.out.println ("|___|_/^\\___|| ||___|  æ?‰`  |___|| ||___/^\\_|___|");
	System.out.println ("|_|__<===>|__|_|__|_|   |   |_|__|_|__|<===>__|_|");
	System.out.println ("     ][o][  |_______|___|___|_______|  ][o][");
	System.out.println ("     <===>          |       |          <===>");
	System.out.println ("______\\T/________,_,|,_,o,_,|,_,________\\T/______");
	System.out.println ("|L_L_L_L_L_L_L_L_|\"|\"|\"|y|\"|\"|\"|_L_L_L_L_L_L_L_L|");
	System.out.println ("|_L_L_L_L_L_L_L_L| | | |y| | | |L_L_L_L_L_L_L_L_|");
	System.out.println ("|L_L_L_L_L_L_L_L_|_|_|_|y|_|_|_|_L_L_L_L_L_L_L_L|");
	pause ();
	System.out.println ("Thankfully, you're able to make your way back and connect to the wifi as well. You search up the app on your phone and it takes a ");
	System.out.println ("few minutes to install. \n");
	System.out.println ("Once it's installed you take a deep breath and then open up the app. You only have one chance to get this right, and you don't want to mess it up....\n");
	pause ();
	System.out.println ("######## ####  ######                                                                              ");
	System.out.println ("   ##     ##  ##    ##                                                                             ");
	System.out.println ("   ##     ##  ##                                                                                   ");
	System.out.println ("   ##     ##  ##                                                                                   ");
	System.out.println ("   ##     ##  ##                                                                                   ");
	System.out.println ("   ##     ##  ##    ##                                                                             ");
	System.out.println ("   ##    ####  ######                                                                              ");
	System.out.println ("                           ########    ###     ######                                              ");
	System.out.println ("                              ##      ## ##   ##    ##                                             ");
	System.out.println ("                              ##     ##   ##  ##                                                   ");
	System.out.println ("                              ##    ##     ## ##                                                   ");
	System.out.println ("                              ##    ######### ##                                                   ");
	System.out.println ("                              ##    ##     ## ##    ##                                             ");
	System.out.println ("                              ##    ##     ##  ######                                              ");
	System.out.println ("                                                        ########  #######  ########                  ");
	System.out.println ("                                                           ##    ##     ## ##                        ");
	System.out.println ("                                                           ##    ##     ## ##                        ");
	System.out.println ("                                                           ##    ##     ## ######                    ");
	System.out.println ("                                                           ##    ##     ## ##                        ");
	System.out.println ("                                                           ##    ##     ## ##                        ");
	System.out.println ("                                                           ##     #######  ########                  ");
	System.out.println ("                                                                                       ###    #### ");
	System.out.println ("                                                                                      ## ##    ##  ");
	System.out.println ("                                                                                     ##   ##   ##  ");
	System.out.println ("                                                                                    ##     ##  ##  ");
	System.out.println ("                                                                                    #########  ##  ");
	System.out.println ("                                                                                    ##     ##  ##  ");
	System.out.println ("                                                                                    ##     ## #### ");
	pause ();
	System.out.println ("This is a slightly different version of Tic Tac Toe from what you might've played before. Instead of a 3 by 3 board, you're going to be");
	System.out.println ("playing on a 5 by 5 board. To win, you must get 5 in a row horizontally, vertically, or diagonally. Good luck!\n\n");
	startTask5 ();

    }


    //task 5 starts here
    public void startTask5 ()
    {
	//while the game isn't done
	while (!task5isDone ())
	{
	    printboard ();
	    if (turn == 'X')
	    {
		makemoveAI (turn);
		turn = 'O';
	    }
	    else
	    {
		makemove (turn);
		turn = 'X';
	    }
	}


	printboard ();
	char win = printWinner ();
	//checks to see if user won the game
	if (win == 'O')
	{
	    IO.printSlow ("\nYou completed the final task in time! The final number is...9");
	    //user wins the game
	    conclusionwin ();
	}


	else
	{
	    IO.printSlow ("\nOh no..you didn't win. You weren't able to complete your final task in time...");
	    //user loses the game
	    conclusionlose ();
	}
    }


    //prints tic tac toe board
    public void printboard ()
    {
	System.out.println ("                      1   2   3   4   5");
	System.out.println ("                   1  " + a + " | " + b + " | " + c + " | " + d + " | " + e);
	System.out.println ("                    --------------------");
	System.out.println ("                   2  " + f + " | " + g + " | " + h + " | " + i + " | " + j);
	System.out.println ("                    --------------------");
	System.out.println ("                   3  " + k + " | " + l + " | " + m + " | " + n1 + " | " + o);
	System.out.println ("                    --------------------");
	System.out.println ("                   4  " + p + " | " + q + " | " + r + " | " + s + " | " + t);
	System.out.println ("                    --------------------");
	System.out.println ("                   5  " + u + " | " + v + " | " + w + " | " + x1 + " | " + y1);
    }


    //tracks user movement
    public void makemove (char piece)
    {
	System.out.println ("Your turn!");
	int x = IO.inputInt ("\nEnter the x-coordinate: ");
	int y = IO.inputInt ("Enter the y-coordinate: ");
	//if user enters invalud coordinates
	while (!task5isValid (x, y))
	{
	    System.out.println ("Error - invalid coordinate. Try again.");
	    x = IO.inputInt ("\nEnter the x-coordinate: ");
	    y = IO.inputInt ("Enter the y-coordinate: ");
	}


	//line one
	if (x == 1 && y == 1)
	    a = piece;
	else if (x == 2 && y == 1)
	    b = piece;
	else if (x == 3 && y == 1)
	    c = piece;
	else if (x == 4 && y == 1)
	    d = piece;
	else if (x == 5 && y == 1)
	    e = piece;
	//line two
	else if (x == 1 && y == 2)
	    f = piece;
	else if (x == 2 && y == 2)
	    g = piece;
	else if (x == 3 && y == 2)
	    h = piece;
	else if (x == 4 && y == 2)
	    i = piece;
	else if (x == 5 && y == 2)
	    j = piece;

	//line three
	else if (x == 1 && y == 3)
	    k = piece;
	else if (x == 2 && y == 3)
	    l = piece;
	else if (x == 3 && y == 3)
	    m = piece;
	else if (x == 4 && y == 3)
	    n1 = piece;
	else if (x == 5 && y == 3)
	    o = piece;
	//line four
	else if (x == 1 && y == 4)
	    p = piece;
	else if (x == 2 && y == 4)
	    q = piece;
	else if (x == 3 && y == 4)
	    r = piece;
	else if (x == 4 && y == 4)
	    s = piece;
	else if (x == 5 && y == 4)
	    t = piece;

	//line five
	else if (x == 1 && y == 5)
	    u = piece;
	else if (x == 2 && y == 5)
	    v = piece;
	else if (x == 3 && y == 5)
	    w = piece;
	else if (x == 4 && y == 5)
	    x1 = piece;
	else if (x == 5 && y == 5)
	    y1 = piece;

    }


    //check is user input is valid
    public boolean task5isValid (int x, int y)
    {
	//user must choose numbers between 1-5
	if (x < 1 || x > 5 || y < 1 || y > 5)
	    return false;
	//if spots are already taken
	if (x == 1 && y == 1 && a != ' ')
	    return false;
	else if (x == 2 && y == 1 && b != ' ')
	    return false;
	else if (x == 3 && y == 1 && c != ' ')
	    return false;
	else if (x == 4 && y == 1 && d != ' ')
	    return false;
	else if (x == 5 && y == 1 && e != ' ')
	    return false;
	else if (x == 1 && y == 2 && f != ' ')
	    return false;
	else if (x == 2 && y == 2 && g != ' ')
	    return false;
	else if (x == 3 && y == 2 && h != ' ')
	    return false;
	else if (x == 4 && y == 2 && i != ' ')
	    return false;
	else if (x == 5 && y == 2 && j != ' ')
	    return false;
	else if (x == 1 && y == 3 && k != ' ')
	    return false;
	else if (x == 2 && y == 3 && l != ' ')
	    return false;
	else if (x == 3 && y == 3 && m != ' ')
	    return false;
	else if (x == 4 && y == 3 && n1 != ' ')
	    return false;
	else if (x == 5 && y == 3 && o != ' ')
	    return false;
	else if (x == 1 && y == 4 && p != ' ')
	    return false;
	else if (x == 2 && y == 4 && q != ' ')
	    return false;
	else if (x == 3 && y == 4 && r != ' ')
	    return false;
	else if (x == 4 && y == 4 && s != ' ')
	    return false;
	else if (x == 5 && y == 4 && t != ' ')
	    return false;
	else if (x == 1 && y == 5 && u != ' ')
	    return false;
	else if (x == 2 && y == 5 && v != ' ')
	    return false;
	else if (x == 3 && y == 5 && w != ' ')
	    return false;
	else if (x == 4 && y == 5 && x1 != ' ')
	    return false;
	else if (x == 5 && y == 5 && y1 != ' ')
	    return false;
	//user input is valid
	else
	    return true;
    }


    //tracks if game is done
    public boolean task5isDone ()
    {
	//horizontal win
	if (a == b && a == c && a == d && a == e && a != ' ')
	    return true;
	else if (f == g && f == h && f == i && f == j && f != ' ')
	    return true;
	else if (k == l && k == m && k == n1 && k == o && k != ' ')
	    return true;
	else if (p == q && p == r && p == s && p == t && p != ' ')
	    return true;
	else if (u == v && u == w && u == x1 && u == y1 && u != ' ')
	    return true;
	//vertical win
	else if (a == f && a == k && a == p && a == u && a != ' ')
	    return true;
	else if (b == g && b == l && b == q && b == v && b != ' ')
	    return true;
	else if (c == h && c == m && c == r && c == w && c != ' ')
	    return true;
	else if (d == i && d == n1 && d == s && d == x1 && d != ' ')
	    return true;
	else if (e == j && e == o && e == t && e == y1 && e != ' ')
	    return true;
	//diagnol win
	else if (a == g && a == m && a == s && a == y1 && a != ' ')
	    return true;
	else if (e == i && e == m && e == q && e == u && e != ' ')
	    return true;
	//board has been filled
	else if (a != ' ' && b != ' ' && c != ' ' && d != ' ' && e != ' ' && f != ' ' && h != ' ' && i != ' ' && j != ' ' && k != ' ' && l != ' ' && m != ' ' && n1 != ' ' && o != ' ' && p != ' ' && q != ' ' && r != ' ' && s != ' ' && t != ' ' && u != ' ' && v != ' ' && w != ' ' && x1 != ' ' && y1 != ' ')
	    return true;
	//game isn't over
	else
	    return false;
    }


    //finds out who won the game
    public char printWinner ()
    {
	//horizontal win
	if (a == b && a == c && a == d && a == e && a != ' ')
	    return a;
	else if (f == g && f == h && f == i && f == j && f != ' ')
	    return f;
	else if (k == l && k == m && k == n1 && k == o && k != ' ')
	    return k;
	else if (p == q && p == r && p == s && p == t && p != ' ')
	    return p;
	else if (u == v && u == w && u == x1 && u == y1 && u != ' ')
	    return u;
	//vertical win
	else if (a == f && a == k && a == p && a == u && a != ' ')
	    return a;
	else if (b == g && b == l && b == q && b == v && b != ' ')
	    return b;
	else if (c == h && c == m && c == r && c == w && c != ' ')
	    return c;
	else if (d == i && d == n1 && d == s && d == x1 && d != ' ')
	    return d;
	else if (e == j && e == o && e == t && e == y1 && e != ' ')
	    return e;
	//diagnol win
	else if (a == g && a == m && a == s && a == y1 && a != ' ')
	    return a;
	else if (e == i && e == m && e == q && e == u && e != ' ')
	    return e;
	//tie
	else
	    return 't';

    }


    //tracks AI movement
    public void makemoveAI (char piece)
    {
	int x = (int) (Math.random () * 5) + 1;
	int y = (int) (Math.random () * 5) + 1;
	while (!task5isValid (x, y))
	{
	    x = (int) (Math.random () * 5) + 1;
	    y = (int) (Math.random () * 5) + 1;
	}


	System.out.println ("\nThe AI's turn!");
	System.out.println ("It picked position (" + x + ", " + y + ")\n");
	//line one
	if (x == 1 && y == 1)
	    a = piece;
	else if (x == 2 && y == 1)
	    b = piece;
	else if (x == 3 && y == 1)
	    c = piece;
	else if (x == 4 && y == 1)
	    d = piece;
	else if (x == 5 && y == 1)
	    e = piece;
	//line one
	else if (x == 1 && y == 2)
	    f = piece;
	else if (x == 2 && y == 2)
	    g = piece;
	else if (x == 3 && y == 2)
	    h = piece;
	else if (x == 4 && y == 2)
	    i = piece;
	else if (x == 5 && y == 2)
	    j = piece;

	//line three
	else if (x == 1 && y == 3)
	    k = piece;
	else if (x == 2 && y == 3)
	    l = piece;
	else if (x == 3 && y == 3)
	    m = piece;
	else if (x == 4 && y == 3)
	    n1 = piece;
	else if (x == 5 && y == 3)
	    o = piece;
	//line four
	else if (x == 1 && y == 4)
	    p = piece;
	else if (x == 2 && y == 4)
	    q = piece;
	else if (x == 3 && y == 4)
	    r = piece;
	else if (x == 4 && y == 4)
	    s = piece;
	else if (x == 5 && y == 4)
	    t = piece;

	//line five
	else if (x == 1 && y == 5)
	    u = piece;
	else if (x == 2 && y == 5)
	    v = piece;
	else if (x == 3 && y == 5)
	    w = piece;
	else if (x == 4 && y == 5)
	    x1 = piece;
	else if (x == 5 && y == 5)
	    y1 = piece;
    }


    //conclusion if user loses game
    public void conclusionlose ()
    {
	pause ();
	System.out.println ("You look up from your screen and start to cry...");
	System.out.println ("You worked so hard the entire day and it still didn't pay off. Vivian's killer may never be found...");
	System.out.println ("");
	System.out.println ("*****3 MONTHS LATER*****");
	System.out.println ("                            ");
	System.out.println ("                                    +              #####");
	System.out.println ("                                   / \\");
	System.out.println (" _____        _____     __________/ o \\/\\_________      _________");
	System.out.println ("|o o o|_______|    |___|               | | # # #  |____|o o o o  | /\\");
	System.out.println ("|o o o|  * * *|: ::|. .|               |o| # # #  |. . |o o o o  |//\\\\");
	System.out.println ("|o o o|* * *  |::  |. .| []  []  []  []|o| # # #  |. . |o o o o  |((|))");
	System.out.println ("|o o o|**  ** |:  :|. .| []  []  []    |o| # # #  |. . |o o o o  |((|))");
	System.out.println ("|_[]__|__[]___|_||_|__<|____________;;_|_|___/\\___|_.|_|____[]___|  |");
	pause ();
	System.out.println ("As you're heading to the library, you run into Vivian's mother.");
	System.out.println ("");
	System.out.println ("            ,{{}}}}}}.");
	System.out.println ("          {{{{{}}}}}}}.");
	System.out.println ("         {{{{  {{{{{}}}}");
	System.out.println ("        }}}}} _   _ {{{{{");
	System.out.println ("        }}}}  m   m  }}}}}");
	System.out.println ("       {{{{C    ^    {{{{{");
	System.out.println ("      }}}}}}\\  ---  /}}}}}}");
	System.out.println ("     {{{{{{{{;.___.;{{{{{{{{");
	System.out.println ("     }}}}}}}}})   (}}}}}}}}}}");
	System.out.println ("    {{{{}}}}}':   :{{{{{{{{{{");
	System.out.println ("    {{{}}}}}}  `@` {{{}}}}}}}");
	System.out.println ("     {{{{{{{{{    }}}}}}}}}");
	System.out.println ("       }}}}}}}}  {{{{{{{{{");
	System.out.println ("        {{{{{{{{  }}}}}}");
	System.out.println ("           }}}}}  {{{{      ");
	System.out.println ("            {{{    }}");
	System.out.println ("");
	System.out.println ("You feel the sense of guilt starting to arise once again.... the guilt of never finding out who killed Vivian.");
	System.out.println ("You don't want to face Vivian's mother, but you also don't want to seem rude. ");
	System.out.println ("You decide to walk up to her and say hello.");
	pause ();
	System.out.println ("You> \"Hi Mrs.Darkbloom. I'm not sure if you remember me, but I came to your house a few months ago.\"");
	System.out.println ("");
	System.out.println ("Mrs.Darkbloom> \"Ahh... yes I remember you.\"");
	System.out.println ("");
	System.out.println ("You look at her face closely and see that she seems very upset");
	System.out.println ("");
	System.out.println ("You> \"Is everything okay Mrs.Darkbloom? You seem very sad.\"");
	System.out.println ("");
	System.out.println ("Mrs.Darkbloom> \"Today's a very sad day for me. Today, the police decide to close the case of Vivian's murder. They weren't able to");
	System.out.println ("find out who killed my little girl... and now her killer is out there somewhere...waiting to strike again.\"");
	pause ();
	System.out.println ("She starts crying again but you don't have it in you to console her. This is all your fault. If only you would've been able to");
	System.out.println ("get to that letter in time, Vivian's killer would've been in jail today...");
	System.out.println ("\nYou decide to sit down for a few minutes to calm yourself down and that's when you see a newspaper on the bench beside you. ");
	System.out.println ("You pick it up and turn to the first page");
	pause ();
	System.out.println ("    _____________________________________");
	System.out.println ("    |       D A I L Y   N E W S          |");
	System.out.println ("    |                                    |");
	System.out.println ("    |  &&&  ========================     |");
	System.out.println ("    |  ======================   &&&&     |");
	System.out.println ("    |         BREAKING NEWS:             |");
	System.out.println ("    |                                    |");
	System.out.println ("    | An 18-year-old girl named Rebecca  |");
	System.out.println ("    | Sandlewood was found dead in her   | ");
	System.out.println ("    | apartment yesterday. The police say|");
	System.out.println ("    | poison was found in her drink.     |");
	System.out.println ("    | Could this be linked to the murder |");
	System.out.println ("    | of Vivian Darkbloom?               |");
	System.out.println ("    |  ============== ================   |");
	System.out.println ("    |                                    |");
	System.out.println ("    | [_]  ==================== &&$%     |");
	System.out.println ("    | ===============================    |");
	System.out.println ("    | ======================= &&&&&&     |");
	System.out.println ("    | ============= && $$$$$$$$ =====    |");
	System.out.println ("    | ===============================    |");
	System.out.println ("    | ======================== [_] ==    |");
	System.out.println ("    |                                    |");
	System.out.println ("    | #################################  |                               ");
	System.out.println ("    |____________________________________|");
	pause ();
	IO.printSlow ("The murderer has struck again...\n");
	System.out.println ("    ######## ##     ## ########     ######## ##    ## ########  ");
	System.out.println ("       ##    ##     ## ##           ##       ###   ## ##     ##    ");
	System.out.println ("       ##    ##     ## ##           ##       ####  ## ##     ##   ");
	System.out.println ("       ##    ######### ######       ######   ## ## ## ##     ## ");
	System.out.println ("       ##    ##     ## ##           ##       ##  #### ##     ## ");
	System.out.println ("       ##    ##     ## ##           ##       ##   ### ##     ##  ");
	System.out.println ("       ##    ##     ## ########     ######## ##    ## ########");
	System.out.println ("");
	//variables are reset
	reset ();
	//game is over
	again = 'n';

    }


    //conclusion if user wins game
    public void conclusionwin ()
    {
	System.out.println ("");
	System.out.println ("You look up from your screen and you start to cry... You're so happy you finished the last task");
	System.out.println ("You call the anonymous man to let him know that you're done...and to ask him a few questions as well");
	System.out.println ("");
	System.out.println ("You> \"I just got the last number but...I'm not going to tell you anything until you don't answer something first.\"");
	System.out.println ("Anonymous> \"Alright, but you better make it quick\"");
	System.out.println ("");
	System.out.println ("You> \"You have to tell me who you are... How can I trust you with any of the numbers if I don't even know your name\"");
	System.out.println ("Anonymous> \"Very well, I guess you deserve to know. My name is Eric, I'm Vivian's ex-boyfriend\"");
	pause ();
	System.out.println ("You open your mouth to say something but no words come out. You're completely shocked. You never would've expected it to be Eric!");
	System.out.println ("");
	System.out.println ("Eric> \"When Vivian and I broke up last month, we still remained friends after that. She told me that someone was trying to hurt her ");
	System.out.println ("but she couldn't tell me who. She told me she was going to hide a letter in her safe, in case anything ever happened to her. She made");
	System.out.println ("me promise not tell anyone, and she told me all the tasks that would be necessary to find the letter. I would've completed them myself,");
	System.out.println ("but the police have been watching me and I didn't want to risk getting caught which is why I asked you to help me. Now that you've found");
	System.out.println ("all the numbers we can finally find out who murdered Vivian and take the letter to the police.\"");
	System.out.println ("\nYou> \"Wait, hold on a second... What about those students from your school who said you were always threatening Vivian?\"");
	pause ();
	System.out.println ("Eric> \"I wasn't threatening her, I would never...I was only trying to get her to tell me the name of the person trying to hurt her. I really wanted to");
	System.out.println ("help her before something bad happened...\"");
	System.out.println ("");
	System.out.println ("You take a few seconds to process everything that Eric just told you. You still can't believe that the anonymous man was Eric. You ask Eric to meet you");
	System.out.println ("at the police station, and head over to Vivian's house to unlock the safe.");
	System.out.println ("");
	System.out.println ("Mrs.Darkbloom opens the door once again and invites you inside");
	System.out.println ("");
	System.out.println ("            ,{{}}}}}}.");
	System.out.println ("          {{{{{}}}}}}}.");
	System.out.println ("         {{{{  {{{{{}}}}");
	System.out.println ("        }}}}} _   _ {{{{{");
	System.out.println ("        }}}}  m   m  }}}}}");
	System.out.println ("       {{{{C    ^    {{{{{");
	System.out.println ("      }}}}}}\\  ---  /}}}}}}");
	System.out.println ("     {{{{{{{{;.___.;{{{{{{{{");
	System.out.println ("     }}}}}}}}})   (}}}}}}}}}}");
	System.out.println ("    {{{{}}}}}':   :{{{{{{{{{{");
	System.out.println ("    {{{}}}}}}  `@` {{{}}}}}}}");
	System.out.println ("     {{{{{{{{{    }}}}}}}}}");
	System.out.println ("       }}}}}}}}  {{{{{{{{{");
	System.out.println ("        {{{{{{{{  }}}}}}");
	System.out.println ("           }}}}}  {{{{      ");
	System.out.println ("            {{{    }}");
	pause ();
	System.out.println ("You explain the entire situation to her and apologize for your behavior earlier.");
	System.out.println ("");
	System.out.println ("You> \"I'm sorry for leaving your house without telling you. I didn't want to risk anyone finding out what I was doing.\"");
	System.out.println ("Mrs.Darkbloom> \"No it's alright. I understand. It doesn't matter what happened earlier... let's just go upstairs and find that letter!\"");
	System.out.println ("");
	System.out.println ("You both make your way upstairs to unlock the safe together.\n");
	//user enters in safe code
	int code = IO.inputInt ("Type in the 5 numbers you received, in order: ");
	while (code != 75639)
	    code = IO.inputInt ("\nPlease try again: ");
	System.out.println ("\nThe safe opens up and you find a letter inside.");
	System.out.println ("You decide to head over to the police station first and read the letter there instead.");
	System.out.println ("               _");
	System.out.println ("             .'`\"`'.");
	System.out.println ("            /   , , \\ ");
	System.out.println ("           |   <\\^/> |");
	System.out.println ("           |  < (_) >|");
	System.out.println ("           /====\\");
	System.out.println ("          (.---._ _.-.)");
	System.out.println ("           |/   a` a |");
	System.out.println ("           (      _\\ |");
	System.out.println ("            \\    __  ;");
	System.out.println ("            |\\   .  /");
	System.out.println ("         _.'\\ '----;'-.");
	System.out.println ("     _.-'  O ;-.__.'\\O `o.");
	System.out.println ("    /o \\      \\/-.-\\/|    \\");
	System.out.println ("     |    ;,     '.|\\| /");
	pause ();
	System.out.println ("Police officer> \"Hello, I'm officer Marc. Your friend Eric here explained the entire situation to me... and can I just say... you're one very brave kid.\"");
	System.out.println ("");
	System.out.println ("You thank him and hand him the letter. He begins to read it outloud.");
	System.out.println ("");
	System.out.println ("Police officer> \"My name is Vivian Darkbloom. I'm writing this letter because I'm afraid that someone is trying to hurt me. This person has come to my house");
	System.out.println ("multiple times before while my parents were gone and has threatened to kill me. I am choosing to keep quiet because he's told me he'll kill my whole family");
	System.out.println ("if I go to the police or tell anyone else. I'm very scared and don't know what to do. I'm hiding this letter in the hopes that if something happens to me...");
	System.out.println ("someone will find this letter and save my family before it's too late. The man's name is Mr.Smith. Mr.Smith is trying to kill me....\"");
	System.out.println ("");
	System.out.println ("You wipe the tears running down your face and decide to be brave. You walk over to Mrs.Darkbloom and sit down next to her.");
	System.out.println ("Tears are running down her face as well and she looks even more upset then before");
	pause ();
	System.out.println ("You> \"Mrs.Darkbloom, you raised a very brave girl. You should be very proud\"");
	System.out.println ("Mrs.Darkbloom> \"I don't know how to thank you enough for all your help... if it weren't for you and Eric, we never would've known about the letter.\"");
	System.out.println ("");
	System.out.println ("Police officer> \"She's right, you and Eric have done very well. Thank you for all your help. My team and I will head over to Mr.Smith's house right");
	System.out.println ("now to arrest him.\"");
	System.out.println ("");
	System.out.println ("A few minutes later Mrs.Darkbloom and Eric leave the station and head home. ");
	System.out.println ("You leave a few minutes later with a huge smile on your face. ");
	System.out.println ("");
	IO.printSlow ("All your hard work paid off...and you were successfully able to solve the case of Vivian's murder!");
	System.out.println ("");
	System.out.println ("    ######## ##     ## ########     ######## ##    ## ########  ");
	System.out.println ("       ##    ##     ## ##           ##       ###   ## ##     ##    ");
	System.out.println ("       ##    ##     ## ##           ##       ####  ## ##     ##   ");
	System.out.println ("       ##    ######### ######       ######   ## ## ## ##     ## ");
	System.out.println ("       ##    ##     ## ##           ##       ##  #### ##     ## ");
	System.out.println ("       ##    ##     ## ##           ##       ##   ### ##     ##  ");
	System.out.println ("       ##    ##     ## ########     ######## ##    ## ########");
	System.out.println ("");
	//variable reset
	reset ();
	//game is over
	again = 'n';
    }


    //reset variables to play again
    public void reset ()
    {
	fileReset ();
	pegReset ();
	ticTacToeReset ();
    }


    //resets files to initial value
    public void fileReset ()
    {
	filea = 'A';
	fileb = 'B';
	filec = 'C';
	filed = 'D';
	filee = 'E';
	filef = 'F';
	fileg = 'G';
	fileh = 'H';
	filei = 'I';
	filej = 'J';
	filek = 'K';
	filel = 'L';
	filem = 'M';
	filen = 'N';
	fileo = 'O';
	filep = 'P';
	fileq = 'Q';
	filer = 'R';
	files = 'S';
	filet = 'T';
	fileu = 'U';
	filev = 'V';
	filew = 'W';
	filex = 'X';
    }


    //resets peg variables to initial value
    public void pegReset ()
    {
	one = 'A';
	two = 'B';
	three = '_';
	four = 'C';
	five = 'D';
	n = 'n';
    }


    //resets tic tac toe variables to initial value
    public void ticTacToeReset ()
    {
	a = ' ';
	b = ' ';
	c = ' ';
	d = ' ';
	e = ' ';
	f = ' ';
	g = ' ';
	h = ' ';
	i = ' ';
	j = ' ';
	k = ' ';
	l = ' ';
	m = ' ';
	n1 = ' ';
	o = ' ';
	p = ' ';
	q = ' ';
	r = ' ';
	s = ' ';
	t = ' ';
	u = ' ';
	v = ' ';
	w = ' ';
	x1 = ' ';
	y1 = ' ';
	turn = 'X';
    }
}
