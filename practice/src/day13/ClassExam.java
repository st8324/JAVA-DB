package day13;

import java.util.Scanner;

import day12.Student;
import day12.StudentManager;

public class ClassExam {

	public static void main(String[] args) {
		//StudentManager의 객체 멤버 메소드 printMenu를 호출
		//>> StudentManager 객체를 생성해야한다
		StudentManager mng = new StudentManager();
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		
		do{
			mng.printMenu();
			menu = scan.nextInt();
			Student s;
			switch(menu){
			case 1:
				System.out.println("추가할 학생 정보를 입력하세요.");
				s = mng.inputStudent(scan);
				mng.insert(s);
				break;
			case 2:
				System.out.println("수정할 학생 정보를 입력하세요.");
				s = mng.inputStudent(scan);
				mng.modify(s);
				break;
			case 3:	
				System.out.println("삭제할 학생 정보를 입력하세요.");
				s = mng.inputSearchStudent(scan);
				mng.delete(s);
				break;
			case 4:	
				System.out.println("----학생정보 출력----");
				mng.print();			break;
			case 5:	
				System.out.println("프로그램을 종료합니다.!!!");
				break;
			default:
				System.out.println("잘못된 메뉴");
			}
			
		}while(menu != 5);
		/*for( ;menu != 5 ;){
			mng.printMenu();
			menu = scan.nextInt();
		}*/
		/*while(menu!=5){
			mng.printMenu();
			menu = scan.nextInt();
		}*/
		scan.close();
	}
}
