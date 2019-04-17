package day17;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LottoExam {

	public static void main(String[] args) {
		//1.  번호들을 생성
		//1.1 로또 당첨 번호를 생성 7
		//1.2 로또 자동 번호를 생성 6
		//2.  당첨번호와 자동 번호를 비교해서 등수
		//2.1 당첨번호와 자동번호를 비교하여 일치하는 갯수확인
		//2.2 보너스 일치여부 확인
		//2.3 등수 출력
		int min = 1, max = 45;
		List<Integer> lotto = randomArr(min,max,7);
		List<Integer> list = randomArr(min,max,6);
		System.out.println(lotto);
		System.out.println(list);
		System.out.println(countList(lotto, list));
		printRank(lotto, list);
	}
	/* 기능 : min,max가 주어지면 해당 범위에서 중복되지 않는 랜덤한 수를
	 *       count갯수만큼 생성하여 리스트로 반환하는 메소드
	 * 매개변수 : int min, int max, int count
	 * 리턴타입 : List
	 */
	public static List<Integer> randomArr(int min, int max,
			int count){
		//생성할 수 있는 숫자의 범위보다 만들어야 하는 갯수가 더 크면
		//중복될수 밖에 없기 때문에 무한루프에 빠지는 경우가 생기것을
		//막기위한 코드
		if(max-min+1 < count)
			return null;
		Set<Integer> set = new HashSet<Integer>();
		//count개만큼 생성하기 위한 조건식
		while(set.size()<count){
			//min~max사이의 랜덤한 수를 생성하여 num에 저장
			int num = (int)(Math.random()*(max-min+1))+min;
			//랜덤한 num를 set에 추가
			set.add(num);
		}
		//Set으로 저장되어 있는 데이터들을 List 데이터들로 변환
		//여기서 Set을 List로 바꾸는 이유는 Set에는 
		//원하는 번지에 직접 접근할 수 있는 메소드가 없기 때문에
		//List로 변환하여 List에 있는 get()을 이용하여 직접 접근하게 하기위해
		//변환시킴
		//Set을 이용해서도 가능하긴 하지만 조금 복잡하기 때문에 그냥
		//List로 바꾸었다
		List<Integer> list = new LinkedList<Integer>(set);
		
		return list;
	}
	/* 기능 : 로또 당첨번호들와 번호들이 주어지면 보너스 번호를 제외하고 일치하는
	 *       갯수가 몇개인지 알려주는 메소드
	 * 매개변수 : 당첨번호들=>List<Integer> lotto
	 *         번호들=>List<Integer> list
	 * 리턴타입 : 갯수=>int
	 * 메소드명 : countList      
	 * */
	public static int countList(List<Integer> lotto,
			List<Integer> list){
		//첫번째 매개변수가 당첨번호가 되어야 하는데 당첨번호가 아닌
		//번호가 오면 -1을 리턴후 종료
		if(lotto.size()<list.size())
			return -1;
		int count = 0;
		//lotto에서 원소(번호)를 하나 꺼내서 꺼낸 원소가 list에 있는지 없는지
		//확인하여 있으면 count를 증가, 없으면 아무것도안함
		//당첨번호에서 보너스 번호를 제외하기 위해서 조건식에
		//lotto.size()가 아닌 list.size()를 이용한다
		for(int i=0; i<list.size(); i++){
			if(list.contains(lotto.get(i))){
				count++;
			}
		}
		return count;
	}
	public static void printRank(List<Integer> lotto,
			List<Integer> list){
		//보너스 번호를 제외한 일치하는 갯수
		int count = countList(lotto, list);
		int rank = 0;
		//보너스 번호
		int bonusNum = lotto.get(lotto.size()-1);
		//보너스 번호와 일치하는 번호가 있는지 없는지
		boolean checkBonus = list.contains(bonusNum); 
		
		switch(count){
		case 6:	rank=1; break;
		//조건선택연산자
		//조건식?참:거짓;
		case 5: rank=checkBonus?2:3; break;
		case 4: rank=4; break;
		case 3: rank=5; break;
		default: rank=-1;
		}
		if(rank>0)
			System.out.println(rank+"등 당첨!!");
		else
			System.out.println("꽝!!");
	}
}
