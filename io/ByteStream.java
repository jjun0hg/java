package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt"))); 
		int data;
		while((data = bis.read()) != -1) {// int에서 마지막 -1 , 객체에서 null
			System.out.print((char)data);
		}
		System.out.println();
		
	}
}
