package firstmock;

public class Pallindrome {
	
	public static void main(String[] args) {
		// How to check if a string is a palindrome?
		String movie = "madam";
		StringBuffer buffer = new StringBuffer(movie);
		buffer.reverse();
		String data = buffer.toString();
		if (movie.equals(data)) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not palindrome");
		}

	}
}


