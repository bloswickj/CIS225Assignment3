/**
 * A class to create books.
 * 
 * @author John Bloswick
 * @version 1.0
 */
public class Book
{
    private String title, authorLastName, authorFirstName, publicationDate;
    private int numPages;
    private double isbnNumber;
    
    public Book(String title, String authorLastName, String authorFirstName, String publicationDate, double isbnNumber, int numPages)
    {
        this.title = title;
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
        this.publicationDate = publicationDate;
        this.isbnNumber = isbnNumber;
        this.numPages = numPages;
        
        if (numPages < 10)
        {
            System.out.println("ERROR: Number of pages is less than 10!");
        }
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthorLastName()
    {
        return authorLastName;
    }
    
    public String getAuthorFirstName()
    {
        return authorFirstName;
    }
    
    public String getPublicationDate()
    {
        return publicationDate;
    }
    
    public double getISBNNumber()
    {
        return isbnNumber;
    }
    
    public int getNumPages()
    {
        return numPages;
    }
    
}


