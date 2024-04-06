package studentTest;

public class StudentMain {
	public static void main(String[] args) {
		
		Student student1 = new Student("장서혁", "시스템", 20, 3);
		Student student2 = new Student("장지욱", "설계", 17, 1);
		
		student1.printStudent();
		student2.printStudent();
		
		double avg = student1.avgScore(90, 80);
		student1.gradeScore(avg);
		System.out.println(student1.score);
	}

}
