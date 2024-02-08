package WebDriver_Examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filereader_example {

	public static void main(String[] args) throws Exception {
		FileReader reader=new FileReader("C:\\Users\\dell\\Desktop\\6 pm batch.txt");
		int character;
		while((character=reader.read())!=-1){
			System.out.println((char)character);
		}
		reader.close();

	}

}
