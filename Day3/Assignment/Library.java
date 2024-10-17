
package Day3.Assignment;

public class Library {
	
	String addBook(String bookTitle){
		
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	void issueBook() {
		
		System.out.println("Book issues successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library obj = new Library();
		System.out.println(obj.addBook("Wings of Power"));
		obj.issueBook();
	}

}
