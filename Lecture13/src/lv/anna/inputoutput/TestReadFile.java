package lv.anna.inputoutput;

import java.io.*;

public class TestReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStream inputStream;
		OutputStream outputStream;
		int c;
		
		final int EOF = -1;
		
		outputStream = System.out;
		
		
		try {
			File inputFile = new File("Data.txt");
			inputStream = new FileInputStream(inputFile);
			
			try {
				while((c = inputStream.read())!= EOF){
					outputStream.write(c);
				}
				}catch (IOException e){
					System.out.println("Error: " + e.getMessage());
				}finally{
					try{ 
						inputStream.close();
						outputStream.close();
					}catch(IOException e){
						System.out.println("File did not close");
					}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
			 
		}
		

	}

}
