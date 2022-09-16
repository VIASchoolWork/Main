package deez;

import java.util.HashSet;
import java.util.Random;

public class Course {
	String title;
	String professor;
	HashSet<Student> students = new HashSet<Student>();
	int studentLimit;
	int minGrade;
	int maxGrade;
	
	Course(String title, String professor, int studentLimit, int minGrade, int maxGrade){
		this.title = title;
		this.professor = professor;
		this.studentLimit = studentLimit;
		this.minGrade = minGrade;
		this.maxGrade = maxGrade;
	}
	public void randomGrade() {
		Random x = new Random();
		for(Student student : students) {
			int grade = x.nextInt(minGrade, maxGrade);
			System.out.println(student.name + " got a " + grade);
			student.grades.add(grade);
		}
	}
	
}
