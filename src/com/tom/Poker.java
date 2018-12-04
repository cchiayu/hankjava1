package com.tom;

public class Poker {
	
	int[]cards = new int[52];
	public Poker(){
		for(int i =  0;i<52;i++){
			cards[i] = i;
		}
		}

	public void print(){
		for(int i=0;i<52;i++){
		int flower = cards[i] / 13;
		char c = 0;
		switch(flower){
		case 0: 
			c ='C';
			break;
		case 1:
			c='D';
			break;
		case 2 : 
			c = 'H';
			break;
		case 3:
			c = 'S';
			break;
			
		
		}
		System.out.print(cards[i]%13+1 + " " + c +" ");
		if (i%13 == 12)
			System.out.println();
		}
		
	}

}
		
	