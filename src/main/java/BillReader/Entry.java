package BillReader;

/**
 * @author Aaron
 * 
 *         This Entry class will store every word into the hashtable. My Hash
 *         Table will consist of many entry's in which will be easier to compare
 *         to one of another.
 *
 */
public class Entry {
	// This is the word being stored in the Entry class.
	private String word;

	// This constructor will be able to add an Word, Type-String.
	public Entry(String wordInput) {
		// This cons. will automatically store the word in the instance.
		this.word = wordInput;
	}

	/**
	 * 
	 * Methods
	 */
	// This method will return a string, the word stored in the Entry Class.
	public String getWord() {
		return word;
	}

	// This method will return a boolean, true if the word is empty otherwise false.
	public boolean isItEmpty() {
		if (getWord().isEmpty()) {
			return true;
		}
		return false;

	}

	// To string that will return information about the class.
	@Override
	public String toString() {
		return "Word--" + this.word + "--.";
	}

	// The hashtable that will create the hash value.
	@Override
	public int hashCode() {
		// used a formula online that allowed to create a hash value based on one word.
		int finalI = 0;
		for (int i = 0; i < this.word.length(); i++) {
			finalI += ((this.word.charAt(i)) * Math.pow(31.0, this.word.length() - (i + 1)));
		}
		return Math.abs(finalI);
	}

	public static void main(String[] args) {
		// Testing out any methods created in the class.
		String wordExample = "Bill";
		Entry wordEnteringTest = new Entry(wordExample);
		System.out.println("A word was entered into the Entry class.");
		System.out.println("The word entered is:" + wordEnteringTest.getWord());
		System.out.println("HashValue:" + wordEnteringTest.hashCode());
		System.out.println(wordEnteringTest.toString());
		System.out.println();
		String wordExample2 = "Bill";
		Entry wordEnteringTest2 = new Entry(wordExample2);
		System.out.println("A word was entered into the Entry class.");
		System.out.println("The word entered is:" + wordEnteringTest2.getWord());
		System.out.println("HashValue:" + wordEnteringTest2.hashCode());
		System.out.println(wordEnteringTest2.toString());
		String emptyWord = "";
		Entry emptyWordTest = new Entry(emptyWord);
		System.out.println(emptyWordTest.getWord());
		System.out.println("The word entered is:" + emptyWordTest.getWord());
		System.out.println("Is it empty? :" + emptyWordTest.isItEmpty());
		System.out.println(emptyWordTest.toString());
		System.out.println(emptyWordTest.hashCode());
	}

}
