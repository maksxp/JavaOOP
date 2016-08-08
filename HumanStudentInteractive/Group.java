package murza.maksym;
import java.util.Arrays;


public class Group implements Voenkom {
private Student [] group = new Student [10];
private int position=0; //uses to avoid additional checking of array
//boolean sorted; //uses to check how output the list of students
public Group() {
	super();
}

public Group(Student[] group) {
	super();
	this.group = group;
	this.position=group.length;
}
public void addStudentInteractive (){
InteractiveStudent ia = new InteractiveStudent();
ia.setAge();
ia.setAverageGrade();
ia.setSex();
try{
ia.setSurname();}
catch (SurnameException e){
	System.out.println(e);
	return;
}
Student st = new Student (ia.getAge(),ia.getSex(),ia.getSurname(),ia.getAverageGrade());
addStudent(st);
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
	int  temp = position;
	for (int i=0;i<this.group.length;i++){
		if (this.group[i]==student){
			this.group[i]=this.group[position-1];
			this.group[position-1]=null;
			--position;
			System.out.println("Student "+student.getSurname()+" has been deleted succesfully");
		}
		}
	if (temp==position)
		System.out.println("There is no such student in the group");
			}

private Student[] sortBySurname (Student [] group){
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
public void sortByParameter (SortParameter parameter) {
	switch (parameter){
	case SEX: {	
		System.out.println("sorted by sex");
		System.out.println(new Group(sortBySex(this.group)));
	return;			
	}
	case AGE:{
		System.out.println("sorted by age");
		System.out.println(new Group(sortByAge(this.group)));
	return;	
	}
	case AVGRADE:{
		System.out.println("sorted by averageGrade");
		System.out.println(new Group(sortByAverageGrade(this.group)));
	return;	
	}
	case SURNAME:{
		System.out.println("sorted by surname");
		System.out.println(new Group(sortBySurname(this.group)));
		return;
		}
	
	}
	
}
private Student [] sortBySex (Student [] group){
	Student [] sortedBySex = new Student [position];
	
	int j=0;
	for (int i=0;i<position;i++){
		if (group[i].getSex()==SexStudent.MALE){
			sortedBySex[j]=group[i];
		j=j+1;
		}
	}
	for (int i=0;i<position;i++){
		if (group[i].getSex()==SexStudent.FEMALE){
			sortedBySex[j]=group[i];
		j=j+1;
		}
	}
	return sortedBySex;
	}
		
private Student [] sortByAge (Student [] group){
	
	int [] age = new int[position];
	//the cycle below uses to find the make array length
	for (int i=0;i<position;i++){
		age[i]=group[i].getAge();
		}
	Arrays.sort(age);
// changes the target array
Student [] temp = new Student[position];
for (int i=0;i<position;i++){ // goes through the String array
	for (int j=0;j<position;j++){ // goes through Student array
	if (group[j].getAge()==age[i]){
		temp[i] = group[j];
		}
	}
	}
return temp;
	}
private Student [] sortByAverageGrade (Student [] group){
	
	int [] averageGrade = new int[position];
	//the cycle below uses to find the make array length
	for (int i=0;i<position;i++){
		averageGrade[i]=group[i].getAverageGrade();
		}
	Arrays.sort(averageGrade);
// changes the target array
Student [] temp = new Student[position];
for (int i=0;i<position;i++){ // goes through the String array
	for (int j=0;j<position;j++){ // goes through Student array
	if (group[j].getAverageGrade()==averageGrade[i]){
		temp[i] = group[j];
		}
	}
	}
return temp;
	}
@Override
public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<position;i++){
		sb.append(group[i]);}
		return sb.toString();
	}

@Override
public Group goToAto() {
	int iMale=0;//counts how many males in group
	for (int i=0;i<position;i++){
		if (group[i].getSex()==SexStudent.MALE){
			iMale=iMale+1;
		}
	}
	//create the appropriate array of males 
	Student [] male = new Student[iMale];
     int k=0;
	for (int i=0;i<position;i++){
		if (group[i].getSex()==SexStudent.MALE){
			male[k]=group[i];
			k++;
			}}
		
		//counts how many males have age more or equal 18
	int iAge=0;
	for (int i=0;i<male.length;i++){
		if (male[i].getAge()>=18){
			iAge=iAge+1;
		}
	}
	//create the appropriate array of males (18 and more)
	Student [] ato = new Student[iAge];
	int t=0;
	for (int i=0;i<male.length;i++){
		if (male[i].getAge()>=18){
			ato[t]=male[i];
			t++;
			}
		}
		return new Group(ato);
}
}
