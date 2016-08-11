package murza.maksym;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileToGroup implements AddableToGroup{
	File source;
	
	public File getSource() {
		return source;
	}

	public void setSource(File source) {
		this.source = source;
	}

		public FileToGroup(File source) {
		super();
		this.source = source;
	}

		public static List <String> getWordsFromOneFile (String source) {
		if (source==null){
			throw new IllegalArgumentException("Null pointer to file extention");
		}
		List <String> wordList = new ArrayList<String>(); 
		String str="";
		try (BufferedReader bufreader = new BufferedReader (new FileReader(source));){
			for(;(str=bufreader.readLine())!=null;){
				String [] tokens = str.split("\\s+");
				List<String> wordListTemp = new ArrayList<String>(Arrays.asList(tokens));
				wordList.addAll(wordListTemp);
				}
			 
		}
		catch (FileNotFoundException e){
			System.out.println(e);
		}
		catch (IOException e){
			System.out.println(e);
		}
		return wordList;
	}
	
	@Override
	public Student[] addToGroupFromFile(File source) {
		List<String> listOfAllElementsInFile = getWordsFromOneFile(source.getAbsolutePath());
		System.out.println(listOfAllElementsInFile);
		if(listOfAllElementsInFile.size()==0)
			System.out.println("source file is empty");
	/*	our student has 4 parameters: int age, SexStudent sex, String surname, int averageGrade
		so we will parse setOfAllElementsInFile this way:
		1-st element is age
		2-nd element is sex
		3-d element is surname
		4-th element is averageGrade
		5-th element is age and so on
		first step to check that our set contains proper amount of elements (can be divided into 4)*/
		if(!   (   ((listOfAllElementsInFile.size())%4) == 0  )  )
		System.out.println("file can't be parsed into Group of students");
		//second step to check that all students can be added to group of 10 students
		if(listOfAllElementsInFile.size()>40)
			System.out.println("two many students for one group. Only ten is possible");
		Student [] arrayOfStudent = new Student[listOfAllElementsInFile.size()/4];
//		
		//fill array with initial values to avoid null pointer exception
		for (int i=0;i<arrayOfStudent.length;i++){
			arrayOfStudent[i] =new Student(0,SexStudent.FEMALE,"init",0);
		
		}
		//this cycle uses to set int age
		int age=0;
		for (int j=0; j<listOfAllElementsInFile.size();j=j+4) {
			try {
				arrayOfStudent[age].setAge(Integer.parseInt(listOfAllElementsInFile.get(j)));
				age++;
			}
			catch (NumberFormatException e){
				System.out.println(e+"check for file for age format. it should be int");
				throw new IllegalArgumentException();
			}
			}
		//this cycle uses to set SexStudent sex
		int sex=0;
		for (int j=1; j<listOfAllElementsInFile.size();j=j+4) {
				
			if (listOfAllElementsInFile.get(j).toUpperCase().equals("MALE"))
			arrayOfStudent[sex].setSex(SexStudent.MALE);
				else 
			if (listOfAllElementsInFile.get(j).toUpperCase().equals("FEMALE"))
			arrayOfStudent[sex].setSex(SexStudent.FEMALE);
			else
				{System.out.println("there is no such sex. only MALE and FEMALE are allowed");
				throw new IllegalArgumentException();
				}
				sex++;
		}
		//this cycle uses to set String surname
		int surname=0;
		for (int r=2; r<listOfAllElementsInFile.size();r=r+4) {
			if(listOfAllElementsInFile.get(r)==null){
				System.out.println("check file for nulls as surname");
				throw new IllegalArgumentException();
			}
			arrayOfStudent[surname].setSurname(listOfAllElementsInFile.get(r));
		surname++;				
		}
		
		//this cycle uses to set int averageGrade
				int averageGrade=0;
				for (int z=3; z<listOfAllElementsInFile.size();z=z+4) {
					try {
						arrayOfStudent[averageGrade].setAverageGrade(Integer.parseInt(listOfAllElementsInFile.get(z)));
					}
					catch (NumberFormatException e){
						System.out.println(e+"check for file for age format. it should be int");
						throw new IllegalArgumentException();
					}
					averageGrade++;
				}

		return arrayOfStudent;
}
}