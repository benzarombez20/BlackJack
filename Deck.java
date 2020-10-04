import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> Deck= new ArrayList<Card>();


	public Deck() {
		for(int i=2;i<15;i++) {
			Deck.add(new Card(i,"Clubs"));
		}
		for(int i=2;i<15;i++) {
			Deck.add(new Card(i,"Diamonds"));
		}
		for(int i=2;i<15;i++) {
			Deck.add(new Card(i,"Clovers"));
		}
		for(int i=2;i<15;i++) {
			Deck.add(new Card(i,"Hearts"));
		}
	}
	public void shuffle() {
		Random r=new Random();
		
		for(int i=0;i<52;i++) {
			Card a=new Card(Deck.get(i));
			Deck.remove(i);
			Deck.add(r.nextInt(52),a);
		}
	}
	public Card draw() {
		Card a=new Card(this.Deck.get(0));
		Deck.remove(0);
		return a;
	}
	
	public String toString() {
		String list=Deck.toString();
		return list;
	}
}

