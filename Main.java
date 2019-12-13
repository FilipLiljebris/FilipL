package tmpisproject;

public class Main {

	public static void main(String[] args) {

		
		WrittenExam we = new WrittenExam("test", "test2", "test3", 0,0);
		
		Course c = new Course("test", "test", 0);
		
		c.addWrittenExam(we);
		
		System.out.println(c.removeWrittenExam("test"));
	}

}
