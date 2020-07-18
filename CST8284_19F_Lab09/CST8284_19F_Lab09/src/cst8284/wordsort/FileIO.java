package cst8284.wordsort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class FileIO {
	private static int numberOfStringsLoaded;
	
	public static ArrayList<String> loadArrayListFromFile(File f){
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			ArrayList<String> res = new ArrayList<>();
			String str;
			while ((str = br.readLine()) != null) {
				res.add(str);
				numberOfStringsLoaded++;
			}
			br.close();
			return res; 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public static boolean fileExists(File f) {
		return f != null &&  f.exists() && f.isFile() && f.canRead();
	}
	public static String toStringFromArrayList(ArrayList<String> arStr) {
		String res = new String();
		for(String str : arStr) {
			res += str + "\n";
		}
		return res;
	}
	public static String toStringFileIO(File f) {
		return "File Name: "  + f.getName() + "\n" +
				"File Size: " + f.length() + "\n" +
				"File Last Modified: " +new Date(f.lastModified()).toString()+ "\n" +
				"Number of Strings retrieved: " + numberOfStringsLoaded;
				
	}
	
}
