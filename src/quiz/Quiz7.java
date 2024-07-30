package quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Quiz7 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Iterator<Integer> iterator = set.iterator();
		
		try {
			
			int num1 = iterator.next();
			int num2 = iterator.next();
			int num3 = iterator.next();
			int num4 = iterator.next(); //set에 더이상 꺼낼 요소가 없어서 에러남.
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("정상?");
	}

}
