package main;

public class Ex2 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		arr[5] = 5; //에러남(index 범위를 벗어남)

		// 에러는 위에서 났지만 그 이후의 프로그램 전부 작동x
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
// 결과: 에러발생!
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		at Project14/main.Ex2.main(Ex2.java:9)
		
		
		
	}

}
