public class Boo {
	public Boo(int i) { }
	public Boo(String S) {}
	public Boo(String S, int i) {}
	
	public static void main(String[] args) {}
}

class SonOfBoo extends Boo {
	public SonOfBoo(int i, int x, int y) {
		super(i, "star");
	}
}