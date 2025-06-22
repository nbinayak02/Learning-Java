package FileHandlingInJava;
import java.io.*;

public class ByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "E:\\Eclipse IDE Work Space\\Files\\ByteStream.txt";
		String message = "Hello! File Handling in Java. Ohooo...";
		byte[] dataBytes = message.getBytes();
		
		try {
			
			FileOutputStream out = new FileOutputStream(filePath);
			out.write(dataBytes);
			System.out.println("File written successfully");
			out.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream in = new FileInputStream(filePath);
			int ch;
			while((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
