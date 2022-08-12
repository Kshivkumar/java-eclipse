package com.xworkz.program;

public class BooleanPirates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean bull=new Boolean(true);
		boolean s1=bull.booleanValue();
		System.out.println(s1);
		
		int s2=bull.compareTo(true);
		System.out.println(s2);
		
		//compare(boolean x, boolean y)
		int r1=bull.compare(s1, s1);
		System.out.println(r1);
		
		Boolean tt1=Boolean.valueOf("tree");
		System.out.println(tt1);
		
		//getBoolean(String name)
		Boolean tt2=Boolean.getBoolean("ring");
		System.out.println(tt2);
		
		//hashCode(boolean value)
		int tt3=bull.hashCode();
		System.out.println(tt3);
		
		//equals(Object obj)
		boolean tt4=bull.equals(true);
		System.out.println(tt4);
		
		//toString()
		String tt5=bull.toString();
		System.out.println(tt5);
		
		//parseBoolean(String s)
		boolean tt6=bull.parseBoolean("gigi");
		System.out.println(tt6);
		
		//logicalAnd(boolean a, boolean b)
		boolean tt7=bull.logicalAnd(true,false);
		System.out.println(tt7);
		
		//logicalOr(boolean a, boolean b)
		boolean tt8=bull.logicalOr(false,true);
		System.out.println(tt8);
		
		//logicalXor(boolean a, boolean b)
		boolean tt9=bull.logicalXor(true,true);
		System.out.println(tt9);
		
		//valueOf(String s)
		boolean tt10=bull.valueOf("zyan");
		System.out.println(tt10);
		
		//valueOf(boolean b)
		boolean tt11=bull.valueOf(true);
		System.out.println(tt11);
		
		
		

	}

}
