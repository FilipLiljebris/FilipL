package tmpisproject;

import java.util.ArrayList;

public class Controller {
	
	StudentRegister SR1 = new StudentRegister();
	CourseRegister CR1 = new CourseRegister();
	
	
	
	public StudentRegister getStudentRegister() {
		return SR1;
	}
	
	
	public ArrayList<Student> getStudents() {
		return this.getStudentRegister().getStudents();
	}
	public void addStudent(Student S) {
		SR1.addStudent(S);
	}
	
	
	public CourseRegister getCourseRegister() {
		return CR1;
	}
	
	

}
