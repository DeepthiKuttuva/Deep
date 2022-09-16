package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileReader fr=null;
		FileReader fr= new FileReader("C:\\Users\\venka\\Desktop\\deep.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());

	}

}
