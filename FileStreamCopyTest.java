package wyu522;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamCopyTest {
	public static void main(String[] arsgs) throws IOException {
		String filePath ="D:\\Java\\Homework_Test\\myfile.txt";
		String filePathNew ="D:\\Java\\Homework_Test\\myfile_cp.txt";
		FileInputStream fis = new FileInputStream(filePath);
		FileOutputStream fos = new FileOutputStream(filePathNew);
		int len = -1;
		byte buffer[] = new byte[1024];
		while ((len = fis.read(buffer)) != -1) {
			for (int i = 0; i < len; i++)
				fos.write(buffer[i]);
		}
		fis.close();
		fos.close();
	}
}
