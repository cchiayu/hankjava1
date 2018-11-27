package hankjava1;

import java.util.Random;
import java.util.Scanner;

public class PokerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int secret = random.nextInt(13)+1;
		/*char[]A = {'S','H','D','C'};
		Random k = new Random();
		int kind = k.nextInt(4+1);
		System.out.println(A [kind]);*/
		System.out.print(secret);
		switch(random.nextInt(4+1)){
		char kind = S;
			case 1 : return S;
			case 2 : return H;
			case 3 : return D;
			case 4 : return C;
			
	}
		
	}
}
