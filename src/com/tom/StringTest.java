package com.tom;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		String s = "abc";
		String s2 = "abc";
		System.out.println(s==s2);
		String s3 = new String ("abc");
		String s4 = new String("abc");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		String fruit = "banana";
		System.out.println(fruit.substring(2));
		System.out.println(fruit.substring(5));
//                  01234567890
		String g = "Hello World";
		System.out.println(g.substring(0));
		System.out.println(g.substring(1,6));
	

		char ch[] =g.toCharArray();  
		for (int i=g.length()-1; i>=0;i--) {  
		System.out.print(g.charAt(i));
		
		}
		
		System.out.println();
//                  0123456789012
		String n = "Jack Tom Eric";
		System.out.println(n.lastIndexOf("c"));
		String name = "Tom";
		int index = n.indexOf(name);
		System.out.println(index);
		System.out.println(n.substring(0, index)+"boss"+n.substring(index + name.length()));
	}

//		String change = "boss";  
//		if (n.indexOf("Tom")!=-1){
//			int num = n.indexOf("Tom");
//			String getData = n.substring(num,num+3)	;
//			String last= n.substring(0,num)+change+n.substring(num+3,n.length());
//			System.out.println(last);
//		}		
		{int nn = Integer.parseInt("12");
		float f = Float.parseFloat("55.3");
		nn++;
		System.out.println(nn);
		
}
}

	