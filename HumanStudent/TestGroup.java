
public class TestGroup {
static Student oneS = new Student(18,Sex.MALE,"LllllOne",10);
static Student twoS = new Student(18,Sex.MALE,"CcccTwo",11);
static Student threeS = new Student(19,Sex.FEMALE,"FfffCThree",19);
static Student fourS = new Student(35,Sex.MALE,"EeeeeFour",8);
static Student fiveS = new Student(32,Sex.MALE,"BbbbbFive",12);
static Student sixS = new Student(20,Sex.FEMALE,"HhhhhMSix",11);
static Student sevenS = new Student(40,Sex.MALE,"ZzzzzSeven",10);
static Student eightS = new Student(38,Sex.MALE,"DddddEight",10);
static Student nineS = new Student(17,Sex.FEMALE,"IiiiiNine",6);
static Student tenS = new Student(29,Sex.MALE,"AaaaaQTen",4);
static Student elevenS = new Student(45,Sex.FEMALE,"Eleven",100500);
static Group oneG = new Group();
	public static void main(String[] args) {
	oneG.addStudent(oneS);
	oneG.addStudent(twoS);
	oneG.addStudent(threeS);
	oneG.addStudent(fourS);
	oneG.addStudent(fiveS);
	oneG.addStudent(sixS);
	oneG.addStudent(sevenS);
	oneG.addStudent(eightS);
	oneG.addStudent(nineS);
	oneG.addStudent(tenS);
	oneG.addStudent(elevenS);//show catching of ExcessStudentException
	System.out.println(oneG); //shows filled group
	System.out.println();
	oneG.deleteStudent(oneS);
	oneG.deleteStudent(twoS);
	oneG.deleteStudent(threeS);
	System.out.println();
	System.out.println(oneG); // shows group after deleting
	oneG.addStudent(null);
	System.out.println(oneG);
	oneG.deleteStudent(null);
	System.out.println(oneG);
	oneG.findStudent("HhhhhMSix");
	}
	

}
