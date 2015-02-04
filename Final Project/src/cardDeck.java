import java.util.ArrayList;
import java.util.Scanner;
public class cardDeck {
private String card;
private int value;
public cardDeck(String cd, int vl)
{
	 card=cd;
	 value=vl;
}
public static void setupDeck1(){
	ArrayList<cardDeck>card = new ArrayList<cardDeck>();
	card.add(new cardDeck("Ace of "+ cardSuits[randSuit], 1));
	card.add(new cardDeck("two", 2));
	card.add(new cardDeck("three", 3));
	card.add(new cardDeck("four", 4));
	card.add(new cardDeck("five", 5));
	card.add(new cardDeck("six", 6));
	card.add(new cardDeck("seven", 7));
	card.add(new cardDeck("eight", 8));
	card.add(new cardDeck("nine", 9));
	card.add(new cardDeck("ten", 10));
	card.add(new cardDeck("jack", 10));
	card.add(new cardDeck("queen", 10));
	card.add(new cardDeck("king", 10));
	
	String [] cardSuits=new String [4];
	cardSuits[0]="Hearts";
	cardSuits[1]="Spades";
	cardSuits[2]="Diamonds";
	cardSuits[3]="Clubs";
	
	int randSuit=(int)(Math.random()*4);
}

	public static void setupDeck2(){
		ArrayList<cardDeck>card = new ArrayList<cardDeck>();
		card.add(new cardDeck("Ace", 1));
		card.add(new cardDeck("two", 2));
		card.add(new cardDeck("three", 3));
		card.add(new cardDeck("four", 4));
		card.add(new cardDeck("five", 5));
		card.add(new cardDeck("six", 6));
		card.add(new cardDeck("seven", 7));
		card.add(new cardDeck("eight", 8));
		card.add(new cardDeck("nine", 9));
		card.add(new cardDeck("ten", 10));
		card.add(new cardDeck("jack", 10));
		card.add(new cardDeck("queen", 10));
		card.add(new cardDeck("king", 10));
}
}
