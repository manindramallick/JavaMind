package caveprogram8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class FileProcessor implements Callable<List<String>>{

	 private String line;
	 
	 public FileProcessor(String line) {
		 this.line = line;
	 }

	public List<String> call() throws Exception {
		List<String> listOfLines = null;
		if(listOfLines == null) 
			listOfLines = new ArrayList<>();
		    System.out.println("Threads :: Line "+Thread.currentThread().getName()+":::"+line);
			listOfLines.add(line);
		return listOfLines;
	}

}
