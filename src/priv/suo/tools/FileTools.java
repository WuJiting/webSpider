package priv.suo.tools;

import java.io.*;


public class FileTools {
	public static void fileIn(String filename,String content){
		File file = new File(filename);
		System.out.println("�ҵ�ҳ�棬����ڴ�..."+filename+"�ļ���");
		try{
			FileOutputStream writerStream = new FileOutputStream(file);    
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(writerStream, ConstTools.charSet)); 
			writer.write(content);
			writer.close();  
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
}
