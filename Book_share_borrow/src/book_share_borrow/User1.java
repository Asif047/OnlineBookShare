

// this part of work is done by ID : 13.01.04.047

package book_share_borrow;


public class User1 {
    
    private int BookId;
    private String BookName;
    private String BookISBN;
    private String Author;
    private int AvailableCopy;
    
    public User1(int BookId, String BookName, String BookISBN,String Author, int AvailableCopy)
    {
        this.BookId = BookId;
        this.BookName = BookName;
        this.BookISBN = BookISBN;
        this.Author = Author;
        this.AvailableCopy = AvailableCopy;
    }
    
    public int getBookId()
    {
        return BookId;
    }
    
    public String getBookName()
    {
        return BookName;
    }
    
    public String getBookISBN()
    {
        return BookISBN;
    }
    
    public String getAuthor()
    {
        return Author;
    }
    
    public int getAvailableCopy()
    {
        return AvailableCopy;
    }
}
