import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

//Implementing iterable interface to use iterator

public class UrlLibrary implements Iterable<String> {
	
	private LinkedList<String> urls = new LinkedList<String>();
	
	//Using inner class
	private class UrlIterator implements Iterator<String>{

		private int index = 0; //would be initialized to null anyways
		
		@Override
		public boolean hasNext() {

			return index < urls.size();
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			
			StringBuilder sb = new StringBuilder();
			
			try {
				URL url = new URL(urls.get(index));
				
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
				String line;
				while ((line = br.readLine())!=null){
					sb.append(line);
					sb.append("\n");
				}
				
				br.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			index++;
			
			return sb.toString();
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			urls.remove(index);
		}
		
	}
	
	public UrlLibrary(){
		urls.add("http://corriere.it");
		urls.add("http://news.bbc.co.uk");
		urls.add("http://facebook.com");
	}
	
	//Obviously this method has to be implemented as part of the interface
	/*@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return urls.iterator();
	}*/
	@Override
	public Iterator<String> iterator(){
		return new UrlIterator();
	}
}
