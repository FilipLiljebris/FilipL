package tmpisproject;

import java.util.ArrayList;

public class StudentRegister {

	private ArrayList<Student> students = new ArrayList<Student>();

	
	public StudentRegister() {
		
	}
	
	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void addStudent(Student S) {
		this.students.add(S);
	}

	public Student findStudent(String StudentID) {
		for (Student tmp : getStudents()) {
			if (tmp.getStudentID().equals(StudentID)) {
				return tmp;
			}
		}
		return null;
	}
	public Student removeStudent(String StudentID) {
		Student tmp = this.findStudent(StudentID);
		this.getStudents().remove(tmp);
		return tmp; 
	}
	
	public void getAllStudentIDs() {
		for(Student tmp: this.getStudents()) {
			System.out.println(tmp.getStudentID());
		}
	}
	
	
	public void getAllStudentResults(String StudentID) {
		this.findStudent(StudentID).getAllResults();
	}
}
