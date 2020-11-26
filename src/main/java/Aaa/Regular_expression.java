package Aaa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_expression {

	public static void main(String[] args) {
		//regular expression
		String A="sss333sss";
		String regex="\\d";//for integer , otherwise s , otherwise [a-z] ,otherwise [A-z]
		String results="";
		
		Pattern P =Pattern.compile(regex);
		Matcher M =P.matcher(A);
		
		for(int i=0 ;i< A.length();i++) {
			if(M.find()) {
			results +=	M.group();
			}
			}
			int number=Integer.parseInt(results);
		
			System.out.println(number);
		}
		
//	String str = "ar   j    u   kl   ljl lkjlj";
//	String regex = "\\S";
//
//	Pattern pt = Pattern.compile(regex);
//	Matcher mt = pt.matcher(str);
//	String result = "";
//	for (int i = 0; i < str.length(); i++) {
//		if(mt.find()) {
//			result+=mt.group();
//		}
//	}
//	System.out.println(result);}
	
}



	


