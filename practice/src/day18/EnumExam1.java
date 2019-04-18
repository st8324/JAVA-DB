package day18;


public class EnumExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card();
		System.out.println(c.kind);
		c.kind = Card.Kind.CLOVER;
		System.out.println(c.kind.ordinal());
		System.out.println(c.kind.name());
	}

}
class Card{
	public enum Kind {
		SPACE(1), CLOVER(2), HEART(3), DIA(4);
		private final int value;
		Kind(int value) { this.value = value;}
		public int getValue(){return value;}
	}
	
	Kind kind = Kind.SPACE;

}





