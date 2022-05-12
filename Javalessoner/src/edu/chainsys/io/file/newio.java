package edu.chainsys.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class newio {
	public static void main(String args[]) throws IOException {
		String s="I love india";
		File myFile=new File("C:\\Users\\Soorya\\OneDrive\\Desktop\\payilagam.txt");
		FileOutputStream fos=new FileOutputStream(myFile);
		byte []b=s.getBytes();
		fos.write(b);
		FileInputStream fis=new FileInputStream(myFile);
		File Readingfile=new File("C:\\Users\\Soorya\\OneDrive\\Desktop\\one.txt");
		/*int data=fis.read();
		int data1=fis.read();
		int data2=fis.read();
		System.out.println((char)data+" "+(char)data1+" "+(char)data2);
		*/
		int i=0;
	
		while((i=fis.read())!=-1) {
		//int d=fis.read();
		System.out.print((char)i);
	}

}
}
