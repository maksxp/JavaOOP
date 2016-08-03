
public class Student extends Human{
private int averageGrade;

public Student() {
	super();
}

public Student(int age, Sex sex, String surname, int averageGrade) {
	super(age, sex, surname);
	this.averageGrade = averageGrade;
	}

public int getAverageGrade() {
	return averageGrade;
}

public void setAverageGrade(int averageGrade) {
	this.averageGrade = averageGrade;
}

@Override
public String toString() {
	return " Surname=" + getSurname()+", averageGrade=" + averageGrade + ", age=" + getAge() + ", sex=" + getSex()+System.getProperty("line.separator");
}


}
