package murza.maksym;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
public class InteractiveStudent extends Human{
	
	private int age;
	private SexStudent sex;
	private String surname;
	private int averageGrade;
	Pattern p = Pattern.compile("[a-zA-Z]",Pattern.CASE_INSENSITIVE);
	Matcher m;	
	public InteractiveStudent() {
		super();
	}
	
	public int getAge() {
		return age;
	}

	public SexStudent getSex() {
		return sex;
	}

	public String getSurname() {
		return surname;
	}

	public int getAverageGrade() {
		return averageGrade;
	}

	public void setAge (){
		System.out.println("input age");
		Scanner sc = new Scanner(System.in);
	  if(sc.hasNextInt()) { 
         int i = sc.nextInt(); 
          age = i;
        } else {
          System.out.println("age is incorrect");
        }
	}
	public void setSex (){
		System.out.println("input sex: please input 1 if male and 0 if female");
		Scanner sc = new Scanner(System.in);
	  if(sc.hasNextInt()) { 
         int sex = sc.nextInt(); {
         if (sex==1)
          this.sex = SexStudent.MALE;
         else if(sex==0)
        	 this.sex=SexStudent.FEMALE;
         else {
          System.out.println("sex is incorrect");
        }}}
	}
	public void setSurname (){
		System.out.println("input surname");
		Scanner sc = new Scanner(System.in);
		String temp=sc.next();
		m= p.matcher(temp);
	  if(m.find()) { 
          //String s = sc.next(); 
          //System.out.println(s);
         surname = temp;
        } else {
        	System.out.println("surname is incorrect");
        	throw new SurnameException();
        	}
	}
	public void setAverageGrade (){
		System.out.println("input avearageGrade");
		Scanner sc = new Scanner(System.in);
	  if(sc.hasNextInt()) { 
         int i = sc.nextInt(); 
          averageGrade = i;
        } else {
          System.out.println("averagegrdae is incorrect");
        }
	}
}
