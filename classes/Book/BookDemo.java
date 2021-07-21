public class BookDemo
{
  public static void main(String[] args)
  {
    Book got      = new Book("George Martin", "Game of Thrones", "Fantasy", 864);
    Book mathBook = new Book("James Stewart", "Calculus", "Math", 1392);
    Book javaBook = new Book("Joel Murach", "Murach's Java Programming", "Programming", 800);

    got.printBookDetails();
    mathBook.printBookDetails();
    javaBook.printBookDetails();
  }
}
