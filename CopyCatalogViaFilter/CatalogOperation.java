import java.io.File;
import java.io.IOException;

public class CatalogOperation {
	public static void catalogCopy (String catalogFrom, String catalogTo, String ...filter ) throws IOException{
		if (filter==null){
			throw new IllegalArgumentException("Null pointer to file extention");
		}
		MyFileFilter mFF = new MyFileFilter(filter);
		if (catalogFrom==null||catalogTo==null){
			throw new IllegalArgumentException("Null pointer to catalog");
		}
		File folderSource = new File(catalogFrom);
		File folderDestination = new File(catalogTo);
		folderDestination.mkdirs();
		File[] fileListToCopy = folderSource.listFiles(mFF);
	 for (File file : fileListToCopy) {
		 File fileTemp = new File (folderDestination.getAbsolutePath()+"\\"+file.getName());
		 fileTemp.createNewFile();
		 System.out.println(file.getName()+" has been copied successfully");
		// folderDestination.createNewFile();	
	FileOperation.fileCopy(file, fileTemp);
	}
	}}
