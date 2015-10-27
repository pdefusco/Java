
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UrlLibrary urlLibrary = new UrlLibrary();
		
		//now that the class implements iterable, can use for each loop... directly on the object of the class!
		for(String html: urlLibrary){
			System.out.println(html.length());
			//System.out.println(html);
			
			
		}
	}

}
