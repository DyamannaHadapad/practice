package com.xworkz.java.simple;

public class BooleanConstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean s1 = new Boolean(true);
		System.out.println(s1);

		Boolean s2 = new Boolean("a");
		System.out.println(s2);

		boolean a = s1.booleanValue();
		System.out.println(a);

		int b = s1.compareTo(true);
		System.out.println(b);

		int c = s1.hashCode();
		System.out.println(c);

		String d = s1.toString();
		System.out.println(d);

		boolean e = s1.equals(a);
		System.out.println(e);

		int f = Boolean.compare(true, true);
		System.out.println(f);

		boolean g = Boolean.getBoolean("name");
		System.out.println(g);

		int h = Boolean.hashCode(false);
		System.out.println(h);

		boolean i = Boolean.logicalAnd(true, false);
		System.out.println(i);

		boolean j = Boolean.valueOf(true);
		System.out.println(j);
	}

}
