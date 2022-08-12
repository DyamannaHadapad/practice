package com.xworkz.java.simple;

public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		Integer value = new Integer(a);
		System.out.println(value);

		String b = "101";
		Integer val = new Integer(b);
		System.out.println(val);

		byte s1 = value.byteValue();
		System.out.println(s1);

		int S2 = value.compareTo(5);
		System.out.println(S2);

		double s3 = value.doubleValue();
		System.out.println(s3);

		float c = value.floatValue();
		System.out.println(c);

		int d = value.hashCode();
		System.out.println(d);

		int e = value.intValue();
		System.out.println(e);

		short f = value.shortValue();
		System.out.println(f);

		long g = value.longValue();
		System.out.println(g);

		String h = value.toString();
		System.out.println(h);

		int a1 = Integer.bitCount(5);
		System.out.println(a1);

		int a2 = Integer.compare(10, 15);
		System.out.println(a2);

		int a3 = Integer.compareUnsigned(20, 30);
		System.out.println(a3);

		int a4 = Integer.hashCode(10);
		System.out.println(a4);

		int a5 = Integer.max(10, 15);// 15
		System.out.println(a5);

	}

}
