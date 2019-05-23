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
			//s1 = PockerRule.straight(user) == 3;
			//s1 = PockerRule.flush(user);
			s1 = PokerRule.straightFlush(user) >= 1;
			//s1 = PokerRule.poker(user);
			System.out.println(s1);
			System.out.println(user);
			
			//System.out.println(PockerRule.pare(dealer));
			//s2 = PockerRule.straight(dealer) == 3;
			//s2 = PockerRule.flush(dealer);
			s2 = PokerRule.straightFlush(dealer) >= 1;
			//s2 = PokerRule.poker(dealer);
			System.out.println(s2);
			System.out.println(dealer);
			cnt++;
		}
		System.out.println(cnt);
	}
}

class PokerRule{
	private static int sameCnt(ArrayList<Card> list, int count){
		int sCnt = 0; //페어의 갯수
		for(int i=0; i<list.size(); i++){
			int cnt = 0;	//같은 숫자의 갯수
			for(int j=0; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == count){
				sCnt++;
			}
		}
		return sCnt/count;
	}
	/* 기능 : 페어를 찾는 메소드
	 * 매개변수 : 카드 리스트
	 * 리턴타입 : 0 : 페어없음, 1 : 원페어, 2 : 투페어(페어가 2개이상)
	 * */
	public static int triple(ArrayList<Card> list){
		return sameCnt(list,3);
	}
	public static int pare(ArrayList<Card> list){
		return sameCnt(list,2);
	}
	public static boolean poker(ArrayList<Card>list){
		if(sameCnt(list,4) == 1)
			return true;
		return false;
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
	public static String flush(ArrayList<Card> list){
		int sCnt = 0;//스페이스 갯수
		int cCnt = 0;//클로버 갯수
		int hCnt = 0;//하트 갯수
		int dCnt = 0;//다이아 갯수
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getShape().equals("S")) sCnt++;
			else if(list.get(i).getShape().equals("H")) hCnt++;
			else if(list.get(i).getShape().equals("D")) dCnt++;
			else if(list.get(i).getShape().equals("C")) cCnt++;
		}
		if(sCnt >= 5 )	return "S";
		if(cCnt >= 5 )	return "C";
		if(dCnt >= 5 )	return "D";
		if(hCnt >= 5 )	return "H";
		return null;
	}
	public static boolean fullHouse(ArrayList<Card>list){
		if(pare(list)>=1 && triple(list) == 1)
			return true;
		if(triple(list) == 2)
			return true;
		return false;
	}
	/*  0 : 아님
	 *  1 : 스티플
	 *  2 : 백스티플
	 *  3 : 마운틴
	 */
	public static int straightFlush(ArrayList<Card>list){
		String s=flush(list);
		ArrayList<Card> tmp = new ArrayList<>();
		//카드리스트가 플러시가 아니면 스티플를 더이상 비교할 필요가 없다.
		if(s == null)
			return 0;
		//카드 리스트를 복사 => 플러시가 아닌 카드들을 제거해야하기 때문에
		tmp.addAll(list);
		//플러시가 아닌 카드들을 제거
		//시작 : 0 마지막 : 6 증감연산자 : ++
		//시작 : 6 마지막 : 0 증감연산자 : --
		for(int i=tmp.size()-1; i>=0; i--){
			if(!tmp.get(i).getShape().equals(s)){
				tmp.remove(i);
			}
		}
		return straight(tmp);
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
			s += "♡";
		}else if(shape.equals("C")){
			s += "♣";
		}else if(shape.equals("D")){
			s += "◇";
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



