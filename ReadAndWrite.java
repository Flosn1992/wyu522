package wyu522;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\Java\Homework_Test";
		String fileName = "test.txt";
		System.out.println("这里进行读操作-------内容如下：");
		File readFile = new File(filePath + File.separator + fileName);
		Reader input = new FileReader(readFile);
		char[] c = new char[1024];
		int temp = 0;
		int len = 0;
		while ((temp = input.read()) != -1) {
			c[len] = (char) temp;
			len++;
		}
		input.close();
		System.out.println(new String(c, 0, len));
		
		System.out.println("这里执行写操作-----------------");
		File writeFile = new File(filePath + File.separator + fileName);
		Writer out = new FileWriter(writeFile, true);
		String str = "\r\n我加了一段话";
		out.write(str);
		out.close();
	}

}
