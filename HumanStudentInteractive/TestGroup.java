package murza.maksym;

public class TestGroup {
static Student oneS = new Student(18,SexStudent.MALE,"LllllOne",10);
static Student twoS = new Student(18,SexStudent.FEMALE,"CcccTwo",11);
static Student threeS = new Student(19,SexStudent.MALE,"FfffCThree",19);
static Student fourS = new Student(35,SexStudent.FEMALE,"EeeeeFour",8);
static Student fiveS = new Student(32,SexStudent.MALE,"BbbbbFive",12);
static Student sixS = new Student(20,SexStudent.FEMALE,"HhhhhMSix",11);
static Student sevenS = new Student(38,SexStudent.MALE,"ZzzzzSeven",10);
static Student eightS = new Student(38,SexStudent.FEMALE,"DddddEight",10);
static Student nineS = new Student(17,SexStudent.MALE,"IiiiiNine",6);
static Student tenS = new Student(29,SexStudent.FEMALE,"AaaaaQTen",4);
static Student elevenS = new Student(45,SexStudent.FEMALE,"Eleven",100500);
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
	//System.out.println(oneG); //shows filled group
	//System.out.println();
	//oneG.deleteStudent(oneS);
	//oneG.deleteStudent(twoS);
//	oneG.deleteStudent(threeS);
	System.out.println();
	//System.out.println(oneG); // shows group after deleting
	//oneG.addStudentInteractive();
	//System.out.println(oneG); 
	oneG.sortByParameter(SortParameter.SEX);
	oneG.sortByParameter(SortParameter.SURNAME);
	oneG.sortByParameter(SortParameter.AGE);
	oneG.sortByParameter(SortParameter.AVGRADE);
	System.out.println(oneG.goToAto());
		}

}
