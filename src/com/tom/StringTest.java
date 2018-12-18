package com.tom;

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
		
		String g = "Hello World";
		System.out.println(g.substring(0));
	}

}
