package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex8 {

	public static void main(String[] args) {

		//메소드를 호출하는 쪽에서 예외처리를 해야함
		try {
			openTextfile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void openTextfile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("src/main/a.txt");
	}
	
}
