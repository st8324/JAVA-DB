package day20;

import java.util.Scanner;

public class StdTest {

	public static void main(String[] args) {
		StdManager sMng = new StdManager();
		//학생 한명 정보를 만들고
		//학생 한명의 정보에 과목을 추가하고
		//평점을 확인
		//String name,String id,String sName,	String major, double avr
		/*Std std = new Std("홍길동","2019100100","서울대","컴퓨터",0.0);
		System.out.println(std);
		std.insertSbuject(new Grade("A+","세종대왕","한글",3));
		System.out.println(std);
		std.insertSbuject(new Grade("B","이순신","해상학",2));
		System.out.println(std);*/
		
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		do{
			//메뉴 출력
			sMng.printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			Std std;
			Std result;
			int subMenu;
			switch(menu){
			case 1:
				std = sMng.inputStd(scan);
				if(sMng.insert(std))
					System.out.println("학생정보를 추가 했습니다.");
				else
					System.out.println("이미 등록된 학번입니다.");
				break;
			case 2:
				/* 기존 : 학생 정보를 입력받고 학생정보를 추가
				 * 변경 : 2번 선택시 학생정보 수정 또는 과목 등록을 할 수 있게 한다.
				 */
				//메뉴 출력
				System.out.println("2-1.학생정보 수정");
				System.out.println("2-2.학생 수강과목 등록");
				System.out.print("서브 메뉴를 선택하세요(1 or 2) : ");
				//메뉴 선택
				subMenu = scan.nextInt();
				
				//선택된 메뉴에 따라 해당 기능 동작
				if(subMenu == 1){
					std = sMng.inputStd(scan);
					if(sMng.update(std))
						System.out.println("해당 학생 정보를 수정 했습니다.");
					else
						System.out.println("없는 학번입니다.");
				}else if(subMenu == 2){
					//과목 추가하는 기능 작성
					//검색할 학생 정보 입력 후 해당 학생 정보로 검색하여
					//==>기존 메소드로 구현 가능
					std = sMng.inputId(scan);
					result = sMng.search(std);
					
					//해당 학생정보가없으면 해당 기능 종료
					if(result == null){
						System.out.println("없는 학번입니다.");
						break;
					}
					//추가할 과목 정보를 입력하여 입력받은 과목을 통해 과목 객체 생성 
					//==> 새로운 메소드 구현(StdManager.inputId와 비슷)
					Grade grade = sMng.inputSubject(scan);
					//학생 객체에 과목 객체 추가 (Std.insertSbuject() 이용)
					result.insertSbuject(grade);
					//매니저에 학생정보 수정(StdManager.update()이용)
					sMng.update(result);
				}
				break;
			case 3: 
				std = sMng.inputId(scan);
				if(sMng.delete(std))
					System.out.println("해당 학생 정보를 삭제 했습니다.");
				else
					System.out.println("없는 학번입니다.");
				break;
			case 4:
				// 서브메뉴 출력
				// 1. 전체 학생 출력
				// 2. 학생 수강 과목 출력
				System.out.println("4-1.학생정보 전체 출력");
				System.out.println("4-2.학생 수강 과목 전체 출력");
				System.out.print("서브 메뉴를 선택하세요(1 or 2) : ");
				// 서브메뉴 선택 => 서브메뉴 입력
				subMenu = scan.nextInt();
				// 조건문을 서브메뉴가 1이면
				// 전체 학생 출력
				// 서브메뉴가 2이면
				// 학생정보 입력을 받아 객체로 만들고 
				// =>stdManager.inputId()
				// 만들어진 객체와 일치하는 학생의 정보를 가져온다.=>stdManager.search()
				// 해당 학생 객체의 수강 과목을 출력하고 =>std.printSubject()메소드 추가
				// 없으면 아무것도 안함
				if(subMenu == 1)	sMng.print();
				else if(subMenu == 2){
					std = sMng.inputId(scan);
					result = sMng.search(std);
					if(result == null){
						System.out.println("해당 학번 학생이 없습니다.");
					}else if(!result.printSubjects()){
						System.out.println("수강한 강의가 없습니다.");
					}
				}
				break;
			case 5: break;
			default:
				System.out.println("--------------------");
				System.out.println("잘못된 메뉴를 선택했습니다.");
				System.out.println("--------------------");
			}
		}while(menu != 5);
		System.out.println("프로그램 종료합니다.");
		scan.close();
		
	}

}
