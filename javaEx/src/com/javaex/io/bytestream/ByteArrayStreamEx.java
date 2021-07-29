package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// 입력 소스
		byte[] source = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		// 출력 타겟
		byte[] target = null;
		
		System.out.println("입력:" + Arrays.toString(source));
		
		InputStream bis = null; // 입력스트림 출력스트림 만들고
		OutputStream bos = null;
		
		try {
		// 스트림 열기
			bis = new ByteArrayInputStream(source); // 소스 집어넣고
			bos = new ByteArrayOutputStream();
			
			int data = 0; // 입력 스트림으로부터 넘어오는 데이터 저장
			
			while((data = bis.read()) != -1) { // 더이상 읽을 데이터가 없으면 -1이 됌.
				System.out.println("Read Data:" + data);
				// 출력 스트림으로 전송
				bos.write(data);
			}
			target = ((ByteArrayOutputStream)bos).toByteArray(); 
			//(ByteArrayOutputStream)bos 변환후 .toByteArray()로 변환
			System.out.println("출력:" + Arrays.toString(target));
		} catch (IOException e){
			// IO 예외 처리
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			bos.close(); // 닫아줘야한다. 예외가 발생 > try-catch로 예외처리하기
			bis.close(); // 닫아줘야한다. 예외가 발생 > try-catch로 예외처리하기
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		

	}

}
