package day18;

public class EnumExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniversityStudent std1 
			= new UniversityStudent(Gender.MALE, Grade.ETC,
					Major.COMPUTER, "전일규",2019160135);
		System.out.println(std1);
		std1.setUniversityName("그린");
		std1.setAverage(3.5);
		System.out.println(std1);
	}
}
