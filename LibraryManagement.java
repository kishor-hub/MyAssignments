package weekend.assignments.week1.day2;

public class LibraryManagement {
	
	public static void main(String[] args) {
        // Create an object of the Library class
        Library library = new Library();

        // Call the addBook method
        String bookTitle = library.addBook("Java Programming");
        System.out.println("Book Title: " + bookTitle);

        // Call the issueBook method
        library.issueBook();
    }


}
