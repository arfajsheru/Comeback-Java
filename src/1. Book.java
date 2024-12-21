class Book {
  static int totalNoOFBooks;
  String author;
  String title;
  String isbn;
  boolean isBorrowed;

  static{
      totalNoOFBooks = 0;
  }

  {
    totalNoOFBooks++;
  }

  Book(String author, String title, String isbn){
    this.author = author;
    this.title = title;
    this.isbn = isbn;
  }

  Book(String isbn){
    this(isbn, "Unknown", "Unknown");
  }


  static int getTotalNoOFBooks(){
    return totalNoOFBooks;
  }

  void isBorrowed(){
    if(isBorrowed){
      System.out.println(this.title + " book is already borrowed. ");
    } else {
      this.isBorrowed = true;
      System.out.println("Enjoy the book");
    }
  }

  void returnBook(){
    if(isBorrowed){
      this.isBorrowed = false;
      System.out.println("Hope you enjoyed. Please leave a review");
    }else {
      System.out.println(this.title + " book is already in the library");
    }
  }

  public static void main(String[] args) {

    Book java = new Book("1", "java", "James gosling");
    Book javaScript = new Book("2");

    System.out.println("Total No of Books: " + Book.getTotalNoOFBooks());
    java.isBorrowed();
    javaScript.isBorrowed();
    java.isBorrowed();
    java.returnBook();
    javaScript.isBorrowed();
    javaScript.returnBook();


  }



}
