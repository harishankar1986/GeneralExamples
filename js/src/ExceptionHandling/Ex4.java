package ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex4 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\New folder\\hari.txt");
		FileReader fr = new FileReader(file);
		char[] a = new char[100];
		
		fr.read(a);
		for (char c:a) {
			System.out.print(c);
		}
	}
}
