import java.io.IOException;


public class LostInMaya {
	public static void main(String[] args) throws IOException {
		int blood = 10;
		int adventure = 0;
		
		// TODO Auto-generated method stub
		System.out.println("It’s a sunny night, you are stargazing at the roof of your house.");
		keyListener("stars are sparkling from places far away from galaxy, everything is as tranquil as usual");
		keyListener("yet all of a sudden, a beam of aurora like strong light displayed in the sky,");
		keyListener("What is your name?");
		
		//get name of user
		String name = getUserInput(512);
		
		keyListener("Hi, "+name+"!You may wondering what is happening to you,\nbut we just want to tell you you are chosen to save Maya civilisation from distinction.");	
		keyListener("“How am I able to do that? I am just a normal guy. \nAnd even I agreed to accept the mission, how could I travel to the era that has already gone?”");
		keyListener("You felt so confused.");
		keyListener("“When the moon is in line with mars, you can travel back to Maya times.\nBut just remember you only have 5 blood and one live, so you have to be really careful taking care of yourself,\nelse you will even have trouble coming back to your modern life.”");
		keyListener("“That’s so strange and unfair....”");
		keyListener("“Sorry, there’s no time left for us to talk with each other,\nthe moon will soon stay in line with mars, get ready and good luck!”");
		keyListener("Now you get absorbed to a colourful hole, after several minutes of frightening screaming,\nyou fell on the rock near a beach, according to the calendar, it is BC 1500.");
		keyListener("Sitting on the rock, you see there’s a crowd of people on the beach.");
		keyListener("In the center of the crowd, there’s a young girl dressed in beautiful flower clothes lying on a bed made of straw, \nsome men are reciting something loud and serene which makes you guess they are probably priests. ");
		keyListener("Look around the beach, there are some new ruins.");
		keyListener("You suddenly understand that they are using the young girl to please the god of Sun \nbecause they have just suffered from an earthquake. ");
		keyListener("Now you have a rope and some stones near you, by throwing the stones you will lose 2 blood \nbut you will make a mess to the crowd and save the sacrificing girl from dying");
		keyListener("Do you still want to toss the stone(y/n)?");
		
		String answerTossStone = getUserInput(10);
		if(answerTossStone.equals("y"))
		{
			blood -= 2;
			adventure++;
			keyListener("Cool, you have successfully caused a chaos in the crowd");
			
		}
		else
		{
			keyListener("Anyway");
		}
		keyListener("but to not get suspected, you will have to run now, so you run to the mountain.");
		keyListener("You feel so tired, you stumbled upon a coconut fruit.\nDo you want to drink it?(y/n)");
		String drinkCoconut = getUserInput(10);
		if(drinkCoconut.equals("y"))
		{
			blood++;
			keyListener("You get one blood back");
		}
		else
		{
			keyListener("That's shame you missed a fresh coconut!");
		}
		
		keyListener("Now you hold the coconut and sit on a wood, \nyou didn’t realize there’s a girl sitting next to you.");
		keyListener("“Hi, I don’t think I have ever seen you before. \nWhat’s your name? I am Cecilia.”");
		keyListener("“Oh, hi, Cecilia, I am ”"+name);
		keyListener("You two are talking happily until you notice something strange that it seems everyone passes by showed big respect to her,\nSo you asked her why, and she told you that she is princess of Maya.");
		keyListener("You felt excited and you told her about your mission, she felt confused, \nso you told her where you come from. Even though Cecilia felt more confused.");
		keyListener("But still for saving Maya from the upcoming catastrophe, she agreed to risk with you.");
		keyListener("Now you two are heading to the Maya pyramid, /nyou stepped in the pyramid with daunt");
		keyListener("Cecilia patiently and carefully lead you to the right path as there are many fatal mechanism inside");
		keyListener("After crossing many stages, you come to the toppest stage of the pyramid");
		keyListener("and Cecilia tells you the map of Maya is embedded in the wall, \nthe only way you can get the map out of the wall is to dig out the gold decorated outside,");
		keyListener("but you only have a candle’s time to do it, because Cecilia will try to distract the guard in Pyramid /nand she couldn’t promise any more time");
		keyListener("so, now you should start digging the gold on the wall (To input 10 Gs, no more than, no more less).");
		
		//make sure if they have input 30 Gs
		String gold = getUserInput(100);
		if(gold.length() == 10)
		{
			blood -= 4;
			adventure++;
			System.out.println("Congrats! You get the map");
		}
		else
		{
			System.out.println("Sorry, you failed to get the map, game over!");
			return;
		}
		
		keyListener("“Run, "+name+"!” Cecilia shouted just when the guard found out someone is stealing the map.");
		
		keyListener("So you immediately hold Cecilia’s hand and start escaping out of the pyramid, \nthe guard gives off signal of alert, soon a troop of soldiers are running after you two.");
		keyListener("You two eventually get arrested.");
		adventure++;
		keyListener("You are in big danger now, because according to the Maya law, \nwhoever attempts to steal the map should be sentenced to death penalty");
		keyListener("even though Cecilia begged her father to let you go, \nbut her dad and the people just won’t abide by.");
		keyListener("Now it’s time for you to tell everyone what you are doing, it’s your time to persuade the King \nand Maya people to together save Maya civilization from distinction with you.");
		
		String persuation = getUserInput(1000);
		System.out.println(persuation);
		keyListener("The people were touched by your words, they are kneeling down together to beg King to forgive you.\nThe King finally said yes and agreed to move Maya to the ocean in the east.");
		if(adventure<3||blood<0)
		{
			System.out.println("Sorry you either didn't through enough adventures or you are running out of blood. Game Over");
			return;
		}
		keyListener("Finally the big catastrophe came, river flooded, building collapsed, \nsweet Maya land was unfortunately hit to ruins.");
		keyListener("And it’s your effort, now Maya people is living in the ocean called Atlantic.");
		keyListener("Because your mission is now completed, you will be sent back to 21st century,");
		keyListener("you felt glorious but also a little sad because of Cecilia, you are thinking of her, \nher sweet, decadent smiles, and charming personality, ");
		keyListener("yet you have to go and you can’t visit her in Atlantic ocean. \nJust as you were thinking, the time machine got you back to your life. ");
		keyListener("You just woke up from your bed, you checked your phone, \nand it is 21st May, 2018, it’s a sunny day,");
		keyListener("so you decide to head out alone and take a walk around the city you have been absent for a month. ");
		keyListener("Just outside the music store, trying to take a sip from the soft drink in your hand,");
		keyListener("you heard the music singing about the Atlantis princess, looking into the store,");
		keyListener("you saw a girl, who looks just like your Cecilia, \nyou called her name and she said hi to you, but her name isn’t Cecilia. \nBut this must be fate, you were thinking.");
	
	}
	
	
	public static void keyListener(String context) throws IOException
	{
		byte[] byteKeyOne = new byte[10];
		System.in.read(byteKeyOne);
		String keyOne = new String(byteKeyOne).trim();
		if(!keyOne.equals("n"))
		{
			System.out.println("Please enter n to continue");
			keyListener(context);
			
		}
		else
		{
			System.out.println(context);
		}
	}
	
	public static String getUserInput(int byteSize) throws IOException
	{
		byte[] byteName = new byte[byteSize];
		System.in.read(byteName);
		String name = new String(byteName).trim();
		return name;
	}
}
