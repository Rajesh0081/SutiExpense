package WebDriver_Examples;

import java.io.FileWriter;
import java.io.IOException;

public class File_Write {

	public static void main(String[] args) throws Exception {
		FileWriter file=new FileWriter("C:\\Users\\dell\\Desktop\\7pm bachexample.txt");
		file.write("Welcome to the SeleniumWorld......");
		file.write("\n");
		
		file.write("This is a example program.....");
		file.close();

	}

}
