public class PhraseOMatic {
	public static void main (String[] args) {
		// Make 3 sets of words to choose from.
		String[] wordListOne = {"agnostic", "opinionated", "voice activated"};
		String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven"};
		String[] wordListThree = {"framework", "library"};
		
		// Find out how many words are in each list.
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// Generate three random numbers.
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(twoLength);
		int rand3 = randomGenerator.nextInt(threeLength);
		
		// Now building a phrase.
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		// Print out phrase.
		System.out.println("What we need is a " + phrase + "!");
		
	}
}