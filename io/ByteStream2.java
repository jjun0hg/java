package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) {
		try {
			File file = new File("data.txt");
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			int size = (int) file.length(); //파일 크기
			byte [] b = new byte[size];
			
			bis.read(b, 0, size); // 모든 데이터가 b로 들어간다.
			bis.close();
			System.out.println(b); // 주소나옴 
			System.out.println(new String(b)); //byte[] -> Stirng 변환
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
