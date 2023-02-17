package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException {
		PersonDTO dto = new  PersonDTO("홍길동", 25, 185.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(dto);
		oos.close();
		
		//파일의 내용을 읽어오기
		
	}
	
}
