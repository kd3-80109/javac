package Assignment_07_4;

public class NoOfString {
public static void main(String[] args) {
		
		String s1="India is my country";
		s1.trim();
		String[] words=s1.split(" ");
		System.out.println("Number of words in string:"+s1+"-"+words.length);
	}


}
