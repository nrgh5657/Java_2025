package ex08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IO;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		
		
		try {
			Reader reader = null;
			reader = new FileReader("C:/data/new.txt");
			
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char)data);
				
			}
			reader.close();
			System.out.println();
			System.out.println("--------------------------------------------------------------------");
			reader = new FileReader("C:/data/new.txt");
			char[]data = new char[100];
			while(true) {
				int num = reader.read(data);
				if(num == -1) break;
				for(int i = 0; i<num; i++)
				System.out.print(data[i]);
			}
			reader.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
