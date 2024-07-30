package quiz;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		try {
			
			//nextInt는 정수값을 입력받는데 다른 타입의 값이 들어와서 에러남
			int num = scanner.nextInt(); //"abc"를 입력하세요!
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("혹시 정상?");
	}

}
