package stringstuff;

public class StringPrac {

	public static void main(String[] args) {
		String text1 = new String("Hello world");
		String text2 = "Hello world";
		String text3 = "Hello"+" world";
		System.out.println(text1.length());
		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));
		String word = "aardvark";
		String other = "supercalifragilisticexpialidocious";
		System.out.println(word.compareTo(other));
	}

}
