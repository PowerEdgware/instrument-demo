package com.study;

import java.io.IOException;
import java.time.LocalDateTime;

public class Test {

	static {
		System.out.println("Hello World!");
	}
	public static void main(String[] args) {
		
		new Test().app();
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void app() {
		System.out.println("APP"+LocalDateTime.now());
	}
}
