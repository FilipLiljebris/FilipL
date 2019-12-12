package tmpisproject;

import java.util.ArrayList;



public class Student {

	private String studentID;
	private String name;
	private ArrayList <Result> results = new ArrayList <Result>();
	private StudentRegister studentRegister;
	
	
	public Student (String studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID (String StudentID) {
		this.studentID = StudentID;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName (String Name) {
		this.name = Name;
	}
	
	
	public ArrayList<Result> getResults() {
		return results;
	}
	public void addResult (Result R) {
		this.getResults().add(R);
	}
	
	public void setStudentRegister(StudentRegister StudentRegister) {
    	this.studentRegister = StudentRegister;
    }
    public StudentRegister getStudentRegister() {
    	return this.studentRegister;
    }
	
    
    public void getAllResults() {
    	for(Result tmp: this.getResults()) {
    		System.out.print(tmp.getResult());
    	}
    }
	public Result findResult(String examID) {
		for(Result tmp: getResults()) {
			if(tmp.getWrittenExam().getExamID().equals(examID)) {
				return tmp;
			}
		}
		return null;
	}
	public void registerResult(String examID) {
		if(this.findResult(examID) != null) {
			System.out.println("Resultat har redan registrerats");
			// Insert metod för att skanna svar och sedan använda sig av updateResult
		} else {
			this.addResult(this.findResult(examID));
		}
	}
	public void updateResult(String examID) {
		
	}
	
}
