public class Book
{
  private String author;
  private String title;
  private String genre;
  private int numPages;

  public Book(String author, String title, String genre, int numPages)
  {
    this.author = author;
    this.title = title;
    this.genre = genre;
    this.numPages = numPages;
  }

  public String getAuthor()
  {
    return (this.author);
  }

  public String getTitle()
  {
    return (this.title);
  }

  public String getGenre()
  {
    return (this.genre);
  }

  public int getNumPages()
  {
    return (this.numPages);
  }

  public void printBookDetails()
  {
    System.out.println(this.getTitle());
    System.out.println("by " + this.getAuthor());
    System.out.println("has " + this.getNumPages() + " pages");
    System.out.println("Genre is " + this.getGenre());
    System.out.println();
  }
}
