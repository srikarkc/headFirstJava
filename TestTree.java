import java.util.*; 

public class TestTree {
	public static void main(String[] args) {
		new TestTree().go();
	}
	
	public void go() {
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix Your Body");
		Book b3 = new Book("Finding Emo");
		
		Set<Book> tree = new TreeSet<>((t1,t2)->t1.getTitle().compareTo(t2.getTitle()));
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);
	}
}

class Book {
	private String title;
	public Book(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	public String toString() {
		return title;
	}
}