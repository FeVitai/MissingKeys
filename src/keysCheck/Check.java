package keysCheck;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Check {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		BufferedReader pt = new BufferedReader(new FileReader("C:\\Users\\felip\\Desktop\\file\\pt.txt"));
		BufferedReader es = new BufferedReader(new FileReader("C:\\Users\\felip\\Desktop\\file\\es.txt"));
		String ptString, esString;

		List<String> ptList = new ArrayList<String>();
		List<String> esList = new ArrayList<String>();
		
		while ((ptString = pt.readLine()) != null) {
			ptList.add(ptString);
		}

		while ((esString = es.readLine()) != null) {
			esList.add(esString);
		}
		
		System.out.println("Pt List: " + ptList);
		System.out.println("Es List: " + esList);

		List<String> missingKeys = new ArrayList<>(ptList);
		missingKeys.removeAll(esList);

		System.out.println("Missing Keys: " + missingKeys);

	}
}
