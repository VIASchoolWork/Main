package deez;

import java.util.ArrayList;
import java.util.HashSet;

public class Student {
	String name;
	int age;
	HashSet<Course> courses = new HashSet<Course>();
	String studentCode;
	boolean isDonator;
	ArrayList<Integer> grades = new ArrayList<Integer>();
	static HashSet<Student> allStudents = new HashSet<Student>();
	
	private Student(String name, int age, String studentCode, boolean isDonator) {
		this.name = name;
		this.age = age;
		this.studentCode = studentCode;
		this.isDonator = isDonator;
		allStudents.add(this);
	}
	
	public void enrollStudent(Course course) {
		if(course == null) {
			System.out.println("Sorry, something went wrong. :(");
			return;
		}
		if(this.courses.contains(course)) {
			System.out.println("You've already enrolled in this course!");
			return;
		}
		if(course.students.size() >= course.studentLimit && this.isDonator == true) {
			int youngestAge = 1000;
			Student youngestStudent = null;
			for(Student x : course.students) {
				if(x.age < youngestAge) {
					youngestStudent = x;
					youngestAge = x.age;
				}
			}
			course.students.remove(youngestStudent);
			youngestStudent.courses.remove(course);
			this.courses.add(course);
			course.students.add(this);
			System.out.println(this.name + " is now enrolled in " + course.title + " and " + youngestStudent.name + " is being kicked out of the course.");
			return;
		}
		if(course.students.size() >= course.studentLimit && this.isDonator == false) {
			System.out.println("This course is full, and you ain't giving us your hard earned money.");
			return;
		}
		System.out.println(this.name + " enrolled in " + course.title + ".");
		this.courses.add(course);
		course.students.add(this);
	}
	static Student create(String name, int age, String studentCode, boolean isDonator) {
		if(studentCode.substring(0, 3).equals("MED") && isDonator == true) {
			System.out.println("No, he cannot be a donator. Changed!!!!!!!!!!!!");
			isDonator = false;
		}
		Student x = new Student(name, age, studentCode, isDonator);
		return x;
	}
	static void endSemester() {
		System.out.println("\nEND OF THE SEMESTER !");
		int studentsSum = 0;
		int studentsAvg = 0;
		boolean failed = false;
		for(Student x : allStudents) {
			if(x.courses == null || x.courses.size() == 0) {
				continue;
			}
			studentsAvg = 0;
			studentsSum = 0;
			failed = false;
			for(int grade : x.grades) {
				if(grade < 5 && x.isDonator == true) {
					grade = 5;
				}
				if(grade < 4 && x.isDonator == false) {
					failed = true;
					break;
				}
				studentsSum += grade;
			}
			studentsAvg = studentsSum / x.grades.size();
			if(failed == true || studentsAvg < 5) {
				System.out.println(x.name + " is being withdrawn for failing a class.");
				for(Course a : x.courses) {
					a.students.remove(x);
				}
				x.courses =  null;
				continue;
			}
		}
	}
	public void remove() {
		if(this.courses == null) {
			System.out.println(this.name + " has already been withdrawed from all courses or never enrolled in them.");
			return;
		}
		System.out.println("\n" + this.name + " is removing themselves. \n");
		for(Course x : courses) {
			x.students.remove(this);
			x.studentLimit--;
		}
		this.courses = null;
	}
	static public void uniqueFaculties() {
		HashSet<String> faculties = new HashSet<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		for(Student x : allStudents) {
			String code = x.studentCode;
			int firstNumber = 10;
			for(int a : numbers) {
				String b = a+"";
				if(code.contains(b) && firstNumber > code.indexOf(b)) {
					firstNumber = code.indexOf(b);
				}
			}
			code = code.substring(0, firstNumber);
			faculties.add(code);
		}
		System.out.println(faculties);
	}
}

