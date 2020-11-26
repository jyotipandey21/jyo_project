package Aaa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class desire_expressio {

	public static void main(String[] args) {
		String content = "Some text";
		String patternString = ".*somestring.*";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(content);
		System.out.println(content);

	}

}
