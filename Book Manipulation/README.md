# Book Manipulation
The district central library needs an application to store book details of their library. The clerk who has all the rights to add a new book,search for any book,display the book details and should update the count of total number of books.

The provided private attributes in Book Class:
* int bookId
* String bookName
* String author
Also provided getters and setters method in book class.

Creating a class Library with the following private attribute:
* ArrayList bookList = new ArrayList();

Also provided the necessary setter and getter methods.
Include the following public methods:
* void addBook(Book bobj) - This method should add the book object to the booklist.
* boolean isEmpty() - This method should return true if the booklist is empty else return false.
* ArrayList<Book> viewAllBooks() - This method should return the list of books maintained in the library.
* ArrayList<Book> viewBooksByAuthor(String author) - This method should return a list of books written by the author passed as argument. When you display an empty list it should print the message "The list is empty".
* int countnoofbook(String bname) - this method should return the count of books with the name passed as argument.
