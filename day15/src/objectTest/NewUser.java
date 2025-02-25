package objectTest;

public class NewUser {
	// 필드
	int userNumber;
	String userName;

	// 생성자
	public NewUser() {
		super();
	}

	public NewUser(int userNumber, String userName) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
	}

	// toString() 오버라이딩
	@Override
	public String toString() {
		return "NewUser [userNumber : " + userNumber + ", userName : " + userName + "]";
	}

	@Override
	public int hashCode() {
		return userNumber;
	}

	@Override
	public boolean equals(Object obj) {
		// 자기자신을 비교할 경우
		if (this == obj) {
			return true;
		}
		// 유저번호가 일치할 경우
		if (obj instanceof NewUser) {
			NewUser newUser = (NewUser) obj;
			if (newUser.userNumber == this.userNumber) {
				return true;
			}
		}
		return false;
	}

//   @Override
//   public boolean equals(Object obj) {
//      // 자기자신과 비교하는 경우
//      if (this == obj) {
//         return true;
//      }
//      // null과 비교하는 경우
//      if (obj == null) {
//         return false;
//      }
//      // instanceof 대신 사용
//      if (getClass() != obj.getClass()) {
//         return false;
//      }
//      // 위의 조건을 모두 만족하지 않고 번호로 비교하는 경우
//      NewUser other = (NewUser) obj;
//      return userNumber == other.userNumber;
//   }

}
