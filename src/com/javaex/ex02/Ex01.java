package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.Writer;
import java.io.FileWriter;

public class Ex01 {
	
	public static void main(String[] args) throws Exception {
		
		
		Writer fw= new FileWriter("C:\\javaStudy\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교종이 떙떙떙");
		bw.newLine(); //줄바꿈 기호
		bw.write("어서모이자");
		bw.newLine(); //줄바꿈 기호
		bw.write("선생님이 우리를");
		bw.newLine(); //줄바꿈 기호
		bw.write("기다리신다");
		bw.close();
		
		
	}

}
