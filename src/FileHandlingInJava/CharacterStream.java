package FileHandlingInJava;
import java.io.*;

public class CharacterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "E:\\Eclipse IDE Work Space\\Files\\CharStream.txt";
		String Message = "Character stream reads one char at a time.";
		char[] ch = Message.toCharArray();
		
		try {
			FileWriter fw = new FileWriter(filePath);
			fw.write(ch);
			System.out.println("File Written Successfully");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader(filePath);
			char[] ch2 = new char[100];
			fr.read(ch2);
			fr.close();
			for(char c:ch2) {
				System.out.print(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
