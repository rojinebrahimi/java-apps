package wordfinder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IOFile {

	// FileRedaer/Writer Method
	// ---------------------------------------------------
	public String IOfile(String inputWords) {
		HashMap<String, String> map = new HashMap<String, String>();
		HashSet<String> set = new HashSet<>();
		String line="";
		try {
			FileReader fr = new FileReader("D:\\Eclipse\\WordFinder\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
		
			br.readLine();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String[] words = inputWords.split("\\s");
		for(String str : inputWords.split("\\s")) {
			set.add(str);
		}
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			for(int i = 0; i < words.length; i++) {
				if(s.equals(words[i])) {
					map.put(words[i], words[i].toUpperCase());
					words[i] = map.get(words[i]);
				
				}
			}
			
	
		for(String word:words) {
			line = line.replaceAll(word.toLowerCase(),word);
		}
		String context = String.join(" ", words);
		

		try {
			FileWriter fw = new FileWriter("D:\\Eclipse\\WordFinder\\Sample.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		System.out.println(line);
		return line;
}
}