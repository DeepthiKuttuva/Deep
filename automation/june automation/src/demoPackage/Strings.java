package demoPackage;

public class Strings {
	

	public static void main(String[] args) {
		char ch[]= {'e','t','m','n'};
		
		// TODO Auto-generated method stub
System.out.println(ch[3]);
String s="Hello";
String s1=" world";
String s3="My name is Deepthi";
System.out.println(s);
System.out.println(s.toLowerCase());
System.out.println(s.toUpperCase());
String s2=new String (ch);

System.out.println(s2);
System.out.println(s.equals(s2));
System.out.println(s.concat(s1));
System.out.println(s.replace("H" ,"F"));
System.out.println(s3.replace("Deep", "Pree"));
System.out.println(s3.replace("e", "i"));
System.out.println(s3.replace("My name is Deepthi","I have two kids"));
System.out.println(s3.substring(1,6));
char c[]= {'d','e','e','p'};
String s4=new String(c);
System.out.println(s4);
String s5="";//even if little space between quotes also gives error
System.out.println(s5.isEmpty());
int a[]=new int[5];
a[0]=9;
a[1]=0;
a[2]=1;a[3]=2;a[4]=4;
for(int i=0;i<a.length;i++) {
	

System.out.println(a[i]);}
String t="   Hello  World   ";
System.out.println(t.trim());
System.out.println(s.contains(s1));
char ch1[]= {'q','w','e','r','t','y'};
String st=new String(ch1);
System.out.println(st);
int b[]=new int [4];
b[0]=12;b[1]=23;b[2]=34;b[3]=90;
for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);
	
}
String l="United States of America";
System.out.println(l.toLowerCase());
}
}