package tmpisproject;

import java.util.ArrayList;

public class Course {
	private String courseCode;
	private String name;
	private int credits;
	private ArrayList<WrittenExam> writtenExams = new ArrayList<WrittenExam>();
	private CourseRegister courseRegister;
	
	public Course(String CourseCode, String Name, int Credits) {
		this.courseCode = CourseCode;
		this.name = Name;
		this.credits = Credits;
	}
	
	
    public void setCourseCode(String CourseCode) {
    	this.courseCode = CourseCode;
    }
    public String getCourseCode() {
    	return this.courseCode;
    }
    
    
    public void setName(String Name) {
    	this.name = Name;
    }
    public String getName() {
    	return this.name;
    }
    
    
    public void setCredits(int Credits) {
    	this.credits = Credits;
    }
    public int getCredits() {
    	return this.credits;
    }
    
    
    public CourseRegister getCourseRegister() {
		return courseRegister;
	}
	public void setCourseRegister(CourseRegister CourseRegister) {
		this.courseRegister = CourseRegister;
	}
    
    
    public WrittenExam findWrittenExam(String ExamID) {
    	for(WrittenExam tmp: getWrittenExams()) {
    		
    		if(tmp.getExamID().equals(ExamID)) {
    			return tmp;
    		}
    	}
    	return null;
    }
    
    
    public void addWrittenExam(WrittenExam WrittenExam) {
    	this.writtenExams.add(WrittenExam);
    }
    public ArrayList<WrittenExam> getWrittenExams() {
    	return this.writtenExams;
    }
    public WrittenExam removeWrittenExam(String ExamID) { // Man ska kunna göra detta på 1 linje
    	WrittenExam tmp = findWrittenExam(ExamID);        // Men remove ger boolean då den lyckats/inte
    	writtenExams.remove(findWrittenExam(ExamID));     // Så jag vet inte...
    	return tmp;
    }
    
    
}
