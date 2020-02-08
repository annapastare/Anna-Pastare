package lv.anna.inputoutput;

import java.io.File;
import java.io.FileWriter;

public class TestCreateAndWriteFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		File fileObj = new File("newfile.txt");
	    FileWriter fw = new FileWriter(fileObj);
		if(fileObj.createNewFile()){
			System.out.println("File created: "+fileObj.getName());
		}else{
			System.out.println("File exists. ");
			fw.write("Check if it is working?");
			fw.append("\n String next line txt");
			fw.close();
			
			
		}
	}
}


	
