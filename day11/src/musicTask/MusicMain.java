package musicTask;

public class MusicMain {
	public static void main(String[] args) {

		// MusicMain 클래스
		// main 메소드
		// check 메소드 => 객체를 확인해서 해당 클래스의 메소드가 모두 출력되도록
		
		check(new Ballad());
		check(new HipHop());
		check(new Rock());
		
	}
	
	static void check(Music music) {
		if(music instanceof Ballad) {
			((Ballad)music).onlyBallad();
		}else if(music instanceof HipHop) {
			((HipHop)music).onlyHipHop();
		}else {
			((Rock)music).onlyRock();
		}
		music.mode();
	}

}
