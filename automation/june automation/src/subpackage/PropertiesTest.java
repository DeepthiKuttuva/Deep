package subpackage;
import java.util.*;
import java.io.*;

public class PropertiesTest {
static void method() throws Exception{
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("db properties");
		Properties p=new Properties();
		p.load(reader);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));

	}

}
