package Strings;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome";
		String s1="  to java  ";
		System.out.println("The string length is:" +s.length());
		System.out.println("The concatination of two strings:" +s.concat(s1));
        System.out.println("Trimming the string "+s1.trim());
        System.out.println("comparing the values:"+s.equals("Welcome"));// compares the values and the strings are case sensitive\
        System.out.println("Ignoring the uppercase"+s.equalsIgnoreCase("WELCOME"));
        System.out.println("Position of characters "+s.charAt(4));
        System.out.println("Checking if the characters are present in string "+ s1.contains("ja"));
        System.out.println("Replacing the letters "+s.replace('e', 'o'));
        System.out.println("Replacing the words "+s1.replace("to java", "to selenium"));
        System.out.println(s.isEmpty());
        System.out.println("substring "+s.substring(0, 5));//starting index starts with zero and ending index starts with one)
        
        
	}

}
