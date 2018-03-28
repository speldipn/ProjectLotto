package com.speldipn.lotto;

import java.util.Random;

public class LottoMain {
	
	// 주석 테스트

	public static void main(String[] args) {
		/*
		 * Lotto 클래스
		 * 
		 * public int[] generate() : 
		 * 
		 */
		
		Lotto lotto = new Lotto();
		int[] array = lotto.generate(5);
		for(int data: array) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		array = lotto.generate();
		for(int data: array) {
			System.out.print(data + " ");
		}
		System.out.println();		
		
	}

}

class Lotto
{
	int count;
	
	public int[] generate() {
		return generate(6);
	}
	
	public int[] generate(int count) {		
		int[] result = new int[count];
		Random random = new Random();				
		
		for(int index = 0; index < count;) {			
			int number = random.nextInt(36)+1; // 1 ~ 36
			if(!isExist(number, result)) {
				result[index] = number;
				index = index + 1;
			}
		}
		
		return result;
	}
	
	public boolean isExist(int number, int[] array) {
		boolean result = false;
		for(int value : array) {
			if(number == value) {
				result = true;
			}
		}
		
		return result;
	}
	
}
