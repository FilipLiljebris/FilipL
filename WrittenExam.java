package tmpisproject;

//import java.util.*;

public class WrittenExam {

	private String examID;
	private String date;
	private String location;
	private double time;
	private double maxPoints;
	private Course course;

	
	public WrittenExam(String examID, String date, String location, double time, double maxPoints) {
		this.examID = examID;
		this.date = date;
		this.location= location;
		this.time = time;
		this.maxPoints = maxPoints;
	}
	
	
	public String getExamID() {
		return examID;
	}
	public void setExamID (String ExamID) {
		this.examID = ExamID;
	}
	
	
	public String getDate() {
		return date;
	}
	public void setDate (String Date) {
		this.date = Date;
	}

	
	public String getLocation() {
		return location;
	}
	public void setLocation(String Location) {
		this.location = Location;
	}
	
	
	public double getTime() {
		return time;
	}
	public void setTime (double Time) {
		this.time = Time;
	}

	
	public double getMaxPoints() {
		return maxPoints;
	}
	public void setMaxPoints (double MaxPoints) {
		this.maxPoints = MaxPoints;
	}
	
	
	public Course getCourse() {
		return course;
	}
	public void setCourse (Course Course) {
		this.course = Course;
	}
	
	
	
	
	
} 
