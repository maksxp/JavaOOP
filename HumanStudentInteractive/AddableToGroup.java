package murza.maksym;

import java.io.File;


public interface AddableToGroup {
File getSource();
Student[] addToGroupFromFile(File source);
}
