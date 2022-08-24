package firstmock;

public class Occurrence {
	
	public static void main (String []artg)
	{
		
	String name4="Shivkumar";
	char cha='r';
	int count=0;
	for (int i=0; i<name4.length();i++)
	{
		if(name4.charAt(i)==cha)
			count++;
	}
	System.out.println(cha+"\t"+ "total is "+count);
	}
	}


