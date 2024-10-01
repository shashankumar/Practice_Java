package com.sk;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C://Users//amusr//OneDrive//Pictures//Screenshots//Screenshot 2024-03-16 194811.png");
		int i = fis.available();
		System.out.println(i);
		byte[] arr = new byte[i];
		fis.read(arr);
		FileOutputStream fos = new FileOutputStream("C://Users//amusr//Downloads//Shashank//images//wedding.png");
		fos.write(arr);
		fis.close();
		fos.close();

	}

}
