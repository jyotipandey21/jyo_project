package Aaa;

public class hashstring {

	public static void main(String[] args) {
	
		String blogName = "howtodoinjava.com"; 
		
        System.out.println( blogName.hashCode() );
        System.out.println( blogName.hashCode() );
         
        System.out.println( "hello world".hashCode() );
        
        String text = "Lorem Ipsum23 is simply dummy text";
        String xyz=text.replaceAll("^[1-9]", "");
        //System.out.println(xyz);
        
        
        String a="jyoti ishfd dhdh";
        String substring = a.substring(5);
        String substring1 = a.substring(3, 10);
        System.out.println(substring);
        System.out.println(substring1);
        System.out.println(substring1.length());
	}

}
