package musicInter;

public class MusicMain {
	public static void main(String[] args) {
		
		check(new Ballad());
		check(new HipHop());
		check(new Rock());
		
	}

	static void check(Music music) {
		if(music instanceof Ballad) {
			((Ballad) music).onlyBallad();
		}else if(music instanceof HipHop) {
			((HipHop) music).onlyHipHop();
		}else {
			((Rock) music).onlyRock();
		}
		music.mode();
	}
}
