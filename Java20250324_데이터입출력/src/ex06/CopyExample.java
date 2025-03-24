package ex06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) {

		
//		String originalPath = "c:/data/dog.jpg";
//		String targetPath = "c:/test/dog.jpg";
		String originalPath = "c:/data/new.txt";
		String targetPath = "c:/test/new.txt";
		try {
			InputStream is = new FileInputStream(originalPath);
			OutputStream os = new FileOutputStream(targetPath);
			byte[] data = new byte[1024];
			
			while(true) {
				int num = is.read(data);
				//System.out.println(num);
				
				if(num == -1) break; // data== -1 더이상 읽어올 데이터가 없다(파일 끝!)
				
				os.write(data, 0, num);
				
			}
			os.flush();
			os.close();
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
