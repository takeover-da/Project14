package quiz;

public class Quiz3 {

	public static void main(String[] args) {

		try {
			Object obj = new Integer(0);
			String str = (String) obj; //잘못된 타입으로 형변환됨..
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 작동합니다.");
		
	}

}
