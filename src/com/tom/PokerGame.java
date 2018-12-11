package com.tom;

import java.util.Random;
import java.util.Scanner;

public class PokerGame {

	public static void main(String[] args) {
		int[] n = new int [10];
		Card[] c = new Card[10];
		System.out.println(n[0]);
		c[0] = new Card(7);
		System.out.println(c[0].get());
		
		
		Poker poker = new Poker();
		poker.shuffle();
		poker.print();
		
		
		
		/*int []nums = new int [5];
		nums [0]= 98;
		nums [4]= 78;
		System.out.println(nums[0]);
		System.out.println(nums.length);
		for (int i = 0;i<nums.length;i++){
			System.out.print(nums[i]);
		}*/
		
		
//		Scanner scanner = new Scanner(System.in);
//		Random random = new Random();
//		int secret = random.nextInt(13)+1;
//		int flower = random.nextInt(4);
//		
//		/*char[]A = {'S','H','D','C'};
//		Random k = new Random();
//		int kind = k.nextInt(4+1);
//		System.out.println(A [kind]);*/
//		char c = 0;
//		System.out.print(secret);
//		switch(flower){
//		
//			case 0: 
//				c ='S';
//				break;
//			case 1:
//				c='H';
//				break;
//			case 2 : 
//				c = 'D';
//				break;
//			case 3:
//				c = 'C';
//				break;
//				
//			}
	}
}

	


