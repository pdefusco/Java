package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");

		try {
			FileReader fr = new FileReader(file);
			
			System.out.println("Continuing......");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not founf: " + file.toString());
		}
		System.out.println("Finished");
	}

}
