package WebDriver_Examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_Reader_Ex2 {

	public static void main(String[] args) throws Exception {
		FileReader reader=new FileReader("C:\\Users\\dell\\Desktop\\Manual Testing_selenium 7 pm newbatch.txt");
		
		BufferedReader file=new BufferedReader(reader);
		String line;
		while((line=file.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
	}

}
