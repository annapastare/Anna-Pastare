package lv.anna.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TestChangeStringToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		String defaultStr = "Hello user userName";
		
		String lastStr = defaultStr.replace("userName", "");
		//Input user names from scanner input
		//Change text of output
		//Input user names from ArrayList
		
		System.out.println(defaultStr+"Anna");
		File file = new File("DefaultText.txt");
		Scanner sc = new Scanner(file);
		String stringFromTextFile = "";
		while(sc.hasNextLine()){
		stringFromTextFile = sc.nextLine();
		}
	//m.out.println("Check: "+stringFromTextFile);
		String lastString = stringFromTextFile.replace("userName", "");
		String userName = "Anna Pastare";
		File fileForUser =  new File(userName+"txt.");
		FileWriter fw = new FileWriter(fileForUser, true);
		fw.write(lastString+userName);
		fw.close();
		
			
		}
				

	}

