package nl.siegmann.epublib;


import nl.siegmann.epublib.domain.Author;
import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.domain.Resource;
import nl.siegmann.epublib.domain.Spine;
import nl.siegmann.epublib.domain.SpineReference;
import nl.siegmann.epublib.domain.TOCReference;
import nl.siegmann.epublib.epub.EpubReader;
import nl.siegmann.epublib.epub.EpubWriter;
import nl.siegmann.epublib.viewer.Viewer;
import java.io.BufferedReader;
import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import javax.naming.Context;





public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}


	
	
    public static void main( String[] args )
    {
    	
		/*Book book = new Book();
		book.getMetadata().addTitle("Epublib test book 1");
		book.getMetadata().addAuthor(new Author("Joe", "Tester"));
		EpubWriter epubWriter = new EpubWriter();
		try {
			epubWriter.write(book, new FileOutputStream("test1_book1.epub"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EpubReader epubReader = new EpubReader();
		*/
    	
    	System.out.println("file url location: "+new java.io.File("").getAbsolutePath());
    	System.out.println("file url location: "+new java.io.File("").getPath());
    	App object1=new App();
        //object1.read();
    	File f1 = new File("books.dat");
    	if(f1.exists()){ 
    		System.out.println("exists");
    	}else {
    		System.out.println("not exists");
    		try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    		System.out.println("created file");
	
    		EpubReader epubReader = new EpubReader();
    		
    		/*try {
    			Book book = epubReader.readEpub(new FileInputStream("igp-widget-world-v2.epub"));
    			//List<String> titles = book.getMetadata().getTitles();
    			//System.out.println("book title:" + (titles.isEmpty() ? "book has no title" : titles.get(0)));
    		} catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}	*/
    		
    		
    	  	
        	try {
    			Book book = epubReader.readEpub(new FileInputStream("GeographyofBliss_oneChapter.epub"));
    			List<String> titles = book.getMetadata().getTitles();
    			
    			System.out.println("book title:" + (titles.isEmpty() ? "book has no title" : titles.get(0)));
    			Viewer v;  			
    			v=new Viewer(book);
    			
    			
    			///System.out.println(book.getTableOfContents());
    			///System.out.println(book.getTableOfContents());
    			///Spine spine = book.getSpine();
    			///System.out.println(spine);
    			///System.out.println(spine.getSpineReferences());
    			///book.generateSpineFromTableOfContents();
    			System.out.println("a");
    			///System.out.println(book.getSpine().size());
    			System.out.println(book.getSpine().getResource(0));
    			//////setCurrentSpinePos
    			/////gotoLastSpineSection
    			List<String> spineElements;
    			List<SpineReference> spineList;
    			Spine spine = book.getSpine();
    			spineList = spine.getSpineReferences();
    			
    			
    			    			  
    			
    			
    		} catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        	
    		try {
    			FileInputStream fin;
    			fin = new FileInputStream(f1);
    			BufferedReader br = new BufferedReader(new InputStreamReader(fin));
    			String line = null;
    			List<String> li=new LinkedList<String>();
    			try {
    				while ((line = br.readLine()) != null) {
    					System.out.println("output list entries beneath");
    					System.out.println(line);
    					li.add(line);
    					
    				}
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			
    		} catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
	
	
    }
	
}
