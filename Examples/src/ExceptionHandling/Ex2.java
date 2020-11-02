package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
	
	 
	
	static void readText(String filepath) throws IOException {
		
		FileReader fr=null;
		try {
		File file = new File(filepath);
		fr= new FileReader(file);
		char[] a = new char[50];
		fr.read(a);
		
			for(int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
		
		}
		catch (FileNotFoundException e) {
			System.out.println("File is not in a given path");
		}
		catch (IOException e) {
			System.out.println("Unable tto read/write the content in text file");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of range");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			fr.close();
		}
	}
	
	public static void main(String[] args){ 
		try {
			readText("D:\\New folder\\hari.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


}
