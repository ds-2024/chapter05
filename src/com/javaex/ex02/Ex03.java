package com.javaex.ex02;

import java.io.BufferedReader;//속도 빨라지게
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;//글자 읽어서 해석
//inputStream : 번역. 

public class Ex03 {

	public static void main(String[] args) throws IOException{
		
		Reader fr = new FileReader("C:\\javaStudy\\MS949.txt");//tostream 에 해당하는 빨대
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			
		String str = br.readLine();
		
		if(str == null) {
			break;
		}
		System.out.println(str);
		
		}
		
	}

}
