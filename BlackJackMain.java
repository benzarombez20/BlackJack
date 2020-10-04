
public class BlackJackMain {

	public static void main(String[] args) {
		
		
		Card a=new Card();
		System.out.println(a.toString());
		Deck b=new Deck();
		System.out.println(b.toString());
		b.shuffle();
		System.out.println(b.toString());
//		System.out.println(b.draw());
		Hand c=new Hand(b);
		Hand d=new Hand(b);
		System.out.println(c);
		System.out.println(d.toString());
		System.out.printf("%.1f%%", 12.78);
	}

}
