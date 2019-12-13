package tmpisproject;

import java.util.ArrayList;
	Hej Jakob
public class CourseRegister {

	private ArrayList <Course> course = new ArrayList <Course>();
	
	
	public ArrayList<Course> getCourses() {
		return course;
	}
	public void addCourse(Course C) {
		this.course.add(C);
	}
	public Course findCourse(String CourseCode) {
		for(Course tmp: course) {
			if(tmp.getCourseCode().equals(CourseCode)) {
				return tmp;
			}
		}
		return null;
	}
	public Course removeCourse(String CourseCode) {  
		Course tmp = findCourse(CourseCode);
		course.remove(findCourse(CourseCode));
		return tmp;
	}
	public void getAllCourseCodes() {
		for(Course tmp: getCourses()) {
			System.out.println(tmp.getCourseCode());
		}
	}
	
	
	public WrittenExam findWrittenExam(String ExamID) {
		for(Course tmp1: getCourses()) {
			if(tmp1.findWrittenExam(ExamID) != null) {
					return tmp1.findWrittenExam(ExamID);
			}
		}
		return null;
	}
	
	public void addWrittenExams(WrittenExam WrittenExam, String CourseCode) {
		if(this.findCourse(CourseCode) != null) {
			this.findCourse(CourseCode).addWrittenExam(WrittenExam);
		}else {
			//System.out.println("Kursen hittades inte."); //Detta ska nog inte vara med. Meddelanden i Mainklassen?
		}
	}
	public WrittenExam removeWrittenExam(String ExamID, String CourseCode) {
		return this.findCourse(CourseCode).removeWrittenExam(ExamID);
	}
}
