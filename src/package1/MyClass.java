package package1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) throws IOException {

		FileWriter fo = new FileWriter("input");
		if (fo != null) {
			System.out.println("file has been created and opened in write mode");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input: ");

		String fileinput = sc.nextLine();

		// convert char into bytes
	//	byte b[] = fileinput.getBytes();
		fo.write(fileinput);
		System.out.println("Write operation completed!");
		fo.close();

	}

}
