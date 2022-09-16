package deez;

public class code {

	public static void main(String[] args) {
		Course c1 = new Course("Math", "Jimbo", 7, 3, 10);
		Course c2 = new Course("English", "Harry", 7, 4, 10);
		Course c3 = new Course("Programming", "Jimbo", 6, 2, 10);
		Course c4 = new Course("Bio", "Jimbo", 4, 2, 10);
		Student s1 = Student.create("John", 20, "MED112", true);
		Student s2 = Student.create("Johnny", 20, "IT521", false);
		Student s3 = Student.create("Jenna", 20, "IT621", true);
		Student s4 = Student.create("Jess", 20, "ENG427", false);
		Student s5 = Student.create("William", 20, "ENG629", true);
		Student s6 = Student.create("Joseph", 20, "LAW992", false);
		Student s7 = Student.create("Andrea", 20, "LAW002", false);
		Student s8 = Student.create("Nico", 20, "MED613", true);
		Student s9 = Student.create("Sebastian", 20, "MED865", false);
		
		s1.enrollStudent(c1);
		s1.enrollStudent(c2);
		s2.enrollStudent(c1);
		s2.enrollStudent(c3);
		s2.enrollStudent(c4);
		s3.enrollStudent(c2);
		s4.enrollStudent(c1);
		s4.enrollStudent(c2);
		s4.enrollStudent(c3);
		s4.enrollStudent(c4);
		s5.enrollStudent(c2);
		s5.enrollStudent(c3);
		s5.enrollStudent(c4);
		s6.enrollStudent(c3);
		s6.enrollStudent(c4);
		s7.enrollStudent(c1);
		s7.enrollStudent(c2);
		s7.enrollStudent(c3);
		s7.enrollStudent(c4);
		s8.enrollStudent(c2);
		s9.enrollStudent(c3);
		s9.enrollStudent(c4);
		c1.randomGrade();
		c1.randomGrade();
		c2.randomGrade();
		c2.randomGrade();
		c2.randomGrade();
		c2.randomGrade();
		s3.remove();
		c3.randomGrade();
		c4.randomGrade();
		c3.randomGrade();
		c4.randomGrade();
		s4.remove();
		Student.endSemester();
		c1.randomGrade();
		c2.randomGrade();
		c3.randomGrade();
		c4.randomGrade();
		s5.remove();
		s1.remove();
		c1.randomGrade();
		c2.randomGrade();
		Student.endSemester();
		Student.uniqueFaculties();
	}

}
