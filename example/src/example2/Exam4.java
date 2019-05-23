package example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exam4 {

	public static void main(String[] args) {
		boolean s1=false,s2 = false;
		int cnt = 0;
		while( cnt < 10){
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
			//s1 = PokerRule.straightFlush(user) >= 1;
			//s1 = PokerRule.poker(user);
			//s1 = PokerRule.top(user);
			//System.out.println(s1);
			System.out.println("유저 카드 :" + user);
			
			//System.out.println(PockerRule.pare(dealer));
			//s2 = PockerRule.straight(dealer) == 3;
			//s2 = PockerRule.flush(dealer);
			//s2 = PokerRule.straightFlush(dealer) >= 1;
			//s2 = PokerRule.poker(dealer);
			//s2 = PokerRule.top(dealer);
			//System.out.println(s2);
			System.out.println("딜러 카드 :" + dealer);
			int win = PokerRule.whoIsWin(user, dealer); 
			if(win == 1){
				System.out.println("유저 승리!");
			}else if(win == -1){
				System.out.println("딜러 승리!");
			}else{
				System.out.println("무승부!");
			}
			cnt++;
			System.out.println("-----------------------------");
		}
		System.out.println(cnt);
	}
}

