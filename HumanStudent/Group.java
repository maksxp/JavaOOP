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
	if (!(student==null)){
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
	else
		System.out.println("student can't be null");
}
public void deleteStudent (Student student) {
	if (!(student==null)){
	for (int i=0;i<this.group.length;i++){
		if (this.group[i]==student){
			this.group[i]=this.group[position-1];
			this.group[position-1]=null;
			--position;
		}
	}
	System.out.println("Student "+student.getSurname()+" has been deleted succesfully");
	}
	else
		System.out.println("student can't be null");
		}
public void findStudent (String surname){
	if (!(surname==null)){
		int temp =0; //uses to print data about no such student in the group
for (int i=0;i<position;i++){
	if (surname==group[i].getSurname())
		System.out.println(group[i]);
	else 
		++temp;//increments every time when there is no such student
	}
if (temp==position)// if temp == quantity of elements it means that array doesn't contain the demand element
System.out.println("there is no such student in the group");
}
	else
		System.out.println("student can't be null");
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