package io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PersonDTO dto = new  PersonDTO("홍길동", 25, 185.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(dto);
		oos.close();
		
		//파일의 내용을 읽어오기
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		
		PersonDTO dto2 = (PersonDTO)ois.readObject(); //자식 = (자식)부모
		System.out.println("이름 = " + dto2.getName());
		System.out.println("나이 = " + dto2.getAge());
		System.out.println("키 = " + dto2.getHeight());
		ois.close();
	}
	
}
