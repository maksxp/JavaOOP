import java.util.Arrays;

public class Group {
private Student [] group = new Student [10];
private int position=0; //uses to avoid additional checking of array
public Group() {
	super();
}

public Group(Student[] group) {
	super();
	this.group = group;
}
public void addStudent (Student student) {
	if (!(position==10)){
	this.group[position]=student;
	++position;
}
	else
		try{
	throw new ExcessStudentException ();}
	catch (ExcessStudentException e){
		System.out.println(e);
	}
}
public void deleteStudent (Student student) {
	for (int i=0;i<this.group.length;i++){
		if (this.group[i]==student){
			this.group[i]=this.group[position-1];
			this.group[position-1]=null;
			--position;
		}
	}
	System.out.println("Student "+student.getSurname()+" has been deleted succesfully");
		}
@Override
public String toString() {
	Student [] array = sortBySurname(group);
	StringBuilder sb = new StringBuilder();
	for (int i=0;i<position;i++){
	sb.append(array[i]);}
	
	return sb.toString();
}
public Student[] sortBySurname (Student [] group){
	//gets surnames and sorts them by natural order
	String [] array = new String [position];
	for (int i=0;i<position;i++){
		array[i]=group[i].getSurname();
	}
	Arrays.sort(array);
	// changes the target array
	Student [] temp = new Student[position];
	for (int i=0;i<position;i++){ // goes through the String array
		for (int j=0;j<position;j++){ // goes through Student array
		if (group[j].getSurname()==array[i]){
			temp[i] = group[j];
			}
		}
		}
	return temp;
}
}