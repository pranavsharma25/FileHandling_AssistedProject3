package package1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyClass2 {
	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream("input");
		if (fi != null) {
			System.out.println("File exists!");
		}
		int i=0;
	while((i=fi.read())!=-1){
		System.out.print((char)i);
	}

	}

}
