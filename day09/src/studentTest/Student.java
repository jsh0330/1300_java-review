package studentTest;

public class Student {
	// 학생 클래스
	
	// 필드 => 힙 메모리에 생성(객체 생성될 때)
	// 이름, 전공, 나이, 학년, 학점
	String name;	// 문자열 이름
	String major;	// 문자열 전공
	int age;		// 정수형 나이
	int grade;		// 정수형 학년
	char score;		// 문자혀 학점
	
	// 생성자
	// 기본생성자
	public Student() { // 객체 생성시 인수를 넣지 않을 때 호출
		
	}
	
	// 이름, 전공, 나이 입력받는 생성자
	public Student(String name, String major, int age) { // 문자열, 문자열, 정수형의 인수가 전달될 때 호출)
		// this : 객체 자기 자신
		this.name = name; // 해당 객체의 name이라는 필드에 매개변수로 전달된 값을 대입
		this.major = major;
		this.age = age;
	}

	// 이름, 전공, 나이, 학년을 입력받는 생성자
	public Student(String name, String major, int age, int grade) { // 문자열, 문자열, 정수형, 정수형 인수가 전달될 때 호출
		// this() : 자기 자신의 생성자, 생성자 내에서만 호출 가능, 맨 위에 작성해야 한다
		this(name, major, age); // name, major, age 매개변수를 가진 자기 자신의 생성자를 호출
		this.grade = grade; // 해당 객체의 grade이라는 필드에 매개변수로 전달된 값을 대입
	}
	
	
	
	
	// 메소드
	// 학생의 이름과 학년, 전공을 출력하는 메소드 printStudent
	void printStudent() {
		System.out.println("이름 : " + this.name + ", 학년 : " + this.grade + ", 전공 : " + major);
	}
	
	// 학생의 전공 과목의 성적을 2개 입력받아 전공과목의 평균을 구하는 메소드 avgScore
	double avgScore(double num1, double num2) {
		double avg = 0;
		avg = (num1 + num2) / 2;
		System.out.println("평균 : " + avg);
		return avg;
	}
	
	// 학생의 평균이 90점 이상이면 A, 70점 이상이면 B, 60점 이상이면 C, 그 외에는 F학점으로 반환하는 메소드 gradeScore
	char gradeScore(double avg) {
		if(avg >= 90) {
			score = 'A';
		}else if (avg >= 70 && avg < 90) {
			score = 'B';
		}else if (avg >= 60 && avg < 70) {
			score = 'C';
		}else {
			score = 'F';
		}
		System.out.println(this.name + " 학생의 성적은 " + score + "입니다");
		return score;
	}

}
