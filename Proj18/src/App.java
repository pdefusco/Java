import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");

		// FileReader fr;
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			
			br.write("this is line 1");
			br.newLine();
			br.write("This is line 2");
			br.newLine();
			br.write("Last line");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Can't find file" + file.toString());
		}

	}
}