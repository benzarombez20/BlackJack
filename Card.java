
public class Card {

	private int number;
	private String sign;
	

	public Card() {
		this.number=2;
		this.sign="Clubs";


	}
	public Card(int number,String sign) {
		this.number=number;
		this.sign=sign;


	}
	public Card(Card a) {
		this.setNumber(a.getNumber());
		this.setSign(a.getSign());
	}


	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public int getValue() {
		if(this.getNumber()>10) {
			return 10;
		}
		else
			return this.getNumber();

	}

	public String toString() {
		switch (this.getNumber()) {
		case 11:
			return "Ace"+" "+this.getSign();

		case 12:
			return "Jack"+" "+this.getSign();
		case 13:
			return "Queen"+" "+this.getSign();
		case 14:
			return"King"+" "+this.getSign();
		default:
			return this.getNumber()+" "+this.getSign();

		}
	}



}
