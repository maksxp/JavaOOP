

public class Human {
private int age;
private Sex sex;
private String surname;

public Human() {
	super();
}

public Human(int age, Sex sex,String surname) {
	super();
	this.age = age;
	this.sex = sex;
	this.surname = surname;
}

public Sex getSex() {
	return sex;
}

public void setSex(Sex sex) {
	this.sex = sex;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Human age=" + age + ", sex=" + sex + ", surname=" + surname;
}

}
