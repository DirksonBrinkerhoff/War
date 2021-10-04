import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deck
	{
		// Initializing the ArrayList
		static ArrayList<Card>deck = new ArrayList<Card>();
		
		// Creating the array list
		public static void addCards()
		{
			System.out.println("Welcome to War!!! When you're ready to start, please type 'ready'");
			PlayWar.userStringInput.nextLine();
			deck.add(new Card("ace", "hearts", 14));
	        deck.add(new Card("ace", "clubs", 14));
	        deck.add(new Card("ace", "spades", 14));
	        deck.add(new Card("ace", "diamonds", 14));
	        deck.add(new Card("king", "hearts", 13));
	        deck.add(new Card("king", "clubs", 13));
	        deck.add(new Card("king", "spades", 13));
	        deck.add(new Card("king", "diamonds", 13));
	        deck.add(new Card("queen", "hearts", 12));
	        deck.add(new Card("queen", "clubs", 12));
	        deck.add(new Card("queen", "spades", 12));
	        deck.add(new Card("queen", "diamonds", 12));
	        deck.add(new Card("jack", "hearts", 11));
	        deck.add(new Card("jack", "clubs", 11));
	        deck.add(new Card("jack", "spades", 11));
	        deck.add(new Card("jack", "diamonds", 11));
	        deck.add(new Card("ten", "hearts", 10));
	        deck.add(new Card("ten", "clubs", 10));
	        deck.add(new Card("ten", "spades", 10));
	        deck.add(new Card("ten", "diamonds", 10));
	        deck.add(new Card("nine", "hearts", 9));
	        deck.add(new Card("nine", "clubs", 9));
	        deck.add(new Card("nine", "spades", 9));
	        deck.add(new Card("nine", "diamonds", 9));
	        deck.add(new Card("eight", "hearts", 8));
	        deck.add(new Card("eight", "clubs", 8));
	        deck.add(new Card("eight", "spades", 8));
	        deck.add(new Card("eight", "diamonds", 8));
	        deck.add(new Card("seven", "hearts", 7));
	        deck.add(new Card("seven", "clubs", 7));
	        deck.add(new Card("seven", "spades", 7));
	        deck.add(new Card("seven", "diamonds", 7));
	        deck.add(new Card("six", "hearts", 6));
	        deck.add(new Card("six", "clubs", 6));
	        deck.add(new Card("six", "spades", 6));
	        deck.add(new Card("six", "diamonds", 6));
	        deck.add(new Card("five", "hearts", 5));
	        deck.add(new Card("five", "clubs", 5));
	        deck.add(new Card("five", "spades", 5));
	        deck.add(new Card("five", "diamonds", 5));
	        deck.add(new Card("four", "hearts", 4));
	        deck.add(new Card("four", "clubs", 4));
	        deck.add(new Card("four", "spades", 4));
	        deck.add(new Card("four", "diamonds", 4));
	        deck.add(new Card("three", "hearts", 3));
	        deck.add(new Card("three", "clubs", 3));
	        deck.add(new Card("three", "spades", 3));
	        deck.add(new Card("three", "diamonds", 3));
	        deck.add(new Card("two", "hearts", 2));
	        deck.add(new Card("two", "clubs", 2));
	        deck.add(new Card("two", "spades", 2));
	        deck.add(new Card("two", "diamonds", 2));
		}
		// Displaying the cards to the user
		public static void displayCards()
		{
			for(int i = 0; i < deck.size(); i++)
				{
					System.out.println(deck.get(i).getRank() + " of " + deck.get(i).getSuit()); 
				}
		}
		// Shuffling the cards for the user
		public static void shuffle()
		{			
			Collections.shuffle(deck);
		}
		
	}
