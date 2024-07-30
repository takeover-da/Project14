package quiz;

public class Quiz4 {

	public static void main(String[] args) {

		try {
			
			String str = "1.23";
			//parseInt(): 문자열 -> 숫자변환
			int num = Integer.parseInt(str); //실수를 정수로 변환하려고 해서 에러남.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("정상작동합니다.");
		
	}

}
