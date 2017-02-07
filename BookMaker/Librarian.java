/**
 * A class to get information about a specific book.
 * 
 * @author John Bloswick 
 * @version 1.0
 */
public class Librarian
{
    public void printBookInformation(Book book)
    {
        printBookTitle(book);
        printBookAuthorLastName(book);
        printBookAuthorFirstName(book);
        printBookPublicationDate(book);
        printBookISBNNumber(book);
        printBookNumPages(book);
    }
    
    public void printBookTitle(Book book)
    {
        String title = book.getTitle();
        System.out.println("Book Title: " + title);
    }
    
    public void printBookAuthorLastName(Book book)
    {
        String authorLastName = book.getAuthorLastName();
        System.out.println("Author Last Name: " + authorLastName);
    }
    
    public void printBookAuthorFirstName(Book book)
    {
        String authorFirstName = book.getAuthorFirstName();
        System.out.println("Author First Name: " + authorFirstName);
    }
    
    public void printBookPublicationDate(Book book)
    {
        String publicationDate = book.getPublicationDate();
        System.out.println("Publication Date: " + publicationDate);
    }
    
    public void printBookISBNNumber(Book book)
    {
        double isbnNumber = book.getISBNNumber();
        System.out.println("ISBN Number: " + isbnNumber);
    }
    
    public void printBookNumPages(Book book)
    {
        int numPages = book.getNumPages();
        System.out.println("Number of Pages: " + numPages);
    }
}
