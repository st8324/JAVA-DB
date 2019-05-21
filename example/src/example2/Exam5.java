package example2;

import java.util.ArrayList;
import java.util.Collections;

public class Exam5 {

	public static void main(String[] args) {
		CardPack2 cp = new CardPack2();
		cp.shuffle();
		cp.show();
		System.out.println();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.show();
	}
}

class CardPack2{
	private ArrayList<Card2> list = new ArrayList<Card2>();
	
	public CardPack2(){
		cardPackSetAll();
	}
	/* 기능 : 모양이 주어지면 해당 모양의 1번카드부터 K카드까지 팩에 추가 */
	private void cardPackSet(Shape s){
		for(int i=1; i<=13; i++){
			Card2 c = new Card2();
			c.setNum(i);
			c.setShape(s);
			list.add(c);
		}
	}
	public void cardPackSetAll(){
		list.clear();
		cardPackSet(Shape.S);
		cardPackSet(Shape.C);
		cardPackSet(Shape.H);
		cardPackSet(Shape.D);
	}
	public void show(){
		for(int i=0; i<list.size();i++){
			System.out.print(list.get(i) + " ");
			if( (i+1)% 10 == 0){
				System.out.println();
			}
		}
	}
	public void shuffle(){
		Collections.shuffle(list);
	}
	public Card2 give(){
		if(list.size() != 0){
			Card2 c = new Card2(list.get(0));
			list.remove(0);
			return c;
		}else{
			return null;
		}
	}
}










class Card2{
	private int num;
	private Shape shape;
	public int getNum() {
		return num;
	}
	public String getShape() {
		switch(shape){
		case H:
			return "♥";
		case D:
			return "◆";
		case S:
			return "♠";
		case C:
			return "♣";
		}
		return null;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	@Override
	public String toString() {
		String s = new String();
		s += getShape(); 
		
		if(num == 11)	s+="J";
		else if(num == 12)	s+="Q";
		else if(num == 13)	s+="K";
		else
			s+=num;
		return s;
	}
	public Card2(){}
	public Card2(Card2 c){
		this.num = c.num;
		this.shape = c.shape;
	}
}
enum Shape{ H, D, S, C}


