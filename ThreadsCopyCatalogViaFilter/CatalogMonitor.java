import java.io.File;

public class CatalogMonitor implements Runnable{
private File catalog;
private Thread thr;
private int catalogLength;

public CatalogMonitor(File catalog) {
	super();
	this.catalog = catalog;
	thr=new Thread(this);
	thr.start();
	}
public int check (File catalog){
	return catalog.listFiles().length;
}
@Override
public void run() {
	int check=catalog.listFiles().length;
	for(;;){
		try {
		Thread.currentThread().sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		int checkTemp = catalog.listFiles().length;
		if (!(check==checkTemp)){
			System.out.println("folder has been changed");
			check=checkTemp;
		}
	}
}
}
