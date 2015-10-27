package demo3;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		
		FileReader fr = new FileReader(file);
		
	}

}
