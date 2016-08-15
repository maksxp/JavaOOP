import java.io.File;
import java.io.IOException;

public class CopyThread implements Runnable {
	private File fileFrom; 
	private File fileTo;
	public CopyThread(File fileFrom, File fileTo) {
		super();
		this.fileFrom = fileFrom;
		this.fileTo = fileTo;
	}

	public void run() {
		try {
			FileOperation.fileCopy(fileFrom, fileTo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

