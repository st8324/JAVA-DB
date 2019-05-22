package example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exam4 {

	public static void main(String[] args) {
		boolean s1=false,s2 = false;
		int cnt = 0;
		while( !(s1 || s2)){
			CardPack cp = new CardPack();
			ArrayList<Card> user = new ArrayList<Card>();
			ArrayList<Card> dealer = new ArrayList<Card>();
			for(int i=1; i<=7; i++){
				user.add(cp.give());
				dealer.add(cp.give());
			}
			
			//System.out.println(PockerRule.pare(user));
			s1 = PockerRule.straight(user) == 3;
			System.out.println(s1);
			System.out.println(user);
			
			//System.out.println(PockerRule.pare(dealer));
			s2 = PockerRule.straight(dealer) == 3;
			System.out.println(s2);
			System.out.println(dealer);
			cnt++;
		}
		System.out.println(cnt);
	}
}

class PockerRule{
	/* 기능 : 페어를 찾는 메소드
	 * 매개변수 : 카드 리스트
	 * 리턴타입 : 0 : 페어없음, 1 : 원페어, 2 : 투페어(페어가 2개이상)
	 * */
	public static int pare(ArrayList<Card> list){
		int pareCnt = 0; //페어의 갯수
		for(int i=0; i<list.size(); i++){
			int cnt = 0;	//같은 숫자의 갯수
			for(int j=0; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == 2){
				pareCnt++;
			}
		}
		return pareCnt/2;
	}
	// 0:스트레이트 아님, 1 : 스트레이트, 2 : 백스트레이트, 3:마운틴
	public static int straight(ArrayList<Card>list){
		//카드 리스트를 정렬 
		Collections.sort(list, new Comparator<Card>(){
			@Override
			public int compare(Card c1, Card c2) {
				return c1.getNum()  - c2.getNum();
			}
		});
		boolean flag = false; //1이 있는지 체크하는 변수
		boolean isStraight = false;
		for(int i=0; i<list.size()-3; i++){
			int straightCnt = 1;
			int std = list.get(i).getNum();
			if(std == 1){
				flag = true;
			}
				
			for(int j=i+1; j<list.size(); j++){
				if(std+straightCnt == list.get(j).getNum()){
					straightCnt++;
				}else if(std+straightCnt-1 
						== list.get(j).getNum()){
					continue;
				}else{
					break;
				}
			}
			//마운틴의 경우, 10,j,q,k
			if(straightCnt == 4 && std == 10 && flag){
				return 3;
			}
			if(straightCnt >= 5 && std == 1 ) return 2;
			if(straightCnt >= 5 ) isStraight = true; 
		}
		if(isStraight){
			return 1;
		}
		return 0;
	}
}

class CardPack{
	private ArrayList<Card> list = new ArrayList<Card>();
	
	public CardPack(){
		cardPackSetAll();
		shuffle();
	}
	/* 기능 : 모양이 주어지면 해당 모양의 1번카드부터 K카드까지 팩에 추가 */
	private void cardPackSet(String shape){
		for(int i=1; i<=13; i++){
			Card c = new Card();
			c.setNum(i);
			c.setShape(shape);
			list.add(c);
		}
	}
	public void cardPackSetAll(){
		list.clear();
		cardPackSet("S");
		cardPackSet("C");
		cardPackSet("H");
		cardPackSet("D");
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
	public Card give(){
		if(list.size() != 0){
			Card c = new Card(list.get(0));
			list.remove(0);
			return c;
		}else{
			return null;
		}
	}
}










class Card{
	private int num;
	private String shape;
	public int getNum() {
		return num;
	}
	public String getShape() {
		return shape;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	@Override
	public String toString() {
		String s = new String();
		if(shape.equals("S")){
			s += "♠";
		}else if(shape.equals("H")){
			s += "♥";
		}else if(shape.equals("C")){
			s += "♣";
		}else if(shape.equals("D")){
			s += "◆";
		}
		
		if(num == 11)	s+="J";
		else if(num == 12)	s+="Q";
		else if(num == 13)	s+="K";
		else
			s+=num;
		return s;
	}
	public Card(){}
	public Card(Card c){
		this.num = c.num;
		this.shape = c.shape;
	}
}



