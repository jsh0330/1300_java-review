package employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {
	public static void main(String[] args) {
//      1. 회사의 사원들의 정보를 HashMap에 저장한다
//      HashMap의 Key는 사원의 ID(String)
//      Value는 이름, 나이, 부서로 설정 => Employee 클래스

		HashMap<String, Employee> employeeMap = new HashMap<>();

//      조건1. 새로운 사원정보를 추가
//      001, 짱구, 5, "영업부"
//      002, 철수, 5, "개발부"
//      003, 유리, 5, "사업부"
		addEmployee(employeeMap, "001", "짱구", 5, "영업부");
		addEmployee(employeeMap, "002", "철수", 5, "개발부");
		addEmployee(employeeMap, "003", "유리", 5, "사업부");
		addEmployee(employeeMap, "004", "훈이", 5, "사업부");

//      조건2. 특정 ID의 사원 정보를 조회

//      조건3. 모든 사원의 정보를 출력
//      entrySet 메소드사용

		System.out.println("\n모든 사원 정보 출력\n");
		for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
			String id = entry.getKey();
			Employee emp = entry.getValue();
			System.out.println("id : " + id);
			System.out.println("이름 : " + emp.getName());
			System.out.println("나이 : " + emp.getAge());
			System.out.println("부서 : " + emp.getDepartment());

		}

//      조건4. 특정 ID의 사원 정보를 삭제
//      조건5. 모든 사원 정보를 삭제
//      clear 메소드 사용
	}

	// 사원 추가 메소드
	static void addEmployee(HashMap<String, Employee> map, String id, String name, int age, String department) {
		Employee employee = new Employee(name, age, department);
		map.put(id, employee);
	}

	// 특정id의 사원정보 추가

	// 특정 ID의 사원 정보를 삭제

	// 모든 사원 정보를 삭제

}
