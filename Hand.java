import java.util.ArrayList;

public class Hand {

	private ArrayList<Card> Hand= new ArrayList<Card>();
	private int value;
	boolean bust=false;

	public Hand(Deck a){
		this.Hand.add(a.draw());
		this.value=this.calcValue();
		this.bust=false;
	}



	public ArrayList<Card> getHand() {
		return Hand;
	}
	
	public void setHand(ArrayList<Card> hand) {
		Hand = hand;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean getBust() {
		return this.bust;
	}
	
	public int calcValue(){
		int sum=0;
		for(Card a:Hand) {
			sum+=a.getNumber();
		}
		this.setValue(sum);
		return this.getValue();

	}

	public String toString() {

		return Hand.toString()+" "+this.getValue();
	}
	public void checkBust() {
		if(this.getValue()<22) {
			this.bust=false;
		}
		this.bust=true;
	}



}
