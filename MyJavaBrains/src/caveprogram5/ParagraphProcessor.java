package caveprogram5;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;

public class ParagraphProcessor  implements Callable<List<String>>{

	private String text;
	
	public ParagraphProcessor(String text) {
		this.text=text;
	}
	
	public List<String> call() throws Exception {
	
		String word =null;
		List<String> words = null;
		if(words ==null) {
			words = new ArrayList<>();
		}
		try {
			
			StringTokenizer stringTokenizer = new StringTokenizer(text," ");
			while(stringTokenizer.hasMoreTokens()) {
				word = stringTokenizer.nextToken();
				words.add(word);
				
			}
			
		} catch (Exception e) {
			
		}
		
		return words;
	}

}
