package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openFile();
			System.out.println("File opened");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Could not open file");
		}
	}

	public static void openFile() throws FileNotFoundException{
		File file = new File("test.txt");
		
		FileReader fr = new FileReader(file);	
	}
}
