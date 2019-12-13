package tmpisproject;

public class Result {

	private double result;
	private String letterGrade;
	private WrittenExam writtenExam;
	private Student student;
	
	public Result (double result, String letterGrade) {
		this.result = result;
		this.letterGrade = letterGrade;
	}

	
	public String getLetterGrade() {
		return letterGrade;
	}
	public void setLetterGrade (String LetterGrade) {
		this.letterGrade = LetterGrade;
	}
	
	
	public double getResult() {
		return result;
	}
	public void setResult (double Result) {
		double procentageResult = (Result/this.getWrittenExam().getMaxPoints())*100;
		if(procentageResult >= 85) {
			this.setLetterGrade("A");
		} else if(procentageResult >= 75) {
			this.setLetterGrade("B");
		} else if(procentageResult >= 65) {
			this.setLetterGrade("C");
		} else if(procentageResult >= 55) {
			this.setLetterGrade("D");
		} else if(procentageResult >= 50) {
			this.setLetterGrade("E");
		} else if (procentageResult < 50) {
			this.setLetterGrade("U");
		} else {
			System.out.print("Inget resultat har registrerats");  // tmp
		}
		this.result = Result;
	}

	
	public Student getStudent() {
		return student;
	}
	public void setStudent (Student Student) {
		this.student = Student;
	}
	
	
	public WrittenExam getWrittenExam() {
		return writtenExam;
	}
	public void setWrittenExam (WrittenExam WrittenExam) {
		this.writtenExam = WrittenExam;
	} 
	
}
