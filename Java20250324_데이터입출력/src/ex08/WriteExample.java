package ex08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {

		
		try {
			Writer writer = new FileWriter("C:data/test.txt");
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			char[]arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			writer.write("FGH");
			
			writer.flush();
			
			writer.close();
			
					
					
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
