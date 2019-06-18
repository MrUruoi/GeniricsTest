package test1;

import java.util.Arrays;

public class WildCardTest {
	
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourse2(Course<? extends Student> course) {
		System.out.println(course.getName() + " " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourse3(Course<? super Student> course) {
		System.out.println(course.getName() + " " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		
//		registerCourse(new Course<Person>("人", 5));
//		registerCourse(new Course<Student>("学生", 5));
//		registerCourse(new Course<HighSchoolstudent>("高校", 5));
//		registerCourse(new Course<Worker>("労働", 5));
//		
//		registerCourse2(new Course<Student>("学生", 5));
//		registerCourse2(new Course<HighSchoolstudent>("高校", 5));
//		
//		registerCourse3(new Course<Student>("学生", 5));
//		registerCourse3(new Course<Person>("人", 5));
		
		Course<Person> personCourse = new Course<>("一般", 5);
		personCourse.add(new Person("a"));
		personCourse.add(new Person("b"));
		personCourse.add(new Person("c"));
		personCourse.add(new Person("d"));
		
		Course<Person> workerCourse = new Course<Person>("労働", 5);
		workerCourse.add( new Worker("1"));
		
		Course<Student> studentCourse = new Course<>("学生", 5);
		studentCourse.add(new Student("A"));
		studentCourse.add(new Student("B"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		
	}
}
