package lv.anna.learnstring;

public class TestStringClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Index";
		String strClass = new String(str);
		System.out.println(str);
		System.out.println("String with like obj "+strClass);
		
		int stringLength = str.length();
		
		System.out.println(stringLength);
		
		System.out.println(str.charAt(0));
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "NotHello";
		
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s1);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		System.out.println(!s1.equals(s2));
		System.out.println(!s2.equals(s3));
		
		
String strObje = "start";
String checkObje = "start";
		
		if (strObje.equals(checkObje)){
			System.out.println("Race start");
		}else{
			System.out.println("Not start");
		}
		
		
		

	}

}
