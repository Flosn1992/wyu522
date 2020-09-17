package wyu522;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferStreamCopyTest {
	public static void main(String[] args) throws IOException {
		//»º´æÁ÷¶ÁÐ´		
		String filePath = "D:\\Java\\Homework_Test\\myfile.txt";
		String filePathNew = "D:\\Java\\Homework_Test\\myfile_cp.txt";
		FileInputStream fis = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(filePathNew);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int len = -1;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		System.out.println("Íê±Ï");
		bis.close();
		bos.close();

	}
}

