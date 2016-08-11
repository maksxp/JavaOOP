import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
public static void fileCopy (File fileFrom, File fileTo) throws IOException{
	if (fileFrom==null){
		throw new IllegalArgumentException("Null pointer to fileFrom");
	}
	if (!(fileFrom.exists()||fileFrom.isFile())){
		throw new IOException();
	}
	try(FileInputStream fis =new FileInputStream(fileFrom); FileOutputStream fos = new FileOutputStream(fileTo)){
		byte[] bufferArray = new byte [4*1024];
		int readBytes = 0;
		for(;(readBytes=fis.read(bufferArray))>0;){
			fos.write(bufferArray, 0, readBytes);
		}
	}
	catch (IOException e){
		throw e;
	}
	}

}