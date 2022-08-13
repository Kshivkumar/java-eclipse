package com.xworkz.program;

public class CharPirates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character ch = new Character('D');
		System.out.println(ch);

		// charValue()

		Character c = ch.charValue();
		System.out.println(c);

		// compareTo(Character anotherCharacter)
		int c1 = ch.compareTo('9');
		System.out.println(c1);

		// equals(Object obj)
		boolean c2 = ch.equals(true);
		System.out.println(c2);

		// hashCode()
		int c3 = ch.hashCode();
		System.out.println(c3);

		// toString()
		String c4 = ch.toString();
		System.out.println(c4);

		// codePointAt(CharSequence seq, int index)
		int ab = Character.charCount(4);
		System.out.println(ab);

		int ab1 = Character.compare('A', 'B');
		System.out.println(ab1);

		char ab2 = Character.toUpperCase('e');
		System.out.println(ab2);

		char ab3 = Character.toTitleCase('s');
		System.out.println(ab3);

		// isDigit(char ch)
		boolean ab4 = Character.isDigit('p');
		System.out.println(ab4);

		// getDirectionality(int codePoint)
		byte ab5 = Character.getDirectionality('y');
		System.out.println(ab5);

		// isAlphabetic(int codePoint)\
		boolean ab6 = Character.isAlphabetic('u');
		System.out.println(ab6);

		// isISOControl(char ch)
		boolean ab7 = Character.isISOControl('k');
		System.out.println(ab7);
		
	//	codePointAt(char[] a, int index)
		char[] gf= {'I','L','U'};
		int abc=2;
       int ab8=Character.codePointAt(gf,abc);
       System.out.println(ab8);
	}

}